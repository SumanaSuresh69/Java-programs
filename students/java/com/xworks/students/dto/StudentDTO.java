package com.xworks.students.dto;

public class StudentDTO {

	private String name;
	private int id;
	private String location;

	public StudentDTO() {
		super();
	}

	public StudentDTO(String name, int id, String location) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
	}

	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", id=" + id + ", location=" + location + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
