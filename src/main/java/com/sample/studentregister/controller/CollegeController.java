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

import com.sample.studentregister.dao.CollegeDAO;
import com.sample.studentregister.model.College;
import com.sample.studentregister.service.CollegeService;

@RestController
@RequestMapping("/College")
public class CollegeController {

	@Autowired
	CollegeService collegeService;

	@GetMapping
	public List<College> getAllColleges() {
		return collegeService.getAllCollege();
	}

	@GetMapping("/{Id}")
	public College getCollegeById(@PathVariable("Id") Long collegeId) {
		return collegeService.getCollegeById(collegeId);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public College createCollege(@RequestBody CollegeDAO collegeDao) {
		return collegeService.createCollege(collegeDao);

	}

	@PutMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
	public College updateCollege(@PathVariable("id") Long collegeId, @RequestBody CollegeDAO collegeDao) {
		return collegeService.updateCollege(collegeId, collegeDao);

	}
	
	@DeleteMapping(value="/{id}")
	public College deleteCollege(@PathVariable("id") Long collegeId) {
		return collegeService.deleteCollege(collegeId);
	}

}
