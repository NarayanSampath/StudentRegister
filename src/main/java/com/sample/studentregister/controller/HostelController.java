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

import com.sample.studentregister.dao.HostelDAO;
import com.sample.studentregister.model.Hostel;
import com.sample.studentregister.model.Staff;
import com.sample.studentregister.service.HostelService;

@RestController
@RequestMapping("/hostel")
public class HostelController {

	@Autowired
	HostelService hostelService;

	@GetMapping
	public List<Hostel> getAllHostels() {
		return hostelService.getAllHostels();
	}

	@GetMapping("/{Id}")
	public Hostel getHostelById(@PathVariable("Id") Long hostelId) {
		return hostelService.GetHostelById(hostelId);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Hostel createHostel(@RequestBody HostelDAO hostelDao) {
		return hostelService.createHostel(hostelDao);

	}

	@PutMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
	public Hostel updateHostel(@PathVariable("id") Long hostelId, @RequestBody HostelDAO hostelDao) {
		return hostelService.updateHostel(hostelId, hostelDao);

	}
	
	@DeleteMapping(value="/{id}")
	public Hostel deleteHostel(@PathVariable("id") Long hostelId) {
		return hostelService.deleteHostelById(hostelId);
	}

}
