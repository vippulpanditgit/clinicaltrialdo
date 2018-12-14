package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class CTOutcomeAnalysisGroupDO extends CTBaseDO {
	public static final String OUTCOME_ANALYSIS_ID= "OUTCOME_ANALYSIS_ID";
	public static final String RESULT_GROUP_ID = "RESULT_GROUP_ID";
	public static final String CTGOV_GROUP_CODE = "CTGOV_GROUP_CODE";
	
	public String outcomeAnalysisId;
	public String resultGroupId;
	public String ctGovGroupCode;

	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>3)
			outcomeAnalysisId = data[3];
		if(data.length>4)
			resultGroupId = data[4];
		if(data.length>5)
			ctGovGroupCode = data[5];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_ANALYSIS_ID, outcomeAnalysisId);
		map.put(RESULT_GROUP_ID, resultGroupId);
		map.put(CTGOV_GROUP_CODE, ctGovGroupCode);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		outcomeAnalysisId = (String)map.get(OUTCOME_ANALYSIS_ID);
		resultGroupId = (String)map.get(RESULT_GROUP_ID);
		ctGovGroupCode = (String)map.get(CTGOV_GROUP_CODE);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		outcomeAnalysisId = query.getString(OUTCOME_ANALYSIS_ID);
		resultGroupId = query.getString(RESULT_GROUP_ID);
		ctGovGroupCode = query.getString(CTGOV_GROUP_CODE);

	}
}
