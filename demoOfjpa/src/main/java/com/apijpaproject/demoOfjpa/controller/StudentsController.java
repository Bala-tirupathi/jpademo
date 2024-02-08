package com.apijpaproject.demoOfjpa.controller;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apijpaproject.demoOfjpa.model.StudentsDetails;
import com.apijpaproject.demoOfjpa.response.ResponseHandler;
import com.apijpaproject.demoOfjpa.service.StudentsService;

import jakarta.security.auth.message.MessageInfo;

@RestController
@RequestMapping("/student")
public class StudentsController {
	
	StudentsService studentsService;
	
	public StudentsController(StudentsService studentsService) {
		this.studentsService = studentsService;
	
	}
	
	//Get only particular students details
	@GetMapping("{studentId}")
	public ResponseEntity<Object> getStudentsDetails(@PathVariable("studentId") String studentId) {
		
		
		String message;
		return ResponseHandler.responseHandlerMethod( message= "Requested student details are given here", HttpStatus.OK, studentsService.getStudentsDetails(studentId));
	
	}
	
	//Get all students details
	@GetMapping
	public List<StudentsDetails> getAllStudentsDetails() {
		return studentsService.getStudentsDetails();
	}

	@PostMapping
	public String createStudentsDetails(@RequestBody StudentsDetails studentsDetails) {
		studentsService.createStudentsDetails(studentsDetails);
		return "Successfully created";
}
	@PutMapping
	public String updateStudentsDetails(@RequestBody StudentsDetails studentsDetails) {
		studentsService.updateStudentsDetails(studentsDetails);
		return "Successfully updated";
}
	
	@DeleteMapping({"studentId"})
	public String deleteStudentsDetails(@PathVariable("studentId") String studentId) {
		studentsService.deleteStudentsDetails(studentId);
		return "Successfully Deleted this Students details";
	}
}


