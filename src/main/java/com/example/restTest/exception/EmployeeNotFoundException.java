package com.example.restTest.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String msg) {
			super(msg);
	}

}
