package com.orange.data;

import java.util.Map;

public class CTMilestoneDO extends CTBaseDO {
	public static final String RESULT_GROUP_ID = "result_group_id";
	public static final String CTGOV_GROUP_CODE = "ctgov_group_code";
	public static final String TITLE = "title";
	public static final String PERIOD="period";
	public static final String DESCRIPTION="description";
	public static final String COUNT="count";
	public String result_group_id;
	public String ctgov_group_code;
	public String title;
	public String period;
	public String description;
	public String count;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			result_group_id = data[2];
		if(data.length>3)
			ctgov_group_code = data[3];
		if(data.length>4)
			title = data[4];
		if(data.length>5)
			period = data[5];
		if(data.length>6)
			description = sanatize(data[6]);
		if(data.length>7)
			count = data[7];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(RESULT_GROUP_ID, result_group_id);
		map.put(CTGOV_GROUP_CODE, ctgov_group_code);
		map.put(TITLE, title);
		map.put(PERIOD, period);
		map.put(COUNT,count);
		map.put(DESCRIPTION, description);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		this.result_group_id = (String)map.get(RESULT_GROUP_ID);
		this.ctgov_group_code = (String)map.get(CTGOV_GROUP_CODE);
		this.title = (String)map.get(TITLE);
		this.period = (String)map.get(PERIOD);
		this.count = (String)map.get(COUNT);
		this.description = (String)map.get(DESCRIPTION);
	}


}
