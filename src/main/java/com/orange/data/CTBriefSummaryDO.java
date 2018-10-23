package com.orange.data;

import java.util.HashMap;
import java.util.Map;

public class CTBriefSummaryDO extends CTBaseDO {
	public String BRIEF_DECRIPTION = "briefDescription";
	public String briefDescription;
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			briefDescription = sanatize(data[2]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(BRIEF_DECRIPTION, briefDescription);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		briefDescription = (String)map.get(BRIEF_DECRIPTION);
	}

}
