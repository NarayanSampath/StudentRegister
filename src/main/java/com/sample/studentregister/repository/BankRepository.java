package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.studentregister.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Long> {
	
	public Bank findByIfscCode(String ifscCode);
	public Bank findByMicrCode(Long micrCode);

}
