package com.example.Springbootrest.rest.exception;

import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.example.Springbootrest.rest.model.ErrorInfo;
import com.example.Springbootrest.utils.JsonUtils;

@ControllerAdvice(annotations=RestController.class)
public class MyControllerAdvice {
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private JsonUtils jsonUtils;
	@ExceptionHandler(ServletException.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ResponseEntity<String> requestHandlingNoHandlerFound(HttpServletRequest req, ServletException ex) {
	    Locale locale = LocaleContextHolder.getLocale();
	    String errorMessage = messageSource.getMessage("error.bad.url", null, locale);

	    String errorURL = req.getRequestURL().toString();

	    ErrorInfo errorInfo = new ErrorInfo(errorURL, errorMessage);
	    return new ResponseEntity<String>(jsonUtils.objectToJson(errorInfo), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(RecordNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<String> requestHandlingRecordNotFound(HttpServletRequest req, RecordNotFoundException ex) {
	    Locale locale = LocaleContextHolder.getLocale();
	    String errorMessage = messageSource.getMessage("error.record.not.found", null, locale);

	    String errorURL = req.getRequestURL().toString();

	    ErrorInfo errorInfo = new ErrorInfo(errorURL, errorMessage);
	    return new ResponseEntity<String>(jsonUtils.objectToJson(errorInfo), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<String> requestHandlingRecordNotFound(HttpServletRequest req, StudentNotFoundException ex) {
	    Locale locale = LocaleContextHolder.getLocale();
	    String errorMessage = messageSource.getMessage("error.record.student.not.found", null, locale);

	    String errorURL = req.getRequestURL().toString();

	    ErrorInfo errorInfo = new ErrorInfo(errorURL, errorMessage);
	    return new ResponseEntity<String>(jsonUtils.objectToJson(errorInfo), HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
}
