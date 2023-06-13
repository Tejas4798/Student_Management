package com.studentManagement.DTO;

public class StudentSaveDTO {
	
	private String student_Name;
	private String student_address;
	private  long  student_mobile;
	@Override
	public String toString() {
		return "StudentSaveDTO [student_Name=" + student_Name + ", student_address=" + student_address
				+ ", student_mobile=" + student_mobile + "]";
	}
	public StudentSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentSaveDTO(String student_Name, String student_address, long student_mobile) {
		super();
		this.student_Name = student_Name;
		this.student_address = student_address;
		this.student_mobile = student_mobile;
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

}
