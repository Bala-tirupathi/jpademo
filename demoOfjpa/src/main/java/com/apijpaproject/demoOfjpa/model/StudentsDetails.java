package com.apijpaproject.demoOfjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students_details_info")
public class StudentsDetails {
	
	@Id
	private String studentId;
	private String studentName;
	private String studentBranch;
	private String studentAddress;
	private long phoneNumber;
	
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
    public StudentsDetails() {
		
	}
	

	public StudentsDetails(String studentId, String studentName, String studentBranch, String studentAddress,
			long phoneNumber) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentAddress = studentAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}
