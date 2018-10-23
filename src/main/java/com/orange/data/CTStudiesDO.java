package com.orange.data;

import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTStudiesDO extends CTBaseDO {
	public static final  String NLM_DOWNLOAD_DATE_DESCRIPTION  = "nlm_download_date_description";
	public static final  String STUDY_FIRST_SUBMITTED_DATE  = "study_first_submitted_date";
	public static final  String RESULTS_FIRST_SUBMITTED_DATE  = "results_first_submitted_date";
	public static final  String DISPOSITION_FIRST_SUBMITTED_DATE  = "disposition_first_submitted_date";
	public static final  String LAST_UPDATE_SUBMITTED_DATE  = "last_update_submitted_date";
	public static final  String STUDY_FIRST_SUBMITTED_QC_DATE  = "study_first_submitted_qc_date";
	public static final  String STUDY_FIRST_POSTED_DATE  = "study_first_posted_date";
	public static final  String STUDY_FIRST_POSTED_DATE_TYPE  = "study_first_posted_date_type";
	public static final  String RESULTS_FIRST_SUBMITTED_QC_DATE  = "results_first_submitted_qc_date";
	public static final  String RESULTS_FIRST_POSTED_DATE  = "results_first_posted_date";
	public static final  String RESULTS_FIRST_POSTED_DATE_TYPE  = "results_first_posted_date_type";
	public static final  String DISPOSITION_FIRST_SUBMITTED_QC_DATE  = "disposition_first_submitted_qc_date";
	public static final  String DISPOSITION_FIRST_POSTED_DATE  = "disposition_first_posted_date";
	public static final  String DISPOSITION_FIRST_POSTED_DATE_TYPE  = "disposition_first_posted_date_type";
	public static final  String LAST_UPDATE_SUBMITTED_QC_DATE  = "last_update_submitted_qc_date";
	public static final  String LAST_UPDATE_POSTED_DATE  = "last_update_posted_date";
	public static final  String LAST_UPDATE_POSTED_DATE_TYPE  = "last_update_posted_date_type";
	public static final  String START_MONTH_YEAR  = "start_month_year";
	public static final  String START_DATE_TYPE  = "start_date_type";
	public static final  String START_DATE  = "start_date";
	public static final  String VERIFICATION_MONTH_YEAR  = "verification_month_year";
	public static final  String VERIFICATION_DATE  = "verification_date";
	public static final  String COMPLETION_MONTH_YEAR  = "completion_month_year";
	public static final  String COMPLETION_DATE_TYPE  = "completion_date_type";
	public static final  String COMPLETION_DATE  = "completion_date";
	public static final  String PRIMARY_COMPLETION_MONTH_YEAR  = "primary_completion_month_year";
	public static final  String PRIMARY_COMPLETION_DATE_TYPE  = "primary_completion_date_type";
	public static final  String PRIMARY_COMPLETION_DATE  = "primary_completion_date";
	public static final  String TARGET_DURATION  = "target_duration";
	public static final  String STUDY_TYPE  = "study_type";
	public static final  String ACRONYM  = "acronym";
	public static final  String BASELINE_POPULATION  = "baseline_population";
	public static final  String BRIEF_TITLE  = "brief_title";
	public static final  String OFFICIAL_TITLE  = "official_title";
	public static final  String OVERALL_STATUS = "overall_status";
	public static final  String LAST_KNOWN_STATUS  = "last_known_status";
	public static final  String PHASE  = "phase";
	public static final  String ENROLLMENT  = "enrollment";
	public static final  String ENROLLMENT_TYPE  = "enrollment_type";
	public static final  String SOURCE  = "source";
	public static final  String LIMITATIONS_AND_CAVEATS  = "limitations_and_caveats";
	public static final  String NUMBER_OF_ARMS  = "number_of_arms";
	public static final  String NUMBER_OF_GROUPS  = "number_of_groups";
	public static final  String WHY_STOPPED  = "why_stopped";
	public static final  String HAS_EXPANDED_ACCESS  = "has_expanded_access";
	public static final  String EXPANDED_ACCESS_TYPE_INDIVIDUAL  = "expanded_access_type_individual";
	public static final  String EXPANDED_ACCESS_TYPE_INTERMEDIATE  = "expanded_access_type_intermediate";
	public static final  String EXPANDED_ACCESS_TYPE_TREATMENT  = "expanded_access_type_treatment";
	public static final  String HAS_DMC  = "has_dmc";
	public static final  String IS_FDA_REGULATED_DRUG  = "is_fda_regulated_drug";
	public static final  String IS_FDA_REGULATED_DEVICE  = "is_fda_regulated_device";
	public static final  String IS_UNAPPROVED_DEVICE  = "is_unapproved_device";
	public static final  String IS_PPSD  = "is_ppsd";
	public static final  String IS_US_EXPORT  = "is_us_export";
	public static final  String BIOSPEC_RETENTION  = "biospec_retention";
	public static final  String BIOSPEC_DESCRIPTION  = "biospec_description";
	public static final  String IPD_TIME_FRAME  = "ipd_time_frame";
	public static final  String IPD_ACCESS_CRITERIA  = "ipd_access_criteria";
	public static final  String IPD_URL  = "ipd_url";
	public static final  String PLAN_TO_SHARE_IPD  = "plan_to_share_ipd";
	public static final  String PLAN_TO_SHARE_IPD_DESCRIPTION  = "plan_to_share_ipd_description";
	public static final  String CREATED_AT  = "created_at";
	public static final  String UPDATED_AT  = "updated_at";


	public String nlm_download_date_description;
	public String study_first_submitted_date;
	public String results_first_submitted_date;
	public String disposition_first_submitted_date;
	public String last_update_submitted_date;
	public String study_first_submitted_qc_date;
	public String study_first_posted_date;
	public String study_first_posted_date_type;
	public String results_first_submitted_qc_date;
	public String results_first_posted_date;
	public String results_first_posted_date_type;
	public String disposition_first_submitted_qc_date;
	public String disposition_first_posted_date;
	public String disposition_first_posted_date_type;
	public String last_update_submitted_qc_date;
	public String last_update_posted_date;
	public String last_update_posted_date_type;
	public String start_month_year;
	public String start_date_type;
	public String start_date;
	public String verification_month_year;
	public String verification_date;
	public String completion_month_year;
	public String completion_date_type;
	public String completion_date;
	public String primary_completion_month_year;
	public String primary_completion_date_type;
	public String primary_completion_date;
	public String target_duration;
	public String study_type;
	public String acronym;
	public String baseline_population;
	public String brief_title;
	public String official_title;
	public String overall_status;
	public String last_known_status;
	public String phase;
	public String enrollment;
	public String enrollment_type;
	public String source;
	public String limitations_and_caveats;
	public String number_of_arms;
	public String number_of_groups;
	public String why_stopped;
	public String has_expanded_access;
	public String expanded_access_type_individual;
	public String expanded_access_type_intermediate;
	public String expanded_access_type_treatment;
	public String has_dmc;
	public String is_fda_regulated_drug;
	public String is_fda_regulated_device;
	public String is_unapproved_device;
	public String is_ppsd;
	public String is_us_export;
	public String biospec_retention;
	public String biospec_description;
	public String ipd_time_frame;
	public String ipd_access_criteria;
	public String ipd_url;
	public String plan_to_share_ipd;
	public String plan_to_share_ipd_description;
	public String created_at;
	public String updated_at;
	public void deserialize(String[] data) {
		id= "1";
		if(data.length>0)
			nct_Id = nullable(data[0]);
		if(data.length>1)
			nlm_download_date_description = nullable(data[1]);
		if(data.length>2)
			study_first_submitted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[2]));
		if(data.length>3)
			results_first_submitted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[3]));
		if(data.length>4)
			disposition_first_submitted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[4]));
		if(data.length>5)
			last_update_submitted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[5]));
		if(data.length>6)
			study_first_submitted_qc_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[6]));
		if(data.length>7)
			study_first_posted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[7]));
		if(data.length>8)
			study_first_posted_date_type = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[8]));
		if(data.length>9)
			results_first_submitted_qc_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[9]));
		if(data.length>10)
			results_first_posted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[10]));
		if(data.length>11)
			results_first_posted_date_type = nullable(data[11]);
		if(data.length>12)
			disposition_first_submitted_qc_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[12]));
		if(data.length>13)
			disposition_first_posted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[13]));
		if(data.length>14)
			disposition_first_posted_date_type = nullable(data[14]);
		if(data.length>15)
			last_update_submitted_qc_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[15]));
		if(data.length>16)
			last_update_posted_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[16]));
		if(data.length>17)
			last_update_posted_date_type = nullable(data[17]);
		if(data.length>18)
			start_month_year = nullable(data[18]);
		if(data.length>19)
			start_date_type = nullable(data[19]);
		if(data.length>20)
			start_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[20]));
		if(data.length>21)
			verification_month_year = nullable(data[21]);
		if(data.length>22)
			verification_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[22]));
		if(data.length>23)
			completion_month_year = nullable(data[23]);
		if(data.length>24)
			completion_date_type = nullable(data[24]);
		if(data.length>25)
			completion_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[25]));
		if(data.length>26)
			primary_completion_month_year = nullable(data[26]);
		if(data.length>27)
			primary_completion_date_type = nullable(data[27]);
		if(data.length>28)
			primary_completion_date = AWSFormatUtil.getAWSFormattedDate("yyyy-MM-dd", nullable(data[28]));
		if(data.length>29)
			target_duration = nullable(data[29]);
		if(data.length>30)
			study_type = nullable(data[30]);
		if(data.length>31)
			acronym = nullable(data[31]);
		if(data.length>32)
			baseline_population = nullable(data[32]);
		if(data.length>33)
			brief_title = nullable(data[33]);
		if(data.length>34)
			official_title = nullable(data[34]);
		if(data.length>35)
			overall_status = nullable(data[35]);
		if(data.length>36)
			last_known_status = nullable(data[36]);
		if(data.length>37)
			phase = nullable(data[37]);
		if(data.length>38)
			enrollment = nullable(data[38]);
		if(data.length>39)
			enrollment_type = nullable(data[39]);
		if(data.length>40)
			source = nullable(data[40]);
		if(data.length>41)
			limitations_and_caveats = nullable(data[41]);
		if(data.length>42)
			number_of_arms = nullable(data[42]);
		if(data.length>43)
			number_of_groups = nullable(data[43]);
		if(data.length>44)
			why_stopped = nullable(data[44]);
		if(data.length>45)
			has_expanded_access = nullable(data[45]);
		if(data.length>46)
			expanded_access_type_individual = nullable(data[46]);
		if(data.length>47)
			expanded_access_type_intermediate = nullable(data[47]);
		if(data.length>48)
			expanded_access_type_treatment = nullable(data[48]);
		if(data.length>49)
			has_dmc = nullable(data[49]);
		if(data.length>50)
			is_fda_regulated_drug = nullable(data[50]);
		if(data.length>51)
			is_fda_regulated_device = nullable(data[51]);
		if(data.length>52)
			is_unapproved_device = nullable(data[52]);
		if(data.length>53)
			is_ppsd = nullable(data[53]);
		if(data.length>54)
			is_us_export = nullable(data[54]);
		if(data.length>55)
			biospec_retention = nullable(data[55]);
		if(data.length>56)
			biospec_description = nullable(data[56]);
		if(data.length>57)
			ipd_time_frame = nullable(data[57]);
		if(data.length>58)
			ipd_access_criteria = nullable(data[58]);
		if(data.length>59)
			ipd_url = nullable(data[59]);
		if(data.length>60)
			plan_to_share_ipd = nullable(data[60]);
		if(data.length>61)
			plan_to_share_ipd_description = nullable(data[61]);
		if(data.length>62)
			created_at = nullable(data[62]);
		if(data.length>63)
			updated_at = nullable(data[63]);
			
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(NLM_DOWNLOAD_DATE_DESCRIPTION, nlm_download_date_description);
		map.put(STUDY_FIRST_SUBMITTED_DATE, study_first_submitted_date);
		map.put(RESULTS_FIRST_SUBMITTED_DATE, results_first_submitted_date);
		map.put(DISPOSITION_FIRST_SUBMITTED_DATE, disposition_first_submitted_date);
		map.put(LAST_UPDATE_SUBMITTED_DATE, last_update_submitted_date);
		map.put(STUDY_FIRST_SUBMITTED_QC_DATE, study_first_submitted_qc_date);
		map.put(STUDY_FIRST_POSTED_DATE, study_first_posted_date);
		map.put(STUDY_FIRST_POSTED_DATE_TYPE, study_first_posted_date_type);
		map.put(RESULTS_FIRST_SUBMITTED_QC_DATE, results_first_submitted_qc_date);
		map.put(RESULTS_FIRST_POSTED_DATE, results_first_posted_date);
		map.put(RESULTS_FIRST_POSTED_DATE_TYPE, results_first_posted_date_type);
		map.put(DISPOSITION_FIRST_SUBMITTED_QC_DATE, disposition_first_submitted_qc_date);
		map.put(DISPOSITION_FIRST_POSTED_DATE, disposition_first_posted_date);
		map.put(DISPOSITION_FIRST_POSTED_DATE_TYPE, disposition_first_posted_date_type);
		map.put(LAST_UPDATE_SUBMITTED_QC_DATE, last_update_submitted_qc_date);
		map.put(LAST_UPDATE_POSTED_DATE, last_update_posted_date);
		map.put(LAST_UPDATE_POSTED_DATE_TYPE, last_update_posted_date_type);
		map.put(START_MONTH_YEAR, start_month_year);
		map.put(START_DATE_TYPE, start_date_type);
		map.put(START_DATE, start_date);
		map.put(VERIFICATION_MONTH_YEAR, verification_month_year);
		map.put(VERIFICATION_DATE, verification_date);
		map.put(COMPLETION_MONTH_YEAR, completion_month_year);
		map.put(COMPLETION_DATE_TYPE, completion_date_type);
		map.put(COMPLETION_DATE, completion_date);
		map.put(PRIMARY_COMPLETION_MONTH_YEAR, primary_completion_month_year);
		map.put(PRIMARY_COMPLETION_DATE_TYPE, primary_completion_date_type);
		map.put(PRIMARY_COMPLETION_DATE, primary_completion_date);
		map.put(TARGET_DURATION, target_duration);
		map.put(STUDY_TYPE, study_type);
		map.put(ACRONYM, acronym);
		map.put(BASELINE_POPULATION, baseline_population);
		map.put(BRIEF_TITLE, brief_title);
		map.put(OFFICIAL_TITLE, official_title);
		map.put(OVERALL_STATUS, overall_status);
		map.put(LAST_KNOWN_STATUS, last_known_status);
		map.put(PHASE, phase);
		map.put(ENROLLMENT, enrollment);
		map.put(ENROLLMENT_TYPE, enrollment_type);
		map.put(SOURCE, source);
		map.put(LIMITATIONS_AND_CAVEATS, limitations_and_caveats);
		map.put(NUMBER_OF_ARMS, number_of_arms);
		map.put(NUMBER_OF_GROUPS, number_of_groups);
		map.put(WHY_STOPPED, why_stopped);
		map.put(HAS_EXPANDED_ACCESS, has_expanded_access);
		map.put(EXPANDED_ACCESS_TYPE_INDIVIDUAL, expanded_access_type_individual);
		map.put(EXPANDED_ACCESS_TYPE_INTERMEDIATE, expanded_access_type_intermediate);
		map.put(EXPANDED_ACCESS_TYPE_TREATMENT, expanded_access_type_treatment);
		map.put(HAS_DMC, has_dmc);
		map.put(IS_FDA_REGULATED_DRUG, is_fda_regulated_drug);
		map.put(IS_FDA_REGULATED_DEVICE, is_fda_regulated_device);
		map.put(IS_UNAPPROVED_DEVICE, is_unapproved_device);
		map.put(IS_PPSD, is_ppsd);
		map.put(IS_US_EXPORT, is_us_export);
		map.put(BIOSPEC_RETENTION, biospec_retention);
		map.put(BIOSPEC_DESCRIPTION, biospec_description);
		map.put(IPD_TIME_FRAME, ipd_time_frame);
		map.put(IPD_ACCESS_CRITERIA, ipd_access_criteria);
		map.put(IPD_URL, ipd_url);
		map.put(PLAN_TO_SHARE_IPD, plan_to_share_ipd);
		map.put(PLAN_TO_SHARE_IPD_DESCRIPTION, plan_to_share_ipd_description);
		map.put(CREATED_AT, created_at);
		map.put(UPDATED_AT, updated_at);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
