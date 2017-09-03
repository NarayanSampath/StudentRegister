package model;

import java.util.Date;
import java.util.List;

public class StudHostelInfo {

	private Long id;
	private Long hostelAdmissionRegistrationNum;
	private Date hostelJoiningDate;
	private List<Contact> hostelContacts;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getHostelAdmissionRegistrationNum() {
		return hostelAdmissionRegistrationNum;
	}
	public void setHostelAdmissionRegistrationNum(Long hostelAdmissionRegistrationNum) {
		this.hostelAdmissionRegistrationNum = hostelAdmissionRegistrationNum;
	}
	public Date getHostelJoiningDate() {
		return hostelJoiningDate;
	}
	public void setHostelJoiningDate(Date hostelJoiningDate) {
		this.hostelJoiningDate = hostelJoiningDate;
	}
	public List<Contact> getHostelContacts() {
		return hostelContacts;
	}
	public void setHostelContacts(List<Contact> hostelContacts) {
		this.hostelContacts = hostelContacts;
	}

}
