package com.orange.data;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;


public class CTFacility_ContactDO extends ContactDO {
	public static final String CONTACT_TYPE = "CONTACT_TYPE";
	public ContactType contactType;
	public static final String FACILITY_ID = "FACILITY_ID";
	public String facility_id;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			if(StringUtils.equalsAnyIgnoreCase("primary", data[2]))
				contactType = ContactType.PRIMARY;
			else if(StringUtils.equalsAnyIgnoreCase("backup", data[2]))
				contactType = ContactType.BACKUP;
		if(data.length>3)
			facility_id = data[3];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(CONTACT_TYPE, contactType==ContactType.PRIMARY?"primary":"backup");
		map.put(FACILITY_ID, facility_id);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		if(StringUtils.equalsAnyIgnoreCase("primary", (String)map.get(CONTACT_TYPE)))
			contactType = ContactType.PRIMARY;
		else if(StringUtils.equalsAnyIgnoreCase("backup",(String)map.get(CONTACT_TYPE)))
			contactType = ContactType.BACKUP;
		facility_id = (String)map.get(FACILITY_ID);
	}
}
