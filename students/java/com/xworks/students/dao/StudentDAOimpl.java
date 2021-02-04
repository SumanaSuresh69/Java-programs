package com.xworks.students.dao;

import java.util.List;

import com.xworks.students.dto.StudentDTO;

public class StudentDAOimpl implements StudentDAO {

	private List<StudentDTO> studentlist;

	public StudentDAOimpl(List<StudentDTO> studentlist) {
		super();
		this.studentlist = studentlist;
	}

	@Override
	public boolean save(StudentDTO dto) {
		System.out.println("invoking add method");
		boolean added = this.studentlist.add(dto);
		System.out.println("added:" + added);
		return added;
	}

	@Override
	public boolean remove(StudentDTO dto) {
		System.out.println("invoking remove method");
		boolean deleted = this.studentlist.remove(dto);
		System.out.println("deleted:" + deleted);
		return deleted;
	}

}
