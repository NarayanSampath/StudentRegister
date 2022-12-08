package com.sample.studentregister.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
//@Table(name = "Students_TBL")
public class Student {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private String studentName;
	private String mobileNumber;
	private String whatsappNumber;
	private Long hostelEnrollmentNumber;
	@OneToOne(cascade = CascadeType.ALL)
	private StudentDetail studentDetail;
	@ManyToOne(cascade = CascadeType.ALL)
	private Hostel hostelDetail;
	@ManyToOne(cascade = CascadeType.ALL)
	private College collegeDetail;
	@OneToOne(cascade = CascadeType.ALL)
	private AadharDetail aadharDetail;
	@ManyToOne(cascade = CascadeType.ALL)
	private BankDetail bankDetail;
	@OneToMany(cascade = CascadeType.ALL)
	private List<GuardianDetail> guardianDetails;

}
