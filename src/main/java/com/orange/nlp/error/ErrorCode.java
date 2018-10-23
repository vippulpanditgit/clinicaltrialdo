package com.orange.nlp.error;

public enum ErrorCode {
	CONVERSION_TO_JSON(0, "Issue converting to Json object."),
	CONVERSION_FROM_JSON(1, "Issue converting Json string from object"), 
	FILE_STORE_EXCEPTION(1000, "Storing file failed.");

	private final int code;
	private final String description;

	private ErrorCode(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getCode() {
		return code;
	}

	@Override
	public String toString() {
		return code + ": " + description;
	}
}
