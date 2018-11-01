package com.example.Springbootrest.rest.model;

public class ErrorInfo {
	private String errorUrl;
	private String errorMessage;
	private String errorCode;
	public String getErrorUrl() {
		return errorUrl;
	}
	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public ErrorInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorInfo(String errorUrl, String errorMessage, String errorCode) {
		super();
		this.errorUrl = errorUrl;
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}
	public ErrorInfo(String errorUrl, String errorMessage) {
		super();
		this.errorUrl = errorUrl;
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "errorUrl:" +errorUrl + ", errorMessage:" + errorMessage + ", errorCode:" + errorCode ;
	}
	
	
}
