package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class CTOutcomeMeasurementDO extends CTBaseDO {
	public static final String OUTCOME_ID= "OUTCOME_ID";
	public static final String RESULT_GROUP_ID = "RESULT_GROUP_ID";
	public static final String CTGOV_GROUP_CODE = "CTGOV_GROUP_CODE";
	public static final String CLASSIFICATION = "CLASSIFICATION";
	public static final String CATEGORY = "CATEGORY";
	public static final String TITLE = "TITLE";
	public static final String DESCRIPTION = "DESCRIPTION";
	public static final String UNITS = "UNITS";
	public static final String PARAM_TYPE = "PARAM_TYPE";
	public static final String PARAM_VALUE = "PARAM_VALUE";
	public static final String PARAM_VALUE_NUM = "PARAM_VALUE_NUM";
	public static final String DISPERSION_TYPE = "DISPERSION_TYPE";
	public static final String DISPERSION_VALUE = "DISPERSION_VALUE";
	public static final String DISPERSION_VALUE_NUM = "DISPERSION_VALUE_NUM";
	public static final String DISPERSION_LOWER_LIMIT = "DISPERSION_LOWER_LIMIT";
	public static final String DISPERSION_UPPER_LIMIT = "DISPERSION_UPPER_LIMIT";
	public static final String EXPLANATION_OF_NA = "EXPLANATION_OF_NA";
	
	public String outcomeId;
	public String resultGroupId;
	public String ctGovGroupCode;
	public String classification;
	public String category;
	public String title;
	public String description;
	public String units;
	public String paramType;
	public String paramValue;
	public String paramValueNum;
	public String dispersionType;
	public String dispersionValue;
	public String dispersionValueNum;
	public String dispersionLowerLimit;
	public String dispersionUpperLimit;
	public String explainationOfNA;

	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			outcomeId = data[2];
		if(data.length>3)
			resultGroupId = data[3];
		if(data.length>4)
			ctGovGroupCode = data[4];
		if(data.length>5)
			classification = data[5];
		if(data.length>6)
			category = data[6];
		if(data.length>7)
			title = data[7];
		if(data.length>8)
			description = data[8];
		if(data.length>9)
			units = data[9];
		if(data.length>10)
			paramType = data[10];
		if(data.length>11)
			paramValue = nullable(data[11]);
		if(data.length>12)
			paramValueNum = nullable(data[12]);	
		if(data.length>13)
			dispersionType = nullable(data[13]);	
		if(data.length>14)
			dispersionValue = nullable(data[14]);	
		if(data.length>15)
			dispersionValueNum = nullable(data[15]);	
		if(data.length>16)
			dispersionLowerLimit = nullable(data[16]);	
		if(data.length>17)
			dispersionUpperLimit = nullable(data[17]);	
		if(data.length>18)
			explainationOfNA = nullable(data[18]);	
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_ID,outcomeId);
		map.put(RESULT_GROUP_ID ,resultGroupId);
		map.put(CTGOV_GROUP_CODE ,ctGovGroupCode);
		map.put(CLASSIFICATION ,classification);
		map.put(CATEGORY ,category);
		map.put(TITLE ,title);
		map.put(DESCRIPTION ,description);
		map.put(UNITS ,units);
		map.put(PARAM_TYPE ,paramType);
		map.put(PARAM_VALUE ,paramValue);
		map.put(PARAM_VALUE_NUM ,paramValueNum);
		map.put(DISPERSION_TYPE ,dispersionType);
		map.put(DISPERSION_VALUE ,dispersionValue);
		map.put(DISPERSION_VALUE_NUM ,dispersionValueNum);
		map.put(DISPERSION_LOWER_LIMIT ,dispersionLowerLimit);
		map.put(DISPERSION_UPPER_LIMIT ,dispersionUpperLimit);
		map.put(EXPLANATION_OF_NA ,explainationOfNA);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		outcomeId = (String)map.get(OUTCOME_ID);
		resultGroupId = (String)map.get(RESULT_GROUP_ID);
		ctGovGroupCode = (String)map.get(CTGOV_GROUP_CODE);
		classification = (String)map.get(CLASSIFICATION);
		category = (String)map.get(CATEGORY);
		title = (String)map.get(TITLE);
		description = (String)map.get(DESCRIPTION);
		units = (String)map.get(UNITS);
		paramType = (String)map.get(PARAM_TYPE);
		paramValue = (String)map.get(PARAM_VALUE);
		paramValueNum = (String)map.get(PARAM_VALUE_NUM);
		dispersionType = (String)map.get(DISPERSION_TYPE);
		dispersionValue = (String)map.get(DISPERSION_VALUE);
		dispersionValueNum = (String)map.get(DISPERSION_VALUE_NUM);
		dispersionLowerLimit = (String)map.get(DISPERSION_LOWER_LIMIT);
		dispersionUpperLimit = (String)map.get(DISPERSION_UPPER_LIMIT);
		explainationOfNA = (String)map.get(EXPLANATION_OF_NA);	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		outcomeId = query.getString(OUTCOME_ID);
		resultGroupId = query.getString(RESULT_GROUP_ID);
		ctGovGroupCode = query.getString(CTGOV_GROUP_CODE);
		classification = query.getString(CLASSIFICATION);
		category = query.getString(CATEGORY);
		title = query.getString(TITLE);
		description = query.getString(DESCRIPTION);
		units = query.getString(UNITS);
		paramType = query.getString(PARAM_TYPE);
		paramValue = query.getString(PARAM_VALUE);
		paramValueNum = query.getString(PARAM_VALUE_NUM);
		dispersionType = query.getString(DISPERSION_TYPE);
		dispersionValue = query.getString(DISPERSION_VALUE);
		dispersionValueNum = query.getString(DISPERSION_VALUE_NUM);
		dispersionLowerLimit = query.getString(DISPERSION_LOWER_LIMIT);
		dispersionUpperLimit = query.getString(DISPERSION_UPPER_LIMIT);
		explainationOfNA = query.getString(EXPLANATION_OF_NA);	
	}
}
