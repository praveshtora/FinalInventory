package com.cdk.learn.entity;

import javax.persistence.Entity;

@Entity
public class Associate {
	
	@javax.persistence.Id
	private long Id;
	
	private String fullName;



	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	

}
