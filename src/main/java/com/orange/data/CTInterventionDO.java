package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

public class CTInterventionDO extends CTBaseDO {
	public static final String INTERVENTION_TYPE="INTERVENTION_TYPE";
	public static final String NAME = "NAME";
	public static final String DESCRIPTION = "DESCRIPTION";
	public InterventionType interventionType;
	public String name;
	public String description;
		
	public void deserialize(String[] data) {
		if(data.length>0)
			id = data[0];
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			interventionType = nullable(data[2])!=null?getType(nullable(data[2])):InterventionType.OTHER;
		if(data.length>3)
			name = nullable(data[3]);
		if(data.length>4)
			description = nullable(data[4]);
	}
	private InterventionType getType(String value) {
		if(StringUtils.equalsAnyIgnoreCase(InterventionType.BEHAVIORAL.name(), value)) {
			return InterventionType.BEHAVIORAL;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.BIOLOGICAL.name(), value)) {
			return InterventionType.BIOLOGICAL;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.COMBINATION.name(), value)) {
			return InterventionType.COMBINATION;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.DEVICE.name(), value)) {
			return InterventionType.DEVICE;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.DIAGNOSTIC_TEST.name(), value)) {
			return InterventionType.DIAGNOSTIC_TEST;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.DIETARY_SUPPLEMENT.name(), value)) {
			return InterventionType.DIETARY_SUPPLEMENT;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.DRUG.name(), value)) {
			return InterventionType.DRUG;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.GENETIC.name(), value)) {
			return InterventionType.GENETIC;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.OTHER.name(), value)) {
			return InterventionType.OTHER;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.PROCEDURE.name(), value)) {
			return InterventionType.PROCEDURE;
		} else if(StringUtils.equalsAnyIgnoreCase(InterventionType.RADIATION.name(), value)) {
			return InterventionType.RADIATION;
		}
		return InterventionType.OTHER;
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(INTERVENTION_TYPE, interventionType);
		map.put(DESCRIPTION, description);
		map.put(NAME, name);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		interventionType = (InterventionType)map.get(INTERVENTION_TYPE);
		description = (String)map.get(DESCRIPTION);
		name = (String)map.get(NAME);
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		interventionType = getType(query.getString(INTERVENTION_TYPE));
		description = query.getString(DESCRIPTION);
		name = query.getString(NAME);	
	}
}
