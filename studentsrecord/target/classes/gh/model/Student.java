package model;

import java.util.Date;

public class Student {
	
	private Long id;
	private String studentName;
	private 	Integer standard;
	
	private StudentInfo studentInfo;
	private StudSchoolInfo studSchoolInfo;
	private StudHostelInfo studHostelInfo;
	private School school;
	private Result result;
	private Remarks remarks;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStandard() {
		return standard;
	}
	public void setStandard(Integer standard) {
		this.standard = standard;
	}
	public StudentInfo getStudentInfo() {
		return studentInfo;
	}
	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}
	public StudSchoolInfo getStudSchoolInfo() {
		return studSchoolInfo;
	}
	public void setStudSchoolInfo(StudSchoolInfo studSchoolInfo) {
		this.studSchoolInfo = studSchoolInfo;
	}
	public StudHostelInfo getStudHostelInfo() {
		return studHostelInfo;
	}
	public void setStudHostelInfo(StudHostelInfo studHostelInfo) {
		this.studHostelInfo = studHostelInfo;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	public Remarks getRemarks() {
		return remarks;
	}
	public void setRemarks(Remarks remarks) {
		this.remarks = remarks;
	}
	
		
}
