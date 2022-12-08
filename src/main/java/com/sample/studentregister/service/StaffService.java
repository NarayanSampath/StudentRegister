package com.sample.studentregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.studentregister.dao.StaffDAO;
import com.sample.studentregister.model.AadharDetail;
import com.sample.studentregister.model.Staff;
import com.sample.studentregister.repository.AadharDetailRepository;
import com.sample.studentregister.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffRepo;
	@Autowired
	private AadharDetailRepository aadharRepo;

	public Staff getStaffById(Long id) {
		return staffRepo.findById(id).orElse(null);
	}

	public List<Staff> getAllStaffs() {
		return staffRepo.findAll();
	}

	public Staff getStaffByAadharNumber(Long aadharNumber) {
		AadharDetail staffAadhar = aadharRepo.findByAadharNumber(aadharNumber);
		return staffRepo.findByAadharDetail(staffAadhar);
	}

	public Staff createStaff(StaffDAO staffDao) {

		Staff newStaff = new Staff();

		newStaff.setAadharDetail(staffDao.getAadhar());
		newStaff.setDesignation(staffDao.getDesignation());
		newStaff.setDoa(staffDao.getDoa());
		newStaff.setDob(staffDao.dob);
		newStaff.setGender(staffDao.getGender());
		newStaff.setHostelDoj(staffDao.getHostelDoj());
		newStaff.setMobileNo(staffDao.getMobileNo());
		newStaff.setName(staffDao.getName());
		newStaff.setWhatsappNo(staffDao.getWhatsappNo());

		return staffRepo.save(newStaff);
	}

	public Staff updateStaff(Long staffId, StaffDAO staffDao) {
		Staff updatedStaff = staffRepo.findById(staffId).orElse(null);
		if (updatedStaff != null) {
			updatedStaff.setAadharDetail(staffDao.getAadhar());
			updatedStaff.setDesignation(staffDao.getDesignation());
			updatedStaff.setDoa(staffDao.getDoa());
			updatedStaff.setDob(staffDao.dob);
			updatedStaff.setGender(staffDao.getGender());
			updatedStaff.setHostelDoj(staffDao.getHostelDoj());
			updatedStaff.setMobileNo(staffDao.getMobileNo());
			updatedStaff.setName(staffDao.getName());
			updatedStaff.setWhatsappNo(staffDao.getWhatsappNo());
			staffRepo.save(updatedStaff);
		}
		return updatedStaff;
	}

	public Staff deleteStaff(Long id) {
		Staff deletedStaff = staffRepo.findById(id).orElse(null);
		if (deletedStaff != null) {
			staffRepo.deleteById(id);
		}
		return deletedStaff;
	}
}
