package com.studentManagement.DTO;

public class StudentUpdateDTO {
	
	private int student_id;
	private String student_Name;
	private String student_address;
	private  long  student_mobile;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public long getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(long student_mobile) {
		this.student_mobile = student_mobile;
	}
	public StudentUpdateDTO(int student_id, String student_Name, String student_address, long student_mobile) {
		super();
		this.student_id = student_id;
		this.student_Name = student_Name;
		this.student_address = student_address;
		this.student_mobile = student_mobile;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_Name=" + student_Name + ", student_address="
				+ student_address + ", student_mobile=" + student_mobile + "]";
	}
	public StudentUpdateDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


}
