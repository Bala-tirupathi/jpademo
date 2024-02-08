package com.apijpaproject.demoOfjpa.response;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	public static ResponseEntity<Object> responseHandlerMethod(String message, HttpStatus httpStatus, Object responseObeject){
		
		Map<String, Object> response = new HashMap<>();
		response.put("message", message);
		response.put("httpStatus", httpStatus);
		response.put("data", responseObeject);
		
		return new ResponseEntity<>(response, httpStatus);
		
	}

}
