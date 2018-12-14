package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTFacilityDO extends CTBaseDO {
	public static final String STATUS="status";
	public static final String CITY="city";
	public static final String STATE="state";
	public static final String ZIP="zip";
	public static final String COUNTRY="country";
	public static final String NAME="name";
	public String status;
	public String city;
	public String state;
	public String zip;
	public String country;
	public String name;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			name = data[2];
		if(data.length>3)
			status = nullable(data[3]);
		if(data.length>4)
			city = nullable(data[4]);
		if(data.length>5)
			state = nullable(data[5]);
		if(data.length>6)
			zip = nullable(data[6]);
		if(data.length>7)
			country = nullable(data[7]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(STATUS,status);
		map.put(CITY,city);
		map.put(STATE,state);
		map.put(ZIP,zip);
		map.put(COUNTRY,country);
		map.put(NAME,name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		status=(String)map.get(STATUS);
		city=(String)map.get(CITY);
		state=(String)map.get(STATE);
		zip=(String)map.get(ZIP);
		country=(String)map.get(COUNTRY);
		name=(String)map.get(NAME);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		status=query.getString(STATUS);
		city=query.getString(CITY);
		state=query.getString(STATE);
		zip=query.getString(ZIP);
		country=query.getString(COUNTRY);
		name=query.getString(NAME);
	}
}
