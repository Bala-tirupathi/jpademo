package com.apijpaproject.demoOfjpa.exception;

public class StudentsDetailsNotFoundException extends RuntimeException{

	
	public StudentsDetailsNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public StudentsDetailsNotFoundException(String message, Throwable cause) {       //Here Throwable is datatype
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	
}
