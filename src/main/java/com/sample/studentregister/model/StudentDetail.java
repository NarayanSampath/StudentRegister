package com.sample.studentregister.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
//@Table(name = "StudentDetails_TBL")
public class StudentDetail {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
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


}
