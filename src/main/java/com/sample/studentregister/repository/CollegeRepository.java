package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.studentregister.model.College;

public interface CollegeRepository extends JpaRepository<College, Long> {

	public College findByCollegeName(String collegeName);

}
