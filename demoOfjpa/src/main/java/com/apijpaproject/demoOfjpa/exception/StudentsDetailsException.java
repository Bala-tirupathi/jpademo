package com.apijpaproject.demoOfjpa.exception;

import org.springframework.http.HttpStatus;

public class StudentsDetailsException {
	
	private final String message;                      //The blank final field message may not have been initialized this error will - 
	private final Throwable throwable;                // - occured before constructor creation
	private final HttpStatus httpStatus;
	
	public StudentsDetailsException(String message, Throwable throwable, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
	

}

/* @ControllerAdvice Annotation is used to Globally handle all the Exceptions*/
/* @ExceptionHandler Annotation is used to Handle specific exception and send custom response is back to the client(proper understandable message)*/