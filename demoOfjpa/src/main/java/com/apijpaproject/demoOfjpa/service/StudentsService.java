package com.apijpaproject.demoOfjpa.service;

import java.util.List;

import com.apijpaproject.demoOfjpa.model.StudentsDetails;

public interface StudentsService {
	public String createStudentsDetails(StudentsDetails studentsdetails);
	public String updateStudentsDetails(StudentsDetails studentsdetails);
	public String deleteStudentsDetails(String studentId);
	public StudentsDetails getStudentsDetails(String studentId);
	public List<StudentsDetails> getStudentsDetails();

}
