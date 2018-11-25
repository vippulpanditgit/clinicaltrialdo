package com.orange.data;

public enum StudyStatus {
	AVAILABLE("Available"), 
	WITHDRAWN("Withdrawn"), 
	WITHHELD("Withheld"), 
	TEMP_NOT_AVAILABLE("Temporarily not available"),
	RECRUITING("Recruiting"), 
	ACTIVE_NOT_RECRUITING("Active, not recruiting"), 
	NOT_YET_RECRUITING("Not yet recruiting"),
	NO_LONGER_AVAILABLE("No longer available"), 
	SUSPENDED("Suspended"), 
	ENROLLING_BY_INVITATION("Enrolling by invitation"),
	APPROVED_FOR_MARKET("Approved for marketing"), 
	UNKOWN_STATUS("Unknown status"), 
	COMPLETED("Completed"),
	TERMINATED("Terminated");
	private final String status;
	StudyStatus(String status) {
		this.status = status;
	}
	public String getNativeStatus() {
		return status;
	}
}
