package com.insuranceapp.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiErrors {

	private LocalDateTime localDateTime;
	private int statusCode;
	private String error;
	private HttpStatus status;
	public ApiErrors() {
		super();
	}
	public ApiErrors(LocalDateTime localDateTime, int statusCode, String error, HttpStatus status) {
		super();
		this.localDateTime = localDateTime;
		this.statusCode = statusCode;
		this.error = error;
		this.status = status;
	}
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ApiErrors [localDateTime=" + localDateTime + ", statusCode=" + statusCode + ", error=" + error
				+ ", status=" + status + "]";
	}
}
