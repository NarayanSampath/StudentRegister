package model;

public class Address {
	private Long id;
	private String line1;
	private String line2;
	private String place;
	private String district;
	private String state;
	
	public Long getId() {
		return id;
	}
	public String getLine1() {
		return line1;
	}
	public String getLine2() {
		return line2;
	}
	public String getPlace() {
		return place;
	}
	public String getDistrict() {
		return district;
	}
	public String getState() {
		return state;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setState(String state) {
		this.state = state;
	}

	
	
}
