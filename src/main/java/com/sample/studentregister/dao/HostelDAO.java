package com.sample.studentregister.dao;

import java.util.List;

import com.sample.studentregister.model.Address;
import com.sample.studentregister.model.Staff;

import lombok.Data;

@Data
public class HostelDAO {
	private String hostelName;
	private List<Staff> cookList;
	private List<Staff> serventList;
	private List<Staff> scavengerList;
	private Staff matron;
	private Address hostelAddress;

}
