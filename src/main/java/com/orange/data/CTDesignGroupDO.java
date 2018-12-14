package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTDesignGroupDO extends CTBaseDO {
	public static final String GROUP_TYPE= "GROUP_TYPE";
	public static final String TITLE = "TITLE";
	public static final String DESCRIPTION = "DESCRIPTION";
	
	public String groupType;
	public String title;
	public String description;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = nullable(data[0]);
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			groupType = nullable(data[2]);
		if(data.length>3)
			title = nullable(data[3]);
		if(data.length>4)
			description = nullable(data[4]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(GROUP_TYPE, groupType);
		map.put(TITLE, title);
		map.put(DESCRIPTION, description);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		groupType = (String)map.get(GROUP_TYPE);
		title = (String)map.get(TITLE);
		description = (String)map.get(DESCRIPTION);
	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		groupType = query.getString(GROUP_TYPE);
		title = query.getString(TITLE);
		description = query.getString(DESCRIPTION);
	}
}
