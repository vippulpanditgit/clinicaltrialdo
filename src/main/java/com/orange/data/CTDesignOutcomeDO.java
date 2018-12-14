package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTDesignOutcomeDO extends CTBaseDO {
	public static final String OUTCOME_TYPE = "OUTCOME_TYPE";
	public static final String MEASURE = "MEASURE";
	public static final String TIME_FRAME = "TIME_FRAME";
	public static final String POPULATION = "POPULATION";
	public static final String DESCRIPTION = "DESCRIPTION";
	
	public String outcomeType;
	public String measure;
	public String timeFrame;
	public String population;
	public String description;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = nullable(data[0]);
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			outcomeType = nullable(data[2]);
		if(data.length>3)
			measure = nullable(data[3]);
		if(data.length>4)
			timeFrame = nullable(data[4]);
		if(data.length>5)
			population = nullable(data[5]);
		if(data.length>6)
			description = nullable(data[6]);

	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_TYPE,outcomeType);
		map.put(MEASURE,measure);
		map.put(TIME_FRAME,timeFrame);
		map.put(POPULATION,population);
		map.put(DESCRIPTION,description);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		outcomeType = (String)map.get(OUTCOME_TYPE);
		measure = (String)map.get(MEASURE);
		timeFrame = (String)map.get(TIME_FRAME);
		population = (String)map.get(POPULATION);
		description = (String)map.get(DESCRIPTION);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		outcomeType = query.getString(OUTCOME_TYPE);
		measure = query.getString(MEASURE);
		timeFrame = query.getString(TIME_FRAME);
		population = query.getString(POPULATION);
		description = query.getString(DESCRIPTION);
	}
}
