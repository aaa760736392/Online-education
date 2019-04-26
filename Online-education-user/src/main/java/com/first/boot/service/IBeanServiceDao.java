package com.first.boot.service;

import java.util.List;

public interface IBeanServiceDao<T> {
	List<T> allEntity();
}
