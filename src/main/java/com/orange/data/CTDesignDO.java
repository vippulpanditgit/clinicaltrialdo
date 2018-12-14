package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTDesignDO extends CTBaseDO {
	public static final String ALLOCATION= "ALLOCATION";
	public static final String INTERVENTION_MODEL = "INTERVENTION_MODEL";
	public static final String OBSERVATIONAL_MODEL = "OBSERVATIONAL_MODEL";
	public static final String PRIMARY_PURPOSE = "PRIMARY_PURPOSE";
	public static final String TIME_PERSPECTIVE = "TIME_PERSPECTIVE";
	public static final String MASKING = "MASKING";
	public static final String MASKING_DESCRIPTION = "MASKING_DESCRIPTION";
	public static final String INTERVENTION_MODEL_DESCRIPTION = "INTERVENTION_MODEL_DESCRIPTION";
	public static final String SUBJECT_MASKED = "SUBJECT_MASKED";
	public static final String CAREGIVER_MASKED = "CAREGIVER_MASKED";
	public static final String INVESTIGATOR_MASKED = "INVESTIGATOR_MASKED";
	public static final String OUTCOMES_ASSESSOR_MASKED = "OUTCOMES_ASSESSOR_MASKED";
	
	public String allocation;
	public String interventionModel;
	public String observationalModel;
	public String primaryPurpose;
	public String timePerspective;
	public String masking;
	public String maskingDescription;
	public String interventionModelDescription;
	public String subjectMasked;
	public String caregiverMasked;
	public String investigatorMasked;
	public String outcomesAssessorMasked;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = nullable(data[0]);
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			allocation = nullable(data[2]);
		if(data.length>3)
			interventionModel = nullable(data[3]);
		if(data.length>4)
			observationalModel = nullable(data[4]);
		if(data.length>5)
			primaryPurpose = nullable(data[5]);
		if(data.length>6)
			timePerspective = nullable(data[6]);
		if(data.length>7)
			masking = nullable(data[7]);
		if(data.length>8)
			maskingDescription = nullable(data[8]);
		if(data.length>9)
			interventionModelDescription = nullable(data[9]);
		if(data.length>10)
			subjectMasked = nullable(data[10]);
		if(data.length>11)
			caregiverMasked = nullable(data[11]);
		if(data.length>12)
			investigatorMasked = nullable(data[12]);
		if(data.length>13)
			outcomesAssessorMasked = nullable(data[13]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(ALLOCATION, allocation);
		map.put(INTERVENTION_MODEL, interventionModel);
		map.put(OBSERVATIONAL_MODEL, observationalModel);
		map.put(PRIMARY_PURPOSE, primaryPurpose);
		map.put(TIME_PERSPECTIVE, timePerspective);
		map.put(MASKING, masking);
		map.put(MASKING_DESCRIPTION, maskingDescription);
		map.put(INTERVENTION_MODEL_DESCRIPTION, interventionModelDescription);
		map.put(SUBJECT_MASKED, subjectMasked);
		map.put(CAREGIVER_MASKED, caregiverMasked);
		map.put(INVESTIGATOR_MASKED, investigatorMasked);
		map.put(OUTCOMES_ASSESSOR_MASKED, outcomesAssessorMasked);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		allocation = (String)map.get(ALLOCATION);
		interventionModel = (String)map.get(INTERVENTION_MODEL);
		observationalModel = (String)map.get(OBSERVATIONAL_MODEL);
		primaryPurpose = (String)map.get(PRIMARY_PURPOSE);
		timePerspective = (String)map.get(TIME_PERSPECTIVE);
		masking = (String)map.get(MASKING);
		maskingDescription = (String)map.get(MASKING_DESCRIPTION);
		interventionModelDescription = (String)map.get(INTERVENTION_MODEL_DESCRIPTION);
		subjectMasked = (String)map.get(SUBJECT_MASKED);
		caregiverMasked = (String)map.get(CAREGIVER_MASKED);
		investigatorMasked = (String)map.get(INVESTIGATOR_MASKED);
		outcomesAssessorMasked = (String)map.get(OUTCOMES_ASSESSOR_MASKED);
	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		allocation = query.getString(ALLOCATION);
		interventionModel = query.getString(INTERVENTION_MODEL);
		observationalModel = query.getString(OBSERVATIONAL_MODEL);
		primaryPurpose = query.getString(PRIMARY_PURPOSE);
		timePerspective = query.getString(TIME_PERSPECTIVE);
		masking = query.getString(MASKING);
		maskingDescription = query.getString(MASKING_DESCRIPTION);
		interventionModelDescription = query.getString(INTERVENTION_MODEL_DESCRIPTION);
		subjectMasked = query.getString(SUBJECT_MASKED);
		caregiverMasked = query.getString(CAREGIVER_MASKED);
		investigatorMasked = query.getString(INVESTIGATOR_MASKED);
		outcomesAssessorMasked = query.getString(OUTCOMES_ASSESSOR_MASKED);
	}
}
