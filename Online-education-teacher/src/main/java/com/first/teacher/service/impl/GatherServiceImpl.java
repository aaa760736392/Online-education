package com.first.teacher.service.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import com.first.entity.pojo.CurriculumDetails;
import com.first.entity.pojo.CurriculumStytem;
import com.first.entity.pojo.CurriculumTotal;
import com.first.teacher.service.ICurriculumDetailsServiceDao;
import com.first.teacher.service.ICurriculumStytemServiceDao;
import com.first.teacher.service.ICurriculumTotalServiceDao;
import com.first.teacher.service.IGatherServiceDao;

@Service
public class GatherServiceImpl implements IGatherServiceDao {

	@Autowired
	private ICurriculumTotalServiceDao totalDao;
	@Autowired
	private ICurriculumDetailsServiceDao detaDao;
	@Autowired
	private ICurriculumStytemServiceDao styDao;

	private static final Logger LOGGER = LoggerFactory.getLogger(GatherServiceImpl.class);

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addCourse(CurriculumTotal total) {

		try {

			totalDao.addCurriculumTotal(total);
			CurriculumTotal infoByBean = totalDao.getInfoByBean(total);
			for (CurriculumStytem stytem : total.getStytems()) {
				stytem.setCorriculumStytemTotalId(infoByBean.getCurriculumId());
				styDao.addCurriculumStytem(stytem);
				CurriculumStytem infoByBean2 = styDao.getInfoByBean(stytem);
				for (CurriculumDetails details : stytem.getDetails()) {
					details.setCurriculumDetailsStytemId(infoByBean2.getCurriculumSystemId());
					detaDao.addCurriculumDetails(details);
				}
			}
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int delCourse(CurriculumTotal total) {
		List<CurriculumStytem> stytemList = styDao.getByIdListStytem(total.getCurriculumId());
		for (CurriculumStytem stytem : stytemList) {
			detaDao.delEntity(stytem.getCurriculumSystemId());
		}
		styDao.delEntity(total.getCurriculumId());
		int delEntity = totalDao.delEntity(total.getCurriculumId());
		return delEntity > 0 ? 1 : 0;
	}

	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public boolean updCourse(CurriculumTotal total) {
		try {
			totalDao.updEntity(total);
			for (CurriculumStytem sty : total.getStytems()) {
				styDao.updEntity(sty);
				for (CurriculumDetails datas : sty.getDetails()) {
					detaDao.updEntity(datas);
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean manyFileUplode(List<MultipartFile> files, CurriculumTotal total) throws FileNotFoundException {

		File path = new File(ResourceUtils.getURL("classpath").getPath());
		if (!path.exists())
			path = new File("");
		System.out.println("path:" + path.getAbsolutePath());
		File upload = new File(path.getAbsolutePath(), "src/main/resources/static/images/upload/curriculum");
		if (!upload.exists())
			upload.mkdirs();
		int styIndex = 0;
		int datasIndex = 0;
		for (int i = 0; i < files.size(); i++) {
			MultipartFile file = files.get(i);
			Date date = new Date();
			long time = date.getTime();
			System.out.println(time);
			if (file.isEmpty()) {
				datasIndex++;
				if (datasIndex >= total.getStytems().get(styIndex).getDetails().size()) {
					styIndex++;
					datasIndex = 0;
				}
				continue;
			}
			String fileName = file.getOriginalFilename();
			String sname = fileName.substring(fileName.lastIndexOf("."));
			File dest = new File(upload.getAbsolutePath() + "\\" + time + sname);
			try {
				file.transferTo(dest);
				if (i == 0) {
					total.setCurriculumImg(time + sname);
				} else {
					total.getStytems().get(styIndex).getDetails().get(datasIndex)
							.setCurriculumDetailsPlayback(time + sname);
					datasIndex++;
					if (datasIndex >= total.getStytems().get(styIndex).getDetails().size()) {
						styIndex++;
						datasIndex = 0;
					}
				}

				LOGGER.info("第" + (i + 1) + "个文件上传成功");
			} catch (IOException e) {
				LOGGER.error(e.toString(), e);
			}
		}
		return true;
	}

}
