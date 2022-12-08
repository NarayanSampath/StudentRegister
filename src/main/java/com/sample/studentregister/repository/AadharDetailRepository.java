package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.studentregister.model.AadharDetail;

public interface AadharDetailRepository extends JpaRepository<AadharDetail, Long> {
	
	public AadharDetail findByAadharNumber (Long aadharNumber);
}
