package com.orange.data;

import java.util.Map;

public class CTCalculatedValuesDO extends CTBaseDO {
	public static final String NUMBER_OF_FACILITIES= "number_of_facilities";
	public static final String NUMBER_OF_NSAE_SUBJECTS = "number_of_nsae_subjects";
	public static final String NUMBER_OF_SAE_SUBJECTS= "number_of_sae_subjects";
	public static final String REGISTERED_IN_CALENDAR_YEAR = "registered_in_calendar_year";
	public static final String NLM_DOWNLOAD_DATE= "nlm_download_date";
	public static final String ACTUAL_DURATION = "actual_duration";
	public static final String WERE_RESULTS_REPORTED= "were_results_reported";
	public static final String MONTHS_TO_REPORT_RESULTS = "months_to_report_results";
	public static final String HAS_US_FACILITY= "has_us_facility";
	public static final String HAS_SINGLE_FACILITY = "has_single_facility";
	public static final String MINIMUM_AGE_NUM= "minimum_age_num";
	public static final String MAXIMUM_AGE_NUM = "maximum_age_num";
	public static final String MINIMUM_AGE_UNIT= "minimum_age_unit";
	public static final String MAXIMUM_AGE_UNIT = "maximum_age_unit";
	public String numberOfFacilities;
	public String numberOfNSAESubjects;
	public String numberOfSAESubjects;
	public String registeredInCalendarYear;
	public String nlmDownloadDate;
	public String actualDuration;
	public String wereResultsReported;
	public String monthsToReportResults;
	public String hasUSFacility;
	public String hasSingleFacility;
	public String minimumAgeNum;
	public String maximumAgeNum;
	public String minimumAgeUnit;
	public String maximumAgeUnit;
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(this.NUMBER_OF_FACILITIES, this.numberOfFacilities);
		map.put(this.NUMBER_OF_NSAE_SUBJECTS, this.numberOfNSAESubjects);
		map.put(this.NUMBER_OF_SAE_SUBJECTS, this.numberOfSAESubjects);
		map.put(this.REGISTERED_IN_CALENDAR_YEAR, this.registeredInCalendarYear);
		map.put(this.NLM_DOWNLOAD_DATE, this.nlmDownloadDate);
		map.put(this.ACTUAL_DURATION, this.actualDuration);
		map.put(this.WERE_RESULTS_REPORTED, this.wereResultsReported);
		map.put(this.MONTHS_TO_REPORT_RESULTS, this.monthsToReportResults);
		map.put(this.HAS_US_FACILITY, this.hasUSFacility);
		map.put(this.HAS_SINGLE_FACILITY, this.hasSingleFacility);
		map.put(this.MINIMUM_AGE_NUM, this.minimumAgeNum);
		map.put(this.MAXIMUM_AGE_NUM, this.maximumAgeNum);
		map.put(this.MINIMUM_AGE_UNIT, this.minimumAgeUnit);
		map.put(this.MAXIMUM_AGE_UNIT, this.maximumAgeUnit);
		return map;
	}
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			numberOfFacilities = data[2];
		if(data.length>3)
			numberOfNSAESubjects = data[3];
		if(data.length>4)
			numberOfSAESubjects = data[4];
		if(data.length>5)
			registeredInCalendarYear = data[5];
		if(data.length>6)
			nlmDownloadDate = data[6];
		if(data.length>7)
			actualDuration = data[7];
		if(data.length>8)
			wereResultsReported = data[8];
		if(data.length>9)
			monthsToReportResults = data[9];
		if(data.length>10)
			hasUSFacility = data[10];
		if(data.length>11)
			hasSingleFacility = data[11];
		if(data.length>12)
			minimumAgeNum = data[12];
		if(data.length>13)
			maximumAgeNum = data[13];
		if(data.length>14)
			minimumAgeUnit = data[14];
		if(data.length>15)
			maximumAgeUnit = data[15];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		this.numberOfFacilities=(String)map.get(this.NUMBER_OF_FACILITIES);
		this.numberOfNSAESubjects=(String)map.get(this.NUMBER_OF_NSAE_SUBJECTS);
		this.numberOfSAESubjects=(String)map.get(this.NUMBER_OF_SAE_SUBJECTS);
		this.registeredInCalendarYear=(String)map.get(this.REGISTERED_IN_CALENDAR_YEAR );
		this.nlmDownloadDate=(String)map.get(this.NLM_DOWNLOAD_DATE);
		this.actualDuration =(String)map.get(this.ACTUAL_DURATION);
		this.wereResultsReported=(String)map.get(this.WERE_RESULTS_REPORTED );
		this.monthsToReportResults=(String)map.get(this.MONTHS_TO_REPORT_RESULTS );
		this.hasUSFacility= (String)map.get(this.HAS_US_FACILITY );
		this.hasSingleFacility=(String)map.get(this.HAS_SINGLE_FACILITY);
		this.minimumAgeNum=(String)map.get(this.MINIMUM_AGE_NUM);
		this.maximumAgeNum=(String)map.get(this.MAXIMUM_AGE_NUM);
		this.minimumAgeUnit=(String)map.get(this.MINIMUM_AGE_UNIT);
		this.maximumAgeUnit=(String)map.get(this.MAXIMUM_AGE_UNIT);
	}

}
