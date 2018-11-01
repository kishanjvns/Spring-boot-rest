package com.example.Springbootrest.rest.exception;

import java.util.Locale;

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

//@ControllerAdvice(annotations=RestController.class)
//@ControllerAdvice
//@RestController
public class RestExceptionMapper {
	@Autowired
	private MessageSource messageSource;
	@Autowired
	private JsonUtils jsonUtils;
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
	@ExceptionHandler(NoHandlerFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ResponseBody
	public ResponseEntity<String> requestHandlingNoHandlerFound(HttpServletRequest req, NoHandlerFoundException ex) {
	    Locale locale = LocaleContextHolder.getLocale();
	    String errorMessage = messageSource.getMessage("error.bad.url", null, locale);

	    String errorURL = req.getRequestURL().toString();

	    ErrorInfo errorInfo = new ErrorInfo(errorURL, errorMessage);
	    return new ResponseEntity<String>(jsonUtils.objectToJson(errorInfo), HttpStatus.BAD_REQUEST);
	}
}
