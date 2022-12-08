package com.sample.studentregister.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
//@Table(name = "AadharDetails_TBL")
public class AadharDetail {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private Long aadharNumber;
	private String mobileNumberInAadhar;
	private String nameInAadhar;
	

}
