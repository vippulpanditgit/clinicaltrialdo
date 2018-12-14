package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.orange.data.util.AWSFormatUtil;

public class CTOutcomeDO extends CTBaseDO {
	public static final String OUTCOME_TYPE= "outcome_type";
	public static final String TITLE = "title";
	public static final String DESCRIPTION = "description";
	public static final String TIME_FRAME = "time_frame";
	public static final String POPULATION = "population";
	public static final String ANTICIPATED_POSTING_DATE = "anticipated_posting_date";
	public static final String ANTICIPATED_POSTING_MONTH_YEAR = "anticipated_posting_month_year";
	public static final String UNITS = "units";
	public static final String UNITS_ANALYZED = "units_analyzed";
	public static final String DISPERSION_TYPE = "dispersion_type";
	public static final String PARAM_TYPE = "param_type";
	
	public String outcomeType;
	public String title;
	public String description;
	public String timeFrame;
	public String population;
	public String anticipatedPostingDate;
	public String anticipatedPostingMonthYear;
	public String units;
	public String unitsAnalyzed;
	public String dispersionType;
	public String paramType;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			outcomeType = data[2];
		if(data.length>3)
			title = data[3];
		if(data.length>4)
			description = data[4];
		if(data.length>5)
			timeFrame = data[5];
		if(data.length>6)
			population = data[6];
		if(data.length>7)
			anticipatedPostingDate = data[7];
		if(data.length>8)
			anticipatedPostingMonthYear = data[8];
		if(data.length>9)
			units = data[9];
		if(data.length>10)
			unitsAnalyzed = data[10];
		if(data.length>11)
			dispersionType = nullable(data[11]);
		if(data.length>12)
			paramType = nullable(data[12]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(OUTCOME_TYPE, outcomeType);
		map.put(TITLE , title);
		map.put(DESCRIPTION , description);
		map.put(TIME_FRAME , timeFrame);
		map.put(POPULATION , population);
		map.put(ANTICIPATED_POSTING_DATE , anticipatedPostingDate);
		map.put(ANTICIPATED_POSTING_MONTH_YEAR , anticipatedPostingMonthYear);
		map.put(UNITS , units);
		map.put(UNITS_ANALYZED , unitsAnalyzed);
		map.put(DISPERSION_TYPE , dispersionType);
		map.put(PARAM_TYPE , paramType);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		outcomeType = (String)map.get(OUTCOME_TYPE);
		title = (String)map.get(TITLE);
		description= (String)map.get(DESCRIPTION);
		timeFrame = (String)map.get(TIME_FRAME);
		population = (String)map.get(POPULATION);
		anticipatedPostingDate = (String)map.get(ANTICIPATED_POSTING_DATE);
		anticipatedPostingMonthYear = (String)map.get(ANTICIPATED_POSTING_MONTH_YEAR);
		units = (String)map.get(UNITS );
		unitsAnalyzed = (String)map.get(UNITS_ANALYZED);
		dispersionType = (String)map.get(DISPERSION_TYPE );
		paramType = (String)map.get(PARAM_TYPE);
	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		outcomeType = query.getString(OUTCOME_TYPE);
		title = query.getString(TITLE);
		description= query.getString(DESCRIPTION);
		timeFrame = query.getString(TIME_FRAME);
		population = query.getString(POPULATION);
		anticipatedPostingDate = query.getString(ANTICIPATED_POSTING_DATE);
		anticipatedPostingMonthYear = query.getString(ANTICIPATED_POSTING_MONTH_YEAR);
		units = query.getString(UNITS );
		unitsAnalyzed = query.getString(UNITS_ANALYZED);
		dispersionType = query.getString(DISPERSION_TYPE );
		paramType = query.getString(PARAM_TYPE);
	}
}
