package com.sample.studentregister.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Data
public class Bank {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private String bankName;
	private Long micrCode;
	private String ifscCode;
}
