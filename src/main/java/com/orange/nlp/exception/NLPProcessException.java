package com.orange.nlp.exception;

import com.orange.nlp.error.ErrorCode;

public class NLPProcessException extends Exception {
	private static final long serialVersionUID = 1L;
	ErrorCode errorCode;
	
	public NLPProcessException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}
	public NLPProcessException(String message, Throwable cause, ErrorCode errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}
	public NLPProcessException( String message, ErrorCode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public NLPProcessException(Throwable cause, ErrorCode errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
	public ErrorCode getCode() {
		return this.errorCode;
	}
}
