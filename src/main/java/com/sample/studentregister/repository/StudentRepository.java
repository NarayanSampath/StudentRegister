package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.studentregister.model.AadharDetail;
import com.sample.studentregister.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	Student findByHostelEnrollmentNumber(Long hostelEnrollmentNumber);

	Student findByAadharDetail(AadharDetail aadharDetail);

}
