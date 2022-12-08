package com.sample.studentregister.repository;

import com.sample.studentregister.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
