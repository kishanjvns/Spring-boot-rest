package com.example.Springbootrest.rest.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

//@ControllerAdvice(annotations=RestController.class)
public class RestExceptionMapper {
	/*@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> defaultErrorHandler(RuntimeException ex, WebRequest request) {
		String bodyOfResponse = "This should be application specific";
		return handleExceptionInternal(ex, bodyOfResponse, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	private ResponseEntity<Object> handleExceptionInternal(RuntimeException ex, String bodyOfResponse,
			HttpHeaders httpHeaders, HttpStatus status, WebRequest request) {
		ResponseEntity<Object> entity=new ResponseEntity<Object>(bodyOfResponse, status);
		return entity;
	}*/
}
