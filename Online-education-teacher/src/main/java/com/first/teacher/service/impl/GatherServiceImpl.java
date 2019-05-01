package com.first.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addCourse(CurriculumTotal total, List<CurriculumStytem> stytem, List<CurriculumDetails> details) {
		int addCurriculumTotal = totalDao.addCurriculumTotal(total);// 首先添加课程总表
		if (addCurriculumTotal > 0) { // 如果课程总表添加成功之后则进行添加体系表
			CurriculumTotal byTotal = totalDao.getInfoByBean(total); // 首先获取到最后添加的课程总表的ID
			for (CurriculumStytem curr : stytem) {
				curr.setCorriculumStytemTotalId(byTotal.getCurriculumId());// 然后把课程总表ID进行添加到课程体系表
				int addCurriculumStytem = styDao.addCurriculumStytem(curr); // 继续进行添加课程总表
				if (addCurriculumStytem > 0) { // 判断是否添加成功如果添加成功则根据这个实体进行查询
					CurriculumStytem infoByBean = styDao.getInfoByBean(curr);
					for (CurriculumDetails curriculumDetails : details) {
						String make = curriculumDetails.getMake().substring(0, 1);
						if (curr.getMark().equals(make)) {
							curriculumDetails.setCurriculumDetailsStytemId(infoByBean.getCurriculumSystemId());
							int addCurriculumDetails = detaDao.addCurriculumDetails(curriculumDetails);
						}
					}
				}
			}
		}
		return 0;
	}

}
