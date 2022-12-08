package com.sample.studentregister.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
//@Table(name="CollegeDetails_TBL")
public class College {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private String collegeName;
	@OneToOne(cascade = CascadeType.ALL)
	private Address collegeAddress;

}
