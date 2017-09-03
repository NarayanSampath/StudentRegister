package model;

import java.util.List;

public class Score {
	private Long id;
	private List<Subject> marks;
	private Integer total;

	public void setId(Long id) {
		this.id = id;
	}
	public void setMarks(List<Subject> marks) {
		this.marks = marks;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Long getId() {
		return id;
	}
	public List<Subject> getMarks() {
		return marks;
	}
	public Integer getTotal() {
		return total;
	}
	
	
	}
