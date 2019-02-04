package com.orange.summary.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.orange.data.util.DateUtil;

public class ConditionSummaryDO {
	public static final String CONDITION="cond";
	public static final String SIZE="num_of_cond";


	public String condition;
	public int count;
	
	public void deserialize(String[] data) {
		if(data.length>0)
			condition = data[0];
		if(data.length>1)
			count = Integer.parseInt(data[1]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(CONDITION, condition);
		map.put(SIZE, new Integer(count));
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		condition = (String)map.get(CONDITION);
		count = (Integer)map.get(SIZE);
	}
	public void update(ResultSet query) throws SQLException {
		condition = query.getString(CONDITION);
		count = query.getInt(SIZE);

	}
	public String toString() {
		return condition+" "+count;
	}
}
