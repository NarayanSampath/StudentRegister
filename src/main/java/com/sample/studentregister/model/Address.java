package com.sample.studentregister.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Address {

	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private String venue;
	private String landMark;
	private String Street;
	private String city;
	private String district;
	private Long pincode;

}
