package com.orange.data;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTResult_ContactDO extends ContactDO {
	public static final String ORGANIZATION = "ORGANIZATION";
	public String organization;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			organization = data[2];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(ORGANIZATION, organization);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		organization = (String)map.get(ORGANIZATION);
	}
}
