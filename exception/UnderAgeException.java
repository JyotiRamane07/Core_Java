package com.jsp.exception;

public class UnderAgeException extends RuntimeException //Unchecked Exception
{
@Override
public String getMessage()
{
	return "You are under age";
}
}
