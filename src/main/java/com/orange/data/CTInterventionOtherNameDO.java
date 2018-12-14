package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTInterventionOtherNameDO extends CTBaseDO {
	public static final String INTERVENTION_ID="INTERVENTION_ID";
	public static final String NAME = "NAME";
	public String name;
	public String interventionId;
		
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			interventionId = nullable(data[2]);
		if(data.length>3)
			name = nullable(data[3]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(INTERVENTION_ID, interventionId);
		map.put(NAME, name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		interventionId = (String)map.get(INTERVENTION_ID);
		name = (String)map.get(NAME);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		interventionId = query.getString(INTERVENTION_ID);
		name = query.getString(NAME);	
	}
}
