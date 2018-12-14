package com.orange.data;

import java.util.HashMap;
import java.util.Map;

public class ContactDO extends CTBaseDO {
	public static final String NAME = "name";
	public String name;
	public static final String PHONE = "phone";
	public String phone;
	public static final String EMAIL = "email";
	public String email;
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			name = data[2];
		if(data.length>3)
			phone = data[3];
		if(data.length>4)
			email = data[4];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(NAME, name);
		map.put(PHONE, phone);
		map.put(EMAIL, email);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		name = (String)map.get(NAME);
		phone = (String)map.get(PHONE);
		email = (String)map.get(EMAIL);
	}

}
