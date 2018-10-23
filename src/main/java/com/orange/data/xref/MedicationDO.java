package com.orange.data.xref;

import org.apache.commons.lang3.StringUtils;

public class MedicationDO extends CodeDO {
	public String applNo;
	public String productNo;
	public String form;
	public String strength;
	public String referenceDrug;
	public String drugName;
	public String activeIngredient;
	public String referenceStandard;
	public void deserialize(String line) {
		String[] values = StringUtils.split(line, "\t");
		if(values.length>0)
			applNo = values[0];
		if(values.length>1)
			productNo = values[1];
		if(values.length>2)
			form = values[2];
		if(values.length>3)
			strength = values[3];
		if(values.length>4)
			referenceDrug = values[4];
		if(values.length>5)
			drugName = values[5];
		if(values.length>6)
			activeIngredient = values[6];
		if(values.length>7)
			referenceStandard = values[7];
	}
	public String id() {
		return "RX*"+productNo;
	}
}
