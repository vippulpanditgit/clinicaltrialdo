package com.orange.data;

import java.util.ArrayList;
import java.util.List;

import com.orange.data.xref.CodeDO;
import com.orange.data.xref.XRef.XRefType;

public class CTXRef {
	public enum CTXRefType {
		ELIGIBILITY ("ELIGIBILITY"),
		BASIC_SUMMARY ("BASIC_SUMMARY"),
		LINKS ("LINKS"),
		DETAIL_DESCRIPTION ("DETAIL_DESCRIPTION"),
		MILESTONE ("MILESTONE"),
		CONDITIONS ("CONDITIONS"),
		COUNTERIES ("COUNTERIES"),
		KEYWORDS ("KEYWORDS"),
		STUDIES ("STUDIES"),
		STUDIES_XREF ("STUDIES_XREF"),
		CRITERIA ("CRITERIA"),
		EXCLUSION_CRITERIA ("EXCLUSION_CRITERIA"),
		INCLUSION_CRITERIA ("INCLUSION_CRITERIA"), 
		CENTRAL_CONTACT("CENTRAL_CONTACT"),
		RESULT_CONTACT("RESULT_CONTACT"),
		FACILITY_CONTACT("FACILITY_CONTACT"),
		DESIGN("DESIGN"),
		DESIGN_GROUP("DESIGN_GROUP"),
		DESIGN_GROUP_INTERVENTION("DESIGN_GROUP_INTERVENTION"),
		DESIGN_OUTCOME("DESIGN_OUTCOME"),
		OUTCOME("OUTCOME"),
		OUTCOME_ANALYSIS("OUTCOME_ANALYSIS"),
		OUTCOME_ANALYSIS_GROUP("OUTCOME_ANALYSIS_GROUP"),
		OUTCOME_COUNT("OUTCOME_COUNT"),
		OUTCOME_MEASUREMENT("OUTCOME_MEASUREMENT"), 
		STUDY_REFERENCE("STUDY_REFERENCE"), INTERVENTION("INTERVENTION"), INTERVENTION_OTHER_NAME("INTERVENTION_OTHER_NAME");
		private final String name;
		
		CTXRefType(String name) {
			this.name= name;
		}
	}
	public double relevancy;
	public List<CTBaseDO> codeXRefList;
	private List<String> keyXRefList;
	public CTXRefType type;
	public CTXRef() {
		codeXRefList = new ArrayList<>();
		keyXRefList = new ArrayList<>();
	}
	public String toString() {
		String value = "";
		if(keyXRefList!=null && keyXRefList.size()>0)
			value = keyXRefList.stream().reduce((t,u)->t.replace("\"","")+"|"+u.replace("\"","")).get();
		return "{\"type\":\""+type.name()+"\", \"values\": \""+value.replace("\"","")+"\"}";
	}
	public List<String> getKeyXRefList(){
		return this.keyXRefList;
	}

}
