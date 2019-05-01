package com.first.boot.entity;

public class Name {
	private String name;

	private Age[] ages;

	public String getName() {
		return name;
	}

	public Age[] getAges() {
		return ages;
	}

	public void setAges(Age[] ages) {
		this.ages = ages;
	}

	public void setName(String name) {
		this.name = name;
	}
}
