package model;

import java.util.Date;
import java.util.List;

public class StudentInfo {
	private Long id;
	private Date dob;
	private Address address;
	private List<Guardian> guardian;
	private String bloodgroup;
	private String caste;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Guardian> getGuardian() {
		return guardian;
	}
	public void setGuardian(List<Guardian> guardian) {
		this.guardian = guardian;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	
}
