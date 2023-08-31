package com.jsp.exception;

public class OverAgeException extends RuntimeException{
	@Override
	public String getMessage()
	{
		return "Age limit exceeded";
		
	}
}
