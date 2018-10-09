package com.orange.data;

import java.util.Map;

public class CTCountryDO extends CTBaseDO {
	public String NAME="name";
	public String IS_REMOVED = "isRemoved";
	public String name;
	public boolean isRemoved;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			name = data[2];
		if(data.length>3)
			isRemoved = Boolean.getBoolean(data[3]);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(NAME, name);
		map.put(IS_REMOVED, isRemoved?"true":"false");
		return map;
	}
}
