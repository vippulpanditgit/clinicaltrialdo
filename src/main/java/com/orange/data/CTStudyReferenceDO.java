package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.orange.data.util.AWSFormatUtil;

public class CTStudyReferenceDO extends CTBaseDO {
	public static final String PMID = "PMID";
	public static final String REFERENCE_TYPE = "REFERENCE_TYPE";
	public static final String CITATION = "CITATION";
	
	public String pmId;
	public StudyReferenceType referenceType;
	public String citation;


	public void deserialize(String[] data) {
		if(data.length>0)
			id = nullable(data[0]);
		if(data.length>1)
			nct_Id = data[1];
		if(data.length>2)
			pmId = nullable(data[2]);
		if(data.length>3)
			referenceType = StringUtils.equalsAnyIgnoreCase(nullable(data[3]), "results_reference")?StudyReferenceType.RESULTS_REFERENCE:StudyReferenceType.REFERENCE;
		if(data.length>4)
			citation = nullable(data[4]);
	}
	public void deserialize(String[] data, boolean isExtendeFileFormat) {
		this.deserialize(data);
	}
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(PMID,pmId);
		map.put(REFERENCE_TYPE,referenceType);
		map.put(CITATION,citation);
		return map;
	}	
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		pmId=(String)map.get(PMID);
		referenceType=(StudyReferenceType)map.get(REFERENCE_TYPE);
		citation=(String)map.get(CITATION);
	
	}
	public void update(ResultSet query) throws SQLException {
		super.update(query);
		pmId=query.getString(PMID);
		referenceType=StringUtils.equalsAnyIgnoreCase(nullable(query.getString(REFERENCE_TYPE)), "results_reference")?StudyReferenceType.RESULTS_REFERENCE:StudyReferenceType.REFERENCE;
		citation=query.getString(CITATION);
	}
}
