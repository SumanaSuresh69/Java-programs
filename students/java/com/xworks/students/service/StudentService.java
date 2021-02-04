package com.xworks.students.service;

import com.xworks.students.dto.StudentDTO;

public interface StudentService {

	void validateAndadd(StudentDTO dto);

	void validateAndremove(StudentDTO dto);

}
