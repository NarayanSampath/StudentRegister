package model;

import java.util.List;

public class Hostel {
	Long id;
	String title;
	Community community;
	Address address;
	List<Emloyee> hostelEmployees;
	List<Contact> employeeContacts;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Emloyee> getHostelEmployees() {
		return hostelEmployees;
	}
	public void setHostelEmployees(List<Emloyee> hostelEmployees) {
		this.hostelEmployees = hostelEmployees;
	}
	public List<Contact> getEmployeeContacts() {
		return employeeContacts;
	}
	public void setEmployeeContacts(List<Contact> employeeContacts) {
		this.employeeContacts = employeeContacts;
	}
	
}
