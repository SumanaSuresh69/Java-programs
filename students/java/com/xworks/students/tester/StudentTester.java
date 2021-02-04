package com.xworks.students.tester;

import java.util.LinkedList;
import java.util.List;

import com.xworks.students.dao.StudentDAO;
import com.xworks.students.dao.StudentDAOimpl;
import com.xworks.students.dto.StudentDTO;
import com.xworks.students.service.StudentService;
import com.xworks.students.service.StudentServiceimpl;

public class StudentTester {

	public static void main(String[] args) {

		List<StudentDTO> list = new LinkedList<StudentDTO>();

		StudentDAO dao = new StudentDAOimpl(list);

		StudentService service = new StudentServiceimpl(dao);

		StudentDTO dto = new StudentDTO("Sumana", 2, "Bangalore");
		StudentDTO dto1 = new StudentDTO("Supriya", 3, "Mangalore");
		StudentDTO dto2 = new StudentDTO("Suresh", 3, "Mandya");

		service.validateAndadd(dto);
		System.out.println(dto);
		service.validateAndadd(dto1);
		System.out.println(dto1);
		service.validateAndadd(dto2);
		System.out.println(dto2);
		service.validateAndremove(dto);
		System.out.println(dto);
		service.validateAndremove(dto1);
		System.out.println(dto1);
		service.validateAndremove(dto2);
		System.out.println(dto2);

	}

}
