package com.sample.studentregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.studentregister.dao.CollegeDAO;
import com.sample.studentregister.model.Address;
import com.sample.studentregister.model.College;
import com.sample.studentregister.repository.AddressRepository;
import com.sample.studentregister.repository.CollegeRepository;

@Service
public class CollegeService {

	@Autowired
	private CollegeRepository collegeRepo;
	@Autowired
	private AddressRepository addressRepo;
	
	public List<College> getAllCollege() {
		return collegeRepo.findAll();
	}
	
	public College getCollegeById(Long collegeId) {
		return collegeRepo.findById(collegeId).orElse(null);
	}
	
	public College getCollegeByCollegeName(String collegeName) {
		return collegeRepo.findByCollegeName(collegeName);
	}
	
	public College createCollege(CollegeDAO collegeDao) {
		College college = new College();
		
		Address collegeAddress = new Address();

		collegeAddress.setVenue(collegeDao.getVenue());
		collegeAddress.setStreet(collegeDao.getStreet());
		collegeAddress.setLandMark(collegeDao.getLandMark());
		collegeAddress.setCity(collegeDao.getCity());
		collegeAddress.setDistrict(collegeDao.getDistrict());
		collegeAddress.setPincode(collegeDao.getPincode());

		college.setCollegeAddress(addressRepo.save(collegeAddress));
		college.setCollegeName(collegeDao.getCollegeName());
		
		collegeRepo.save(college);
		
		return college;
	}

	public College updateCollege(Long collegeId, CollegeDAO collegeDao) {

		College college = collegeRepo.findById(collegeId).orElse(null);
		if (college != null) {
			
			Address collegeAddress = college.getCollegeAddress();
			collegeAddress.setVenue(collegeDao.getVenue());
			collegeAddress.setStreet(collegeDao.getStreet());
			collegeAddress.setLandMark(collegeDao.getLandMark());
			collegeAddress.setCity(collegeDao.getCity());
			collegeAddress.setDistrict(collegeDao.getDistrict());
			collegeAddress.setPincode(collegeDao.getPincode());
			
			college.setCollegeAddress(addressRepo.save(collegeAddress));
			college.setCollegeName(collegeDao.getCollegeName());
			
			collegeRepo.save(college);
		}
		return college;
	}

	public College deleteCollege(Long collegeId) {
		College college = collegeRepo.findById(collegeId).orElse(null);
		if (college != null) collegeRepo.delete(college);
		return college;
	}
}
