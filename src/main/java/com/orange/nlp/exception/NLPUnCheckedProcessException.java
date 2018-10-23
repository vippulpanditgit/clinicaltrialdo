package com.orange.nlp.exception;

import com.orange.nlp.error.ErrorCode;

public class NLPUnCheckedProcessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	ErrorCode errorCode;
	
	public NLPUnCheckedProcessException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}
	public NLPUnCheckedProcessException(String message, Throwable cause, ErrorCode errorCode) {
		super(message, cause);
		this.errorCode = errorCode;
	}
	public NLPUnCheckedProcessException( String message, ErrorCode errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public NLPUnCheckedProcessException(Throwable cause, ErrorCode errorCode) {
		super(cause);
		this.errorCode = errorCode;
	}
	
	public ErrorCode getCode() {
		return this.errorCode;
	}
}
