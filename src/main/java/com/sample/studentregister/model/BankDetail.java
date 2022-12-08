package com.sample.studentregister.model;

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
//@Table(name="BankDetails_TBL")
public class BankDetail {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.NONE)
	private Long id;
	private Long accountNumber;
	private String accountHolderName;
	@OneToOne(cascade = CascadeType.ALL)
	private Bank bank;
}
