package com.sample.studentregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.studentregister.dao.StaffDAO;
import com.sample.studentregister.model.Staff;
import com.sample.studentregister.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService staffService;

	@GetMapping
	public List<Staff> getAllStaffs() {
		return staffService.getAllStaffs();
	}

	@GetMapping("/{id}")
	public Staff getHostelById(@PathVariable("id") Long staffId) {
		return staffService.getStaffById(staffId);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Staff createStaff(@RequestBody StaffDAO staffDao) {
		return staffService.createStaff(staffDao);

	}

	@PutMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
	public Staff updateStaff(@PathVariable("id") Long staffId, @RequestBody StaffDAO staffDao) {
		return staffService.updateStaff(staffId, staffDao);

	}
	@DeleteMapping(value="/{id}")
	public Staff deleteStaff(@PathVariable("id") Long staffId) {
		return staffService.deleteStaff(staffId);
	}
	
}
