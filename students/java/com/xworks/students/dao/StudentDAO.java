package com.xworks.students.dao;

import com.xworks.students.dto.StudentDTO;

public interface StudentDAO {

	boolean save(StudentDTO dto);

	boolean remove(StudentDTO dto);

}
