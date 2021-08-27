package com.docker.exception;

public class InvalidTransactionReferenceException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -484379201348357033L;

	public InvalidTransactionReferenceException(String errorMessage) {
		super(errorMessage);
	}
}
