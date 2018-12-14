package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTDesignGroupInterventionDO extends CTBaseDO {
	public static final String DESIGN_GROUP_ID = "DESIGN_GROUP_ID";
	public static final String INTERVENTION_ID = "INTERVENTION_ID";
	
	public String designGroupId;
	public String interventionId;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = nullable(data[0]);
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			designGroupId = nullable(data[2]);
		if(data.length>3)
			interventionId = nullable(data[3]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(DESIGN_GROUP_ID,designGroupId);
		map.put(INTERVENTION_ID,interventionId);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		designGroupId=(String)map.get(DESIGN_GROUP_ID);
		interventionId=(String)map.get(INTERVENTION_ID);
	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		designGroupId=query.getString(DESIGN_GROUP_ID);
		interventionId=query.getString(INTERVENTION_ID);
	}
}
