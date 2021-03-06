package com.first.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entity.pojo.Member;
import com.first.teacher.idao.IMemberDao;
import com.first.teacher.service.IMemberServiceDao;

@Service
public class MemberServiceImpl implements IMemberServiceDao {

	@Autowired
	private IMemberDao imeDao;

	@Override
	public List<Member> allEntity(int pageNum, int pageSize, Member entity) {
		if (entity == null) {
			return imeDao.selectAll();
		}
		return imeDao.select(entity);
	}

	@Override
	public int updEntity(Member entity) {
		return 0;
	}

}
