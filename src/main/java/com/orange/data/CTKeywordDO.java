package com.orange.data;

import java.util.Map;

public class CTKeywordDO extends CTBaseDO {
	public String NAME="name";
	public String DOWNCASE_NAME = "downcase_name";
	public String name;
	public String downcase_name;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			name = data[2];
		if(data.length>3)
			downcase_name = data[3];
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(NAME, name);
		map.put(DOWNCASE_NAME, downcase_name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		name = (String)map.get(NAME);
		downcase_name = (String)map.get(DOWNCASE_NAME);
	}

}
