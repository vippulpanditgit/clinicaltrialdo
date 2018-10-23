package com.orange.data.xref;

import org.apache.commons.lang3.StringUtils;

public class LoincDO extends CodeDO {
	public String loincNum;
	public String component;
	public String property;
	public String timeAspct;
	public String system;
	public String sclateTyp;
	public String methodTyp;
	public String classValue;
	public String chngType;
	public String definitionDescription;
	public String status;
	public String consumerName;
	public String classType;
	public String formula;
	public String species;
	public String exmplAnswers;
	public String surveyQuestText;
	public String surveyQuestSrc;
	public String unitsRequired;
	public String submittedUnits;
	public String relatedNames2;
	public String shortName;
	public String orderObs;
	public String cdiscCommonTests;
	public String hl7FieldSubfieldId;
	public String exampleUnits;
	public String longCommonName;
	public String unitsAndRange;
	public String documentSection;
	public String exampleUcumUnits;
	public String exampleSiUcumUnits;
	public String statusReason;
	public String statusText;
	public String changeReasonPublic;

	public void deserialize(String loincValue) {
		String[] loincValues = StringUtils.splitByWholeSeparatorPreserveAllTokens(loincValue, ",");
		if(loincValues.length>0)
			this.loincNum = loincValues[0];
		if(loincValues.length>1)
			this.component = loincValues[1];
		if(loincValues.length>2)
			this.property = loincValues[2];
		if(loincValues.length>3)
			this.timeAspct = loincValues[3];
		if(loincValues.length>4)
			this.system = loincValues[4];
		if(loincValues.length>5)
			this.sclateTyp = loincValues[5];
		if(loincValues.length>6)
			this.methodTyp = loincValues[6];
		if(loincValues.length>7)
			this.classValue = loincValues[7];
		if(loincValues.length>8)
			this.chngType = loincValues[8];
		if(loincValues.length>9)
			this.definitionDescription = loincValues[9];
		if(loincValues.length>10)
			this.status = loincValues[10];
		if(loincValues.length>11)
			this.consumerName = loincValues[11];
		if(loincValues.length>12)
			this.classType = loincValues[12];
		if(loincValues.length>13)
			this.formula = loincValues[13];
		if(loincValues.length>14)
			this.species = loincValues[14];
		if(loincValues.length>15)
			this.exmplAnswers = loincValues[15];
		if(loincValues.length>16)
			this.surveyQuestText = loincValues[16];
		if(loincValues.length>17)
			this.surveyQuestSrc = loincValues[17];
		if(loincValues.length>18)
			this.unitsRequired = loincValues[18];
		if(loincValues.length>19)
			this.submittedUnits = loincValues[19];
		if(loincValues.length>21)
			this.relatedNames2 = StringUtils.trim(loincValues[21]);
	}
	public String toString() {
		return this.relatedNames2;
	}
	public String id() {
		return "LOINC*"+this.loincNum;
	}
}
