package com.integracao.services.exceptions;

public class DataIntegrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntegrityException(String msg) {
		super(msg);
	}
	
	//recebe a mensagem e outra execeção
	public DataIntegrityException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
