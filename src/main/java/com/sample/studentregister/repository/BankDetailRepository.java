package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.studentregister.model.BankDetail;

public interface BankDetailRepository extends JpaRepository<BankDetail, Long> {

}
