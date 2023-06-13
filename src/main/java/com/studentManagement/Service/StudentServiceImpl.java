package com.studentManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.DTO.StudentSaveDTO;
import com.studentManagement.DTO.StudentUpdateDTO;
import com.studentManagement.DTO.SudentDTO;
import com.studentManagement.Entities.Student;
import com.studentManagement.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	
	
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public String AddStudent(StudentSaveDTO studentSaveDTO) {
		
		
		Student student= new Student(
				studentSaveDTO.getStudent_Name(),
				studentSaveDTO.getStudent_address(),
				studentSaveDTO.getStudent_mobile()
				);
		studentRepo.save(student);
		
		return student.getStudent_Name();
	}

	@Override
	public List<Student> GetallStudents() {
		
		List<Student> getStudents=studentRepo.findAll();	
		return getStudents;
	}

	@Override
	public String updateStudent(StudentUpdateDTO studentUpdateDTO) {
		
		if(studentRepo.existsById(studentUpdateDTO.getStudent_id()))
		{
			Student student=studentRepo.getById(studentUpdateDTO.getStudent_id());
			student.setStudent_address(studentUpdateDTO.getStudent_address());
			student.setStudent_mobile(studentUpdateDTO.getStudent_mobile());
			student.setStudent_Name(studentUpdateDTO.getStudent_Name());
			
			studentRepo.save(student);
			return "updated Succesfully";
					
		}
		else {
			
			return "id not found";
			
		}	
		
		
	}

	@Override
	public String deleteStudent(int id) {
		
		studentRepo.deleteById(id);
		
		// TODO Auto-generated method stub
		return "deleted successfully";
	}

}
