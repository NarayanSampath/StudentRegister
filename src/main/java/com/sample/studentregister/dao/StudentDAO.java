package com.sample.studentregister.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.OneToOne;

import com.sample.studentregister.model.Address;
import com.sample.studentregister.model.College;
import com.sample.studentregister.model.GuardianDetail;

import lombok.Data;

@Data
public class StudentDAO {

	private String studentName;
	private String mobileNumber;
	private String whatsappNumber;
	private Long hostelEnrollmentNumber;
	private String religion;
	private String community;
	private String email;
	private Date studentDob;
	private boolean isDisabled;
	private String disability;
	private Date hostelDoj;
	private String degreeType;
	private Date collegeAdmissionDate;
	private String courseStudying;
	private int studyingYear;
	private Long hostelId;
	private Long collegeId;
	private String collegeName;	
	private Address collegeAddress;
	private Long aadharNumber;
	private String mobileNumberInAadhar;
	private String nameInAadhar;
	private Long accountNumber;
	private String accountHolderName;
	private String bankName;
	private Long micrCode;
	private String ifscCode;
	private List<GuardianDetail> guardianDetails;

}
