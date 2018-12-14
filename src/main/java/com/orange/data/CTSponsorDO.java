package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTSponsorDO extends CTBaseDO {
	public static final String AGENCY_CLASS="AGENCY_CLASS";
	public static final String LEAD_OR_COLLABORATOR = "LEAD_OR_COLLABORATOR";
	public static final String NAME = "name";
	public String name;
	public String agencyClass;
	public String leadOrCollaborator;
		
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			agencyClass = data[2];
		if(data.length>3)
			leadOrCollaborator = nullable(data[3]);
		if(data.length>4)
			name = nullable(data[4]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(AGENCY_CLASS, agencyClass);
		map.put(LEAD_OR_COLLABORATOR, leadOrCollaborator);
		map.put(NAME, name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		agencyClass = (String)map.get(AGENCY_CLASS);
		leadOrCollaborator = (String)map.get(LEAD_OR_COLLABORATOR);
		name = (String)map.get(NAME);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		agencyClass = query.getString(AGENCY_CLASS);
		leadOrCollaborator = query.getString(LEAD_OR_COLLABORATOR);
		name = query.getString(NAME);	
	}
}
