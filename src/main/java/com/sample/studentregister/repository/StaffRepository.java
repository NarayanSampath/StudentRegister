package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.studentregister.model.AadharDetail;
import com.sample.studentregister.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long>{
	
	Staff findByMobileNo(String mobileNo);
	Staff findByWhatsappNo(String whatsappNo);
	Staff findByAadharDetail(AadharDetail aadharDetail);

}
