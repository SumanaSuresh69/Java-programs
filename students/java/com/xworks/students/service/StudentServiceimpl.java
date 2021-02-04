package com.xworks.students.service;

import com.xworks.students.dao.StudentDAO;
import com.xworks.students.dto.StudentDTO;

public class StudentServiceimpl implements StudentService {

	private StudentDAO dao;

	public StudentServiceimpl(StudentDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void validateAndadd(StudentDTO dto) {
		System.out.println("Invoking validate and add method");
		boolean valid = false;
		if (dto != null) {
			String tempName = dto.getName();
			if (tempName != null && !tempName.isEmpty()) {
				System.out.println("Name is valid");
				valid = true;
			} else {
				System.out.println("Name is not valid");
				valid = false;
			}
			if (valid) {
				System.out.println("dto is valid, can save");
				dao.save(dto);
			} else {
			}

		} else {
			System.out.println("dto is null");
		}

	}

	@Override
	public void validateAndremove(StudentDTO dto) {
		System.out.println("invoking validate and remove method");
		boolean valid = false;
		if (dto != null) {
			String tempName = dto.getName();
			if (tempName != null && !tempName.isEmpty()) {
				System.out.println("Name is valid");
				valid = true;
			} else {
				System.out.println("Name is not valid");
				valid = false;
			}
			if (valid) {
				System.out.println("dto is valid, can save");
				dao.save(dto);
			} else {
				System.out.println("dto is invalid, cannot save");
			}
		} else {
			System.out.println("dto is null");
		}
	}
}
