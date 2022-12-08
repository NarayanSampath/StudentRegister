package com.sample.studentregister.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
//@Table(name="GuardianDetails_TBL")
public class GuardianDetail {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long  id;
	private String relation;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> Address;
	private int pincode;
	private String phoneNumber;
}
