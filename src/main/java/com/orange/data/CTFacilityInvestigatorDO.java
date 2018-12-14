package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTFacilityInvestigatorDO extends CTBaseDO {
	public static final String FACILITY_ID="FACILITY_ID";
	public static final String ROLE="ROLE";
	public static final String NAME="NAME";
	public String facilityId;
	public String role;
	public String name;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			name = data[2];
		if(data.length>3)
			facilityId = nullable(data[3]);
		if(data.length>4)
			role = nullable(data[4]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(FACILITY_ID,facilityId);
		map.put(ROLE,role);
		map.put(NAME,name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		facilityId=(String)map.get(FACILITY_ID);
		role=(String)map.get(ROLE);
		name=(String)map.get(NAME);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		facilityId=query.getString(FACILITY_ID);
		role=query.getString(ROLE);
		name=query.getString(NAME);
	}
}
