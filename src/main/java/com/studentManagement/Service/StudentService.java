package com.studentManagement.Service;

import java.util.List;

import com.studentManagement.DTO.StudentSaveDTO;
import com.studentManagement.DTO.StudentUpdateDTO;
import com.studentManagement.DTO.SudentDTO;
import com.studentManagement.Entities.Student;

public interface StudentService {

	String AddStudent(StudentSaveDTO studentSaveDTO);

	List<Student> GetallStudents();

	String updateStudent(StudentUpdateDTO studentUpdateDTO);

	String deleteStudent(int id);

}
