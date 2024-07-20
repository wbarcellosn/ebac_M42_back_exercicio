package com.wbarcellosn.exceptions;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = -3605266576057560474L;

	public BadRequestException(String message) {
        super(message);
    }

}
