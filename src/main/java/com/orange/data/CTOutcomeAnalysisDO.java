package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class CTOutcomeAnalysisDO extends CTBaseDO {
	public static final String OUTCOME_ID= "OUTCOME_ID";
	public static final String NON_INFERIORITY_TYPE = "NON_INFERIORITY_TYPE";
	public static final String NON_INFERIORITY_DESCRIPTION = "NON_INFERIORITY_DESCRIPTION";
	public static final String PARAM_TYPE = "PARAM_TYPE";
	public static final String PARAM_VALUE = "PARAM_VALUE";
	public static final String DISPERSION_TYPE = "DISPERSION_TYPE";
	public static final String DISPERSION_VALUE = "DISPERSION_VALUE";
	public static final String P_VALUE_MODIFIER = "P_VALUE_MODIFIER";
	public static final String P_VALUE = "P_VALUE";
	public static final String CI_N_SIDES = "CI_N_SIDES";
	public static final String CI_PERCENT = "CI_PERCENT";
	public static final String CI_LOWER_LIMIT = "CI_LOWER_LIMIT";
	public static final String CI_UPPER_LIMT = "CI_UPPER_LIMT";
	public static final String CI_UPPER_LIMIT_NA_COMMENT = "CI_UPPER_LIMIT_NA_COMMENT";
	public static final String P_VALUE_DESCRIPTION = "P_VALUE_DESCRIPTION";
	public static final String METHOD = "METHOD";
	public static final String METHOD_DESCRIPTION = "METHOD_DESCRIPTION";
	public static final String ESTIMATE_DESCRIPTION = "ESTIMATE_DESCRIPTION";
	public static final String GROUPS_DESCRIPTION = "GROUPS_DESCRIPTION";
	public static final String OTHER_ANALYSIS_DESCRIPTION = "OTHER_ANALYSIS_DESCRIPTION";
	
	public String outcomeId;
	public String nonInferiorityType;
	public String nonInferiorityDescription;
	public String paramType;
	public String paramValue;
	public String dispersionType;
	public String dispersionValue;
	public String pValueModifier;
	public String pValue;
	public String ciNSides;
	public String ciPercent;
	public String ciLowerLimit;
	public String ciUpperLimit;
	public String ciUpperLimitNAComment;
	public String pValueDescription;
	public String method;
	public String methodDescription;
	public String estimateDescription;
	public String groupsDescription;
	public String otherAnalysisDescription;

	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			outcomeId = data[2];
		if(data.length>3)
			nonInferiorityType = data[3];
		if(data.length>4)
			nonInferiorityDescription = data[4];
		if(data.length>5)
			paramType = data[5];
		if(data.length>6)
			paramValue = data[6];
		if(data.length>7)
			dispersionType = data[7];
		if(data.length>8)
			dispersionValue = data[8];
		if(data.length>8)
			pValueModifier = data[8];
		if(data.length>9)
			pValue = data[9];
		if(data.length>10)
			ciNSides = data[10];
		if(data.length>11)
			ciPercent = nullable(data[11]);
		if(data.length>12)
			ciLowerLimit = nullable(data[12]);	
		if(data.length>13)
			ciUpperLimit = nullable(data[13]);	
		if(data.length>14)
			ciUpperLimitNAComment = nullable(data[14]);	
		if(data.length>15)
			pValueDescription = nullable(data[15]);	
		if(data.length>16)
			method = nullable(data[16]);	
		if(data.length>17)
			methodDescription = nullable(data[17]);	
		if(data.length>18)
			estimateDescription = nullable(data[18]);	
		if(data.length>19)
			groupsDescription = nullable(data[19]);	
		if(data.length>20)
			otherAnalysisDescription = nullable(data[20]);	

	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_ID, outcomeId);
		map.put(NON_INFERIORITY_TYPE, nonInferiorityType);
		map.put(NON_INFERIORITY_DESCRIPTION, nonInferiorityDescription);
		map.put(PARAM_TYPE, paramType);
		map.put(PARAM_VALUE, paramValue);
		map.put(DISPERSION_TYPE, dispersionType);
		map.put(DISPERSION_VALUE, dispersionValue);
		map.put(P_VALUE_MODIFIER, pValueModifier);
		map.put(P_VALUE, pValue);
		map.put(CI_N_SIDES, ciNSides);
		map.put(CI_PERCENT, ciPercent);
		map.put(CI_LOWER_LIMIT, ciLowerLimit);
		map.put(CI_UPPER_LIMT, ciUpperLimit);
		map.put(CI_UPPER_LIMIT_NA_COMMENT, ciUpperLimitNAComment);
		map.put(P_VALUE_DESCRIPTION, pValueDescription);
		map.put(METHOD, method);
		map.put(METHOD_DESCRIPTION, methodDescription);
		map.put(ESTIMATE_DESCRIPTION, estimateDescription);
		map.put(GROUPS_DESCRIPTION, groupsDescription);
		map.put(OTHER_ANALYSIS_DESCRIPTION, otherAnalysisDescription);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		nonInferiorityType = (String)map.get(NON_INFERIORITY_TYPE);
		nonInferiorityDescription = (String)map.get(NON_INFERIORITY_DESCRIPTION);
		paramType = (String)map.get(PARAM_TYPE);
		paramValue = (String)map.get(PARAM_VALUE);
		dispersionType = (String)map.get(DISPERSION_TYPE);
		dispersionValue = (String)map.get(DISPERSION_VALUE);
		pValueModifier = (String)map.get(P_VALUE_MODIFIER);
		pValue = (String)map.get(P_VALUE);
		ciNSides = (String)map.get(CI_N_SIDES);
		ciPercent = (String)map.get(CI_PERCENT);
		ciLowerLimit = (String)map.get(CI_LOWER_LIMIT);
		ciUpperLimit = (String)map.get(CI_UPPER_LIMT);
		ciUpperLimitNAComment = (String)map.get(CI_UPPER_LIMIT_NA_COMMENT);
		pValueDescription = (String)map.get(P_VALUE_DESCRIPTION);
		method = (String)map.get(METHOD);
		methodDescription = (String)map.get(METHOD_DESCRIPTION);
		estimateDescription = (String)map.get(ESTIMATE_DESCRIPTION);
		groupsDescription = (String)map.get(GROUPS_DESCRIPTION);
		otherAnalysisDescription = (String)map.get(OTHER_ANALYSIS_DESCRIPTION);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		nonInferiorityType = query.getString(NON_INFERIORITY_TYPE);
		nonInferiorityDescription = query.getString(NON_INFERIORITY_DESCRIPTION);
		paramType = query.getString(PARAM_TYPE);
		paramValue = query.getString(PARAM_VALUE);
		dispersionType = query.getString(DISPERSION_TYPE);
		dispersionValue = query.getString(DISPERSION_VALUE);
		pValueModifier = query.getString(P_VALUE_MODIFIER);
		pValue = query.getString(P_VALUE);
		ciNSides = query.getString(CI_N_SIDES);
		ciPercent = query.getString(CI_PERCENT);
		ciLowerLimit = query.getString(CI_LOWER_LIMIT);
		ciUpperLimit = query.getString(CI_UPPER_LIMT);
		ciUpperLimitNAComment = query.getString(CI_UPPER_LIMIT_NA_COMMENT);
		pValueDescription = query.getString(P_VALUE_DESCRIPTION);
		method = query.getString(METHOD);
		methodDescription = query.getString(METHOD_DESCRIPTION);
		estimateDescription = query.getString(ESTIMATE_DESCRIPTION);
		groupsDescription = query.getString(GROUPS_DESCRIPTION);
		otherAnalysisDescription = query.getString(OTHER_ANALYSIS_DESCRIPTION);		
	}
}
