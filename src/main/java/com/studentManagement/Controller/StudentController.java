package com.studentManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.DTO.StudentSaveDTO;
import com.studentManagement.DTO.StudentUpdateDTO;
import com.studentManagement.DTO.SudentDTO;
import com.studentManagement.Entities.Student;
import com.studentManagement.Service.StudentService;

@RestController
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody StudentSaveDTO StudentSaveDTO) {
		
		String id=studentService.AddStudent(StudentSaveDTO);
		
		return id;
		
	}
	@GetMapping("/GetallStudents")
	public List<Student> GetallStudents() {
		
		List<Student> allstudents=studentService.GetallStudents();
		
		return allstudents;
		
	}
	
	@PostMapping("/Update")
	public String UpdateStudent(@RequestBody StudentUpdateDTO studentUpdateDTO ) {
		
		String update=studentService.updateStudent( studentUpdateDTO );
		
		return update;
		
	}
	
	@DeleteMapping("/Delete")
	public String deleteStudent(@PathVariable int Id) {
		
	String deleted=studentService.deleteStudent(Id);
		return deleted;
	}
	


}