//		super.deAttributeMap(map);
		nlm_download_date_description=(String)map.get(NLM_DOWNLOAD_DATE_DESCRIPTION);
		study_first_submitted_date=(String)map.get(STUDY_FIRST_SUBMITTED_DATE);
		results_first_submitted_date=(String)map.get(RESULTS_FIRST_SUBMITTED_DATE);
		disposition_first_submitted_date=(String)map.get(DISPOSITION_FIRST_SUBMITTED_DATE);
		last_update_submitted_date=(String)map.get(LAST_UPDATE_SUBMITTED_DATE);
		study_first_submitted_qc_date=(String)map.get(STUDY_FIRST_SUBMITTED_QC_DATE);
		study_first_posted_date=(String)map.get(STUDY_FIRST_POSTED_DATE);
		study_first_posted_date_type=(String)map.get(STUDY_FIRST_POSTED_DATE_TYPE);
		results_first_submitted_qc_date=(String)map.get(RESULTS_FIRST_SUBMITTED_QC_DATE);
		results_first_posted_date=(String)map.get(RESULTS_FIRST_POSTED_DATE);
		results_first_posted_date_type=(String)map.get(RESULTS_FIRST_POSTED_DATE_TYPE);
		disposition_first_submitted_qc_date=(String)map.get(DISPOSITION_FIRST_SUBMITTED_QC_DATE);
		disposition_first_posted_date=(String)map.get(DISPOSITION_FIRST_POSTED_DATE);
		disposition_first_posted_date_type=(String)map.get(DISPOSITION_FIRST_POSTED_DATE_TYPE);
		last_update_submitted_qc_date=(String)map.get(LAST_UPDATE_SUBMITTED_QC_DATE);
		last_update_posted_date=(String)map.get(LAST_UPDATE_POSTED_DATE);
		last_update_posted_date_type=(String)map.get(LAST_UPDATE_POSTED_DATE_TYPE);
		start_month_year=(String)map.get(START_MONTH_YEAR);
		start_date_type=(String)map.get(START_DATE_TYPE);
		start_date=(String)map.get(START_DATE);
		verification_month_year=(String)map.get(VERIFICATION_MONTH_YEAR);
		verification_date=(String)map.get(VERIFICATION_DATE);
		completion_month_year=(String)map.get(COMPLETION_MONTH_YEAR);
		completion_date_type=(String)map.get(COMPLETION_DATE_TYPE);
		completion_date=(String)map.get(COMPLETION_DATE);
		primary_completion_month_year=(String)map.get(PRIMARY_COMPLETION_MONTH_YEAR);
		primary_completion_date_type=(String)map.get(PRIMARY_COMPLETION_DATE_TYPE);
		primary_completion_date=(String)map.get(PRIMARY_COMPLETION_DATE);
		target_duration=(String)map.get(TARGET_DURATION);
		study_type=(String)map.get(STUDY_TYPE);
		acronym=(String)map.get(ACRONYM);
		baseline_population=(String)map.get(BASELINE_POPULATION);
		brief_title=(String)map.get(BRIEF_TITLE);
		official_title=(String)map.get(OFFICIAL_TITLE);
		overall_status=(String)map.get(OVERALL_STATUS);
		last_known_status=(String)map.get(LAST_KNOWN_STATUS);
		phase=(String)map.get(PHASE);
		enrollment=(String)map.get(ENROLLMENT);
		enrollment_type=(String)map.get(ENROLLMENT_TYPE);
		source=(String)map.get(SOURCE);
		limitations_and_caveats=(String)map.get(LIMITATIONS_AND_CAVEATS);
		number_of_arms=(String)map.get(NUMBER_OF_ARMS);
		number_of_groups=(String)map.get(NUMBER_OF_GROUPS);
		why_stopped=(String)map.get(WHY_STOPPED);
		has_expanded_access=(String)map.get(HAS_EXPANDED_ACCESS);
		expanded_access_type_individual=(String)map.get(EXPANDED_ACCESS_TYPE_INDIVIDUAL);
		expanded_access_type_intermediate=(String)map.get(EXPANDED_ACCESS_TYPE_INTERMEDIATE);
		expanded_access_type_treatment=(String)map.get(EXPANDED_ACCESS_TYPE_TREATMENT);
		has_dmc=(String)map.get(HAS_DMC);
		is_fda_regulated_drug=(String)map.get(IS_FDA_REGULATED_DRUG);
		is_fda_regulated_device=(String)map.get(IS_FDA_REGULATED_DEVICE);
		is_unapproved_device=(String)map.get(IS_UNAPPROVED_DEVICE);
		is_ppsd=(String)map.get(IS_PPSD);
		is_us_export=(String)map.get(IS_US_EXPORT);
		biospec_retention=(String)map.get(BIOSPEC_RETENTION);
		biospec_description=(String)map.get(BIOSPEC_DESCRIPTION);
		ipd_time_frame=(String)map.get(IPD_TIME_FRAME);
		ipd_access_criteria=(String)map.get(IPD_ACCESS_CRITERIA);
		ipd_url=(String)map.get(IPD_URL);
		plan_to_share_ipd=(String)map.get(PLAN_TO_SHARE_IPD);
		plan_to_share_ipd_description=(String)map.get(PLAN_TO_SHARE_IPD_DESCRIPTION);
		created_at=(String)map.get(CREATED_AT);
		updated_at=(String)map.get(UPDATED_AT);
	}
}
