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
		INCLUSION_CRITERIA ("INCLUSION_CRITERIA");
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
