package model;

import java.util.List;

public class Score {
	private Long id;
	private List<Subject> marks;
	private Integer total;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Subject> getMarks() {
		return marks;
	}
	public void setMarks(List<Subject> marks) {
		this.marks = marks;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
}
