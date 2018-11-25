package com.orange.data;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTCountryDO extends CTBaseDO {
	public static final String NAME="name";
	public static final String IS_REMOVED = "isRemoved";
	public String name;
	public boolean isRemoved;
	
	public int count;
	public String status;
	
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
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(NAME, name);
		map.put(IS_REMOVED, isRemoved?"true":"false");
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		name = (String)map.get(NAME);
		isRemoved = StringUtils.equalsAnyIgnoreCase((String)map.get(IS_REMOVED),"true")?true:false;
	}

}
