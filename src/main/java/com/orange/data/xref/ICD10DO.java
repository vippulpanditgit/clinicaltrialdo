package com.orange.data.xref;

public class ICD10DO extends CodeDO {
	public String code;
	public String description;
	
	public String toString() {
		return code+"|"+description;
	}
	public String toJsonString() {
		return "{code=\""+code+"\",description=\""+description+"}";
	}
	public String id() {
		return "ICD10*"+code;
	}
}
