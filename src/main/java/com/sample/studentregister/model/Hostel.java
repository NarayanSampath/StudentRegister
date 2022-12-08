package com.sample.studentregister.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
//@Table(name="GuardianDetails_TBL")
public class Hostel {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	
	private String hostelName;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Staff> cookList;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Staff> serventList;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Staff> scavengerList;
	@OneToOne(cascade = CascadeType.ALL)
	private Staff matron;
	@OneToOne(cascade = CascadeType.ALL)
	private Address hostelAddress;
}
