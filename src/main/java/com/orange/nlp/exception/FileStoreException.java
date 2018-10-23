package com.orange.nlp.exception;

import com.orange.nlp.error.ErrorCode;

public class FileStoreException extends NLPProcessException {

	private static final long serialVersionUID = -7626774760519312452L;
	public FileStoreException(String message, Throwable cause, ErrorCode errorCode) {
		super(message, cause, errorCode);
	}
	public FileStoreException( String message, ErrorCode errorCode) {
		super(message, errorCode);
	}
	public FileStoreException(Throwable cause, ErrorCode errorCode) {
		super(cause, errorCode);
	}
	public FileStoreException(ErrorCode errorCode) {
		super(errorCode);
	}


}
