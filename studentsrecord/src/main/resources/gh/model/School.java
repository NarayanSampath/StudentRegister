package model;

public class School {
	
	private Long id;
	private Address address;
	private Long contact;
	private String headMaster;
	public void setId(Long id) {
		this.id = id;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public void setHeadMaster(String headMaster) {
		this.headMaster = headMaster;
	}
	public Long getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	public Long getContact() {
		return contact;
	}
	public String getHeadMaster() {
		return headMaster;
	}

	
}
