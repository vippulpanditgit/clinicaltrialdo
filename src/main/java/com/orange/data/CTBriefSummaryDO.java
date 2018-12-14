package com.orange.data;

import java.util.HashMap;
import java.util.Map;

public class CTBriefSummaryDO extends CTBaseDO {
	public static final String DESCRIPTION = "description";
	public String description;
	
	public String status;// Derived
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			description = sanatize(data[2]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(DESCRIPTION, description);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		description = (String)map.get(DESCRIPTION);
	}

}
