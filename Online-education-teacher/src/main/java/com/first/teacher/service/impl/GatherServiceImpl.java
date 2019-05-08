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

}
