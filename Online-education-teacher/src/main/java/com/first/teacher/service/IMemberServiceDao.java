package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.Member;

public interface IMemberServiceDao {

	List<Member> allEntity(int pageNum, int pageSize, Member entity);

	int updEntity(Member entity);

}
