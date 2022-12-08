package com.sample.studentregister.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.studentregister.dao.StudentDAO;
import com.sample.studentregister.model.AadharDetail;
import com.sample.studentregister.model.Bank;
import com.sample.studentregister.model.BankDetail;
import com.sample.studentregister.model.College;
import com.sample.studentregister.model.Hostel;
import com.sample.studentregister.model.Student;
import com.sample.studentregister.model.StudentDetail;
import com.sample.studentregister.repository.AadharDetailRepository;
import com.sample.studentregister.repository.BankDetailRepository;
import com.sample.studentregister.repository.BankRepository;
import com.sample.studentregister.repository.CollegeRepository;
import com.sample.studentregister.repository.GuardianDetailRepository;
import com.sample.studentregister.repository.HostelRepository;
import com.sample.studentregister.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private AadharDetailRepository aadharDetailRepo;
	@Autowired
	private CollegeRepository collegeRepo;
	@Autowired
	private HostelRepository hostelRepo;
	@Autowired
	private BankRepository bankRepo;
	@Autowired
	private BankDetailRepository bankDetailRepo;
	@Autowired
	private GuardianDetailRepository guardianDetailRepo;

	public Student getStudentById(Long id) {
		return studentRepo.findById(id).orElse(null);
	}

	public List<Student> getAllStudent() {
		return studentRepo.findAll();
	}

	public Student getStudentByHostelEnrolmentNumber(Long hostelEnrollmentNumber) {
		return studentRepo.findByHostelEnrollmentNumber(hostelEnrollmentNumber);
	}

	public Student getStudentByAadharNumber(Long aadharNumber) {
		AadharDetail studentAadhar = aadharDetailRepo.findByAadharNumber(aadharNumber);
		return studentRepo.findByAadharDetail(studentAadhar);
	}

	public Student createStudent(StudentDAO studentDao) {
		Student student = new Student();
		AadharDetail aadharDetails = new AadharDetail();
		BankDetail bankDetails = new BankDetail();
		Bank bankByIfsc = bankRepo.findByIfscCode(studentDao.getIfscCode());
		Bank bankByMicr = bankRepo.findByMicrCode(studentDao.getMicrCode());

		aadharDetails.setAadharNumber(studentDao.getAadharNumber());
		aadharDetails.setMobileNumberInAadhar(studentDao.getMobileNumberInAadhar());
		aadharDetails.setNameInAadhar(studentDao.getNameInAadhar());
		aadharDetailRepo.save(aadharDetails);
		student.setAadharDetail(aadharDetails);

		bankDetails.setAccountHolderName(studentDao.getAccountHolderName());
		bankDetails.setAccountNumber(studentDao.getAccountNumber());
		if (bankByIfsc != null || bankByMicr != null) {
			bankDetails.setBank(bankByMicr);
		} else {
			Bank newBank = new Bank();
			newBank.setBankName(studentDao.getBankName());
			newBank.setIfscCode(studentDao.getIfscCode());
			newBank.setMicrCode(studentDao.getMicrCode());
			bankRepo.save(newBank);
			bankDetails.setBank(newBank);
		}
		bankDetailRepo.save(bankDetails);
		student.setBankDetail(bankDetails);

		College college = collegeRepo.findByCollegeName(studentDao.getCollegeName().strip().toLowerCase());
		if (college == null) {
			college = new College();
			college.setCollegeName(studentDao.getCollegeName());
			college.setCollegeAddress(studentDao.getCollegeAddress());
			collegeRepo.save(college);
		}
		student.setCollegeDetail(college);
		student.setGuardianDetails(studentDao.getGuardianDetails());
		Hostel hostel = hostelRepo.findById(studentDao.getHostelId()).orElse(null);
		if (hostel == null) {
			return null;
		} else {
			student.setHostelDetail(hostel);
		}

		student.setMobileNumber(studentDao.getMobileNumber());

		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setCollegeAdmissionDate(studentDao.getCollegeAdmissionDate());
		studentDetail.setCommunity(studentDao.getCommunity());
		studentDetail.setCourseStudying(studentDao.getCourseStudying());
		studentDetail.setDegreeType(studentDao.getDegreeType());
		studentDetail.setDisability(studentDao.getDisability());
		studentDetail.setDisabled(studentDao.isDisabled());
		studentDetail.setEmail(studentDao.getEmail());
		studentDetail.setHostelDoj(studentDao.getHostelDoj());
		studentDetail.setReligion(studentDao.getReligion());
		studentDetail.setStudentDob(studentDao.getStudentDob());
		studentDetail.setStudyingYear(studentDao.getStudyingYear());
		student.setStudentDetail(studentDetail);

		student.setWhatsappNumber(studentDao.getWhatsappNumber());
		student.setStudentName(studentDao.getStudentName());

		studentRepo.save(student);
		return student;
	}

	public Student updateStudent(Long studentId, StudentDAO studentDao) {
		Student student = studentRepo.findById(studentId).orElse(null);
		if (student != null) {
			AadharDetail aadharDetails = new AadharDetail();
			BankDetail bankDetails = new BankDetail();
			Bank bankByIfsc = bankRepo.findByIfscCode(studentDao.getIfscCode());
			Bank bankByMicr = bankRepo.findByMicrCode(studentDao.getMicrCode());

			aadharDetails.setAadharNumber(studentDao.getAadharNumber());
			aadharDetails.setMobileNumberInAadhar(studentDao.getMobileNumberInAadhar());
			aadharDetails.setNameInAadhar(studentDao.getNameInAadhar());
			student.setAadharDetail(aadharDetails);

			bankDetails.setAccountHolderName(studentDao.getAccountHolderName());
			bankDetails.setAccountNumber(studentDao.getAccountNumber());
			if (bankByIfsc != null || bankByMicr != null) {
				bankDetails.setBank(bankByMicr);
			} else {
				Bank newBank = new Bank();
				newBank.setBankName(studentDao.getBankName());
				newBank.setIfscCode(studentDao.getIfscCode());
				newBank.setMicrCode(studentDao.getMicrCode());
				bankDetails.setBank(newBank);
			}
			student.setBankDetail(bankDetails);

			College college = collegeRepo.findByCollegeName(studentDao.getCollegeName().strip().toLowerCase());
			if (college == null) {
				college = new College();
				college.setCollegeName(studentDao.getCollegeName());
				college.setCollegeAddress(studentDao.getCollegeAddress());
			}
			student.setCollegeDetail(college);

			student.setGuardianDetails(studentDao.getGuardianDetails());
			Hostel hostel = hostelRepo.findById(studentDao.getHostelId()).orElse(null);
			if (hostel == null) {
				return null;
			} else {
				student.setHostelDetail(hostel);
			}

			student.setMobileNumber(studentDao.getMobileNumber());

			StudentDetail studentDetail = new StudentDetail();
			studentDetail.setCollegeAdmissionDate(studentDao.getCollegeAdmissionDate());
			studentDetail.setCommunity(studentDao.getCommunity());
			studentDetail.setCourseStudying(studentDao.getCourseStudying());
			studentDetail.setDegreeType(studentDao.getDegreeType());
			studentDetail.setDisability(studentDao.getDisability());
			studentDetail.setDisabled(studentDao.isDisabled());
			studentDetail.setEmail(studentDao.getEmail());
			studentDetail.setHostelDoj(studentDao.getHostelDoj());
			studentDetail.setReligion(studentDao.getReligion());
			studentDetail.setStudentDob(studentDao.getStudentDob());
			studentDetail.setStudyingYear(studentDao.getStudyingYear());
			student.setStudentDetail(studentDetail);

			student.setWhatsappNumber(studentDao.getWhatsappNumber());
			student.setStudentName(studentDao.getStudentName());

			studentRepo.save(student);
		}
		return student;
	}

	public Student deleteStudent(Long studentId) {

		Student student = studentRepo.findById(studentId).orElse(null);
		if (student != null) {
			studentRepo.delete(student);
		}
		return student;
	}

}
