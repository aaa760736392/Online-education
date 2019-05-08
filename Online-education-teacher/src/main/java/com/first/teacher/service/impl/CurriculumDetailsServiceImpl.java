package com.first.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.first.entity.pojo.CurriculumDetails;
import com.first.teacher.idao.ICurriculumDetailsDao;
import com.first.teacher.service.ICurriculumDetailsServiceDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class CurriculumDetailsServiceImpl implements ICurriculumDetailsServiceDao {

	@Autowired
	private ICurriculumDetailsDao detaDao;

	@Override
	public List<CurriculumDetails> allEntity(int pageNum, int pageSize, CurriculumDetails entity) {

		if (entity == null) {
			Page<CurriculumDetails> page = PageHelper.startPage(pageNum, pageSize)
					.doSelectPage(() -> detaDao.selectAll());
			return page;
		}
		Page<CurriculumDetails> page = PageHelper.startPage(pageNum, pageSize)
				.doSelectPage(() -> detaDao.select(entity));
		return page;

	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int addCurriculumDetails(CurriculumDetails details) {
		return detaDao.insert(details);
	}

	@Override
	public List<CurriculumDetails> getByIdListDetails(Integer id) {
		return detaDao.getByIdListDetails(id);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int updEntity(CurriculumDetails entity) {
		return detaDao.updateByPrimaryKeySelective(entity);
	}

	@Override
	@Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int delEntity(Integer id) {
		return detaDao.delByIdDetails(id);
	}

}
