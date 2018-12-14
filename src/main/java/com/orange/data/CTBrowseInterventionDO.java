package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTBrowseInterventionDO extends CTBaseDO {
	public static final String MESH_TERM= "MESH_TERM";
	public static final String DOWNCASE_MESH_TERM = "DOWNCASE_MESH_TERM";
	public String meshTerm;
	public String downcaseMeshTerm;

	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			meshTerm = data[2];
		if(data.length>3)
			downcaseMeshTerm = data[3];
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(MESH_TERM, meshTerm);
		map.put(DOWNCASE_MESH_TERM, downcaseMeshTerm);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		meshTerm = (String)map.get(MESH_TERM);
		downcaseMeshTerm = (String)map.get(DOWNCASE_MESH_TERM);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		meshTerm = query.getString(MESH_TERM);
		downcaseMeshTerm = query.getString(DOWNCASE_MESH_TERM);
	}
}
