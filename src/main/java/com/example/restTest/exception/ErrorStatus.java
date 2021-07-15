package com.example.restTest.exception;

import java.util.Date;

public class ErrorStatus {

		  public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

		private Date timestamp;
		  private String message;
		  private String details;
		  private int errorCode;
		  
		  public ErrorStatus(Date timestamp, String message, String details) {
		    super();
		    this.timestamp = timestamp;
		    this.message = message;
		    this.details = details;
		  }
}
