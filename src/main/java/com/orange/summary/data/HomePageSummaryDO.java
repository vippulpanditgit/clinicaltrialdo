package com.orange.summary.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.orange.data.util.DateUtil;

public class HomePageSummaryDO {
	public static final String COUNTRIES="COUNTRIES";
	public static final String RECRUITING="RECRUITING";
	public static final String CONDITIONS="CONDITIONS";
	public static final String LAST_UPDATED="LAST_UPDATED";


	public int countries;
	public int recruiting;
	public int conditions;
	public Date lastUpdated;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			countries = Integer.parseInt(data[0]);
		if(data.length>1)
			recruiting = Integer.parseInt(data[1]);
		if(data.length>2)
			conditions = Integer.parseInt(data[2]);
		if(data.length>3) {
			lastUpdated = DateUtil.convert(data[3]);
		}
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(COUNTRIES, new Integer(countries));
		map.put(RECRUITING, new Integer(recruiting));
		map.put(CONDITIONS, new Integer(conditions));
		map.put(LAST_UPDATED, lastUpdated);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		countries = (Integer)map.get(COUNTRIES);
		recruiting = (Integer)map.get(RECRUITING);
		conditions = (Integer)map.get(CONDITIONS);
		lastUpdated = (Date)map.get(LAST_UPDATED);
	}
	public void update(ResultSet query) throws SQLException {
		countries = query.getInt(COUNTRIES);
		recruiting = query.getInt(RECRUITING);
		conditions = query.getInt(CONDITIONS);
		lastUpdated = query.getDate(LAST_UPDATED);

	}
}
