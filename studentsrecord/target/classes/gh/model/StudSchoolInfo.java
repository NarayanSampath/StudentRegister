package model;

import java.util.Date;
import java.util.List;

public class StudSchoolInfo{
	
	private Long id;
	private Long schoolAdmissionNum;
	private Date schoolJoiningDate;
	private List<Contact> schoolContacts;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSchoolAdmissionNum() {
		return schoolAdmissionNum;
	}
	public void setSchoolAdmissionNum(Long schoolAdmissionNum) {
		this.schoolAdmissionNum = schoolAdmissionNum;
	}
	public Date getSchoolJoiningDate() {
		return schoolJoiningDate;
	}
	public void setSchoolJoiningDate(Date schoolJoiningDate) {
		this.schoolJoiningDate = schoolJoiningDate;
	}
	public List<Contact> getSchoolContacts() {
		return schoolContacts;
	}
	public void setSchoolContacts(List<Contact> schoolContacts) {
		this.schoolContacts = schoolContacts;
	}
	
}
