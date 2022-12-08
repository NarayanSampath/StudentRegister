package com.sample.studentregister.dao;

import java.util.Date;

import com.sample.studentregister.model.AadharDetail;

import lombok.Getter;

@Getter
public class StaffDAO {

	public String name;
	public String designation;
	public String gender;
	public Date dob;
	public Date doa;
	public Date hostelDoj;
	public String mobileNo;
	public String whatsappNo;
	public AadharDetail aadhar;

}
