package com.sample.studentregister.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.studentregister.model.Hostel;

public interface HostelRepository extends JpaRepository<Hostel, Long> {

}
