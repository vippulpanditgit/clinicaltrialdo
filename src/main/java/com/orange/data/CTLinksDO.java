package com.orange.data;

import java.util.Map;

public class CTLinksDO extends CTBaseDO {
	public static final String URL="url";
	public static final String DESCRIPTION="description";
	public String url;
	public String description;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			url = data[2];
		if(data.length>3)
			description = sanatize(data[3]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(URL, url);
		map.put(DESCRIPTION, description);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		url = (String)map.get(URL);
		description = (String)map.get(DESCRIPTION);
	}

}
