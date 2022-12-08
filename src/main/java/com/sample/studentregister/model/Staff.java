package com.sample.studentregister.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
//@Table(name = "AadharDetails_TBL")
public class Staff {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	public Long id;
	public String name;
	public String designation;
	public String gender;
	public Date dob;
	public Date doa;
	public Date hostelDoj;
	public String mobileNo;
	public String whatsappNo;
	@OneToOne(cascade = CascadeType.ALL)
	public AadharDetail aadharDetail;

}
