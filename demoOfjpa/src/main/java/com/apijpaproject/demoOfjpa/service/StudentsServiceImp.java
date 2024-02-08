package com.apijpaproject.demoOfjpa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.apijpaproject.demoOfjpa.exception.StudentsDetailsNotFoundException;
import com.apijpaproject.demoOfjpa.model.StudentsDetails;
import com.apijpaproject.demoOfjpa.reposiotry.StudentsDetailsRepository;

@Service
public class StudentsServiceImp implements StudentsService{
	
	StudentsDetailsRepository studentsDetailsRepository;

	public StudentsServiceImp(StudentsDetailsRepository studentsDetailsRepository) {
		this.studentsDetailsRepository = studentsDetailsRepository;
	}

	@Override
	public String createStudentsDetails(StudentsDetails studentsdetails) {
		studentsDetailsRepository.save(studentsdetails);
		return "Successfully done";
	}

	@Override
	public String updateStudentsDetails(StudentsDetails studentsdetails) {
		studentsDetailsRepository.save(studentsdetails);
		return "Successfully done";
	}
	
	@Override
	public String deleteStudentsDetails(String studentId) {
		studentsDetailsRepository.deleteById(studentId);
		return "Successfully done";
	}

//	@Override
//	public String deleteStudentsDetails(String studentId) {
//		studentsDetailsRepository.deleteById(studentId);
//		return "Successfully done";
//	}

	@Override
	public StudentsDetails getStudentsDetails(String studentId) {
//		studentsDetailsRepository.findById(studentId).get();
//		return "Successfully done";
		if(studentsDetailsRepository.findById(studentId).isEmpty())
			throw new StudentsDetailsNotFoundException("Requested students details doesn't exists");
		return studentsDetailsRepository.findById(studentId).get();
		
	}

	@Override
	public List<StudentsDetails> getStudentsDetails() {
		return studentsDetailsRepository.findAll();
	}
	

}
