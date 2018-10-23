package com.orange.nlp.exception;

import com.orange.nlp.error.ErrorCode;

public class JsonConversionException extends NLPProcessException {

	public JsonConversionException(ErrorCode errorCode) {
		super(errorCode);
	}
	public JsonConversionException(String message, Throwable cause, ErrorCode errorCode) {
		super(message, cause, errorCode);
	}
	public JsonConversionException( String message, ErrorCode errorCode) {
		super(message, errorCode);
	}
	public JsonConversionException(Throwable cause, ErrorCode errorCode) {
		super(cause, errorCode);
	}
}
