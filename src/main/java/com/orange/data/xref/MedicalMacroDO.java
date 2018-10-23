package com.orange.data.xref;

import org.apache.commons.lang3.StringUtils;

public class MedicalMacroDO extends CodeDO {
	public String name;
	public String desc;
	public String altName;

	public String toString() {
		return name+"|"+desc+"|"+altName;
	}
	public void deserialize(String medicalMacroValue) {
		String[] medicalMacroValues = StringUtils.splitByWholeSeparatorPreserveAllTokens(medicalMacroValue, "|");
		if(medicalMacroValues.length>0)
			name = medicalMacroValues[0];
		if(medicalMacroValues.length>1)
			desc = medicalMacroValues[1];
		if(medicalMacroValues.length>2)
			altName = medicalMacroValues[2];
	}
	public String id() {
		return "MEDMX*"+name;
	}
}
