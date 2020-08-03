package com.studentinfo.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {
	
	@Id
	private String sId;
	private String sName;
	private String email;


	public Student() {
		
	}

	public Student(String sId, String sName, String email) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.email = email;
	}
	

	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
