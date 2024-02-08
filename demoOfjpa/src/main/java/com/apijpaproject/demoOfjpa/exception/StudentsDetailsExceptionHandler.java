package com.apijpaproject.demoOfjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice                                // Its is responsible to handle any exception from globally
public class StudentsDetailsExceptionHandler {
	
	@ExceptionHandler(value = {StudentsDetailsNotFoundException.class})
	public ResponseEntity<Object> handleStudentsDetailsNotFoundException(StudentsDetailsNotFoundException studentsDetailsNotFoundException){
		StudentsDetailsException studentsDetailsException = new StudentsDetailsException(
				studentsDetailsNotFoundException.getMessage(),
				studentsDetailsNotFoundException.getCause(),
				HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(studentsDetailsException, HttpStatus.NOT_FOUND);
	}

}
