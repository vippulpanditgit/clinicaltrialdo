package com.orange.data.xref;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class LabTestDO extends CodeDO {
	public String labTestName;
	public String[] cptCodes;
	public String[] alternateLabTestNames;
	
	
	public void deserialize(String labTestString){
		String[] labTests = StringUtils.split(labTestString, "\\|");
		if(labTests.length>0)
			labTestName = labTests[0];
		if(labTests.length>1) { 
			cptCodes = StringUtils.split(labTests[1],",");
			if(cptCodes!=null) {
				cptCodes = Arrays.asList(cptCodes).parallelStream().map(cptCode->{
					return StringUtils.trim(cptCode);
				}).collect(Collectors.toList()).toArray(new String[cptCodes.length]);
			}
		}
		if(labTests.length>2){
			this.alternateLabTestNames = StringUtils.split(labTests[2], ",");
			this.alternateLabTestNames = Arrays.asList(this.alternateLabTestNames).stream().map(labTest->{
				return StringUtils.trim(labTest);
			}).collect(Collectors.toList()).toArray(new String[this.alternateLabTestNames.length]);
		}
	}
	public String serialize() {
		return this.labTestName
				+"|"+(this.cptCodes!=null&&this.cptCodes.length>0?String.join(",", Arrays.asList(this.cptCodes)):"")
				+"|"+(this.alternateLabTestNames!=null&&this.alternateLabTestNames.length>0?String.join(",", Arrays.asList(this.alternateLabTestNames)):"");
	}
	public String toString() {
		return this.serialize();
	}
	public String id() {
		return "LBTST*"+labTestName;
	}

}
