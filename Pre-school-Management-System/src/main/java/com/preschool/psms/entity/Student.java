package com.preschool.psms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="std_reg_no" )
	private Long std_reg_No;
	
	@Column(name="std_initial_name")
	private String std_initialName;
	
	@Column(name="std_full_name",nullable=false)
	private String std_fullName;
	
	@Column(name="std_dob",nullable=false)
	private String std_DOB;
	
	@Column(name="std_gender")
	private String std_gender;
	
	@Column(name="std_present_adress", nullable=false)
	private String std_presentAddress;
	
	@Column(name="std_special_attention")
	private String std_specialAttention;
	
	@Column(name="std_class")
	private String std_class;
	
	public Student() {
		
	}
	

	public Student(Long std_reg_No, String std_initialName, String std_fullName, String std_DOB, String std_gender,
			String std_presentAddress, String std_specialAttention, String std_class) {
		super();
		this.std_reg_No = std_reg_No;
		this.std_initialName = std_initialName;
		this.std_fullName = std_fullName;
		this.std_DOB = std_DOB;
		this.std_gender = std_gender;
		this.std_presentAddress = std_presentAddress;
		this.std_specialAttention = std_specialAttention;
		this.std_class = std_class;
	}


	public Long getStd_reg_No() {
		return std_reg_No;
	}
	public void setStd_reg_No(Long std_reg_No) {
		this.std_reg_No = std_reg_No;
	}
	public String getStd_initialName() {
		return std_initialName;
	}
	public void setStd_initialName(String std_initialName) {
		this.std_initialName = std_initialName;
	}
	public String getStd_fullName() {
		return std_fullName;
	}
	public void setStd_fullName(String std_fullName) {
		this.std_fullName = std_fullName;
	}
	public String getStd_DOB() {
		return std_DOB;
	}
	public void setStd_DOB(String std_DOB) {
		this.std_DOB = std_DOB;
	}
	public String getStd_gender() {
		return std_gender;
	}
	public void setStd_gender(String std_gender) {
		this.std_gender = std_gender;
	}
	public String getStd_presentAddress() {
		return std_presentAddress;
	}
	public void setStd_presentAddress(String std_presentAddress) {
		this.std_presentAddress = std_presentAddress;
	}
	public String getStd_specialAttention() {
		return std_specialAttention;
	}
	public void setStd_specialAttention(String std_specialAttention) {
		this.std_specialAttention = std_specialAttention;
	}
	public String getStd_class() {
		return std_class;
	}
	public void setStd_class(String std_class) {
		this.std_class = std_class;
	}
	
	
	

}
