package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class Resourcenotfound extends RuntimeException {
	
	@SuppressWarnings("unused")
	private static final long serialversionUID=1L;
	
	public Resourcenotfound(String s)
	{
		super(s);
	}

}
