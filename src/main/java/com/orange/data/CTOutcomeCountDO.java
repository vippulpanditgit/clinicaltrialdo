package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class CTOutcomeCountDO extends CTBaseDO {
	public static final String OUTCOME_ID= "OUTCOME_ID";
	public static final String RESULT_GROUP_ID = "RESULT_GROUP_ID";
	public static final String CTGOV_GROUP_CODE = "ctgov_group_code";
	public static final String SCOPE = "scope";
	public static final String UNTIS = "units";
	public static final String COUNT = "count";
	
	public String outputId;
	public String resultGroupId;
	public String ctGovGroupCode;
	public String scope;
	public String count;
	public String units;

	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			outputId = data[2];
		if(data.length>3)
			resultGroupId = data[3];
		if(data.length>4)
			ctGovGroupCode = data[4];
		if(data.length>5)
			scope = data[5];
		if(data.length>6)
			count = data[6];
		if(data.length>7)
			units = data[7];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_ID, outputId);
		map.put(RESULT_GROUP_ID, resultGroupId);
		map.put(CTGOV_GROUP_CODE, ctGovGroupCode);
		map.put(SCOPE, scope);
		map.put(UNTIS, count);
		map.put(COUNT, units);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		outputId = (String)map.get(OUTCOME_ID);
		resultGroupId = (String)map.get(RESULT_GROUP_ID);
		ctGovGroupCode = (String)map.get(CTGOV_GROUP_CODE);
		scope = (String)map.get(SCOPE);
		count = (String)map.get(UNTIS);
		units = (String)map.get(COUNT);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		outputId = query.getString(OUTCOME_ID);
		resultGroupId = query.getString(RESULT_GROUP_ID);
		ctGovGroupCode = query.getString(CTGOV_GROUP_CODE);
		scope = query.getString(SCOPE);
		count = query.getString(UNTIS);
		units = query.getString(COUNT);

	}
}
