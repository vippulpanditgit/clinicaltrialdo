package com.orange.data.xref;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.orange.ct.app.conf.AppModuleConfiguration;

public class XRef {
	public enum XRefType {
		ICD10,
		LABTEST,
		LOINC,
		MEDICAL_MACRO,
		MEDICATION, 
		CLINICAL_LAB_TEST,
		
	}
	public double relevancy;
	public List<CodeDO> codeXRefList;
	private List<String> keyXRefList;
	public XRefType type;
	public XRef() {
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
