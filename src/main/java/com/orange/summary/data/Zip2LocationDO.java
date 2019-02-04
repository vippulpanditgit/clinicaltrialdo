package com.orange.summary.data;

import org.apache.commons.lang3.StringUtils;

public class Zip2LocationDO {
	public enum ZipcodeType {
		STANDARD,
		PO_BOX
	};
	public enum LocationType {
		NOT_ACCEPTABLE
	}
	public String id;
	public String zipcode;
	public ZipcodeType zipcodeType;
	public String city;
	public String state;
	public LocationType locationType;
	public float latitude;
	public float longitude;
	public float xAxis;
	public float yAxis;
	public float zAxis;
	public String worldRegion;
	public String country;
	public String locationText;
	public String location;
	public boolean isDecommisioned;
	public String taxReturnsFiled;
	public String extimatedPopulation;
	public String totalWages;
	public String notes;
	public void deserialize(String[] data) {
		System.out.println(data[0]+" "+data[6]);
		int index= 0;
		if(data.length>1)
			zipcode = data[1];
		if(data.length>2) {
			if(StringUtils.equalsIgnoreCase(data[2], "standard")) {
				zipcodeType = ZipcodeType.STANDARD;
			}
		}
		if(data.length>3)
			city = data[3];
		if(data.length>4)
			state = data[4];
		if(data.length>5) {
			if(StringUtils.equalsIgnoreCase(data[5], "NOT ACCEPTABLE")) {
				locationType = LocationType.NOT_ACCEPTABLE;
			}
		}
		if(data.length>6 && data[6].length()>0)
			latitude = Float.parseFloat(data[6]);
		if(data.length>7 && data[7].length()>0)
			longitude = Float.parseFloat(data[7]);
		if(data.length>8 && data[8].length()>0)
			xAxis = Float.parseFloat(data[8]);
		if(data.length>9 && data[9].length()>0)
			yAxis = Float.parseFloat(data[9]);
		if(data.length>10 && data[10].length()>0)
			zAxis = Float.parseFloat(data[10]);
		if(data.length>11)
			worldRegion = data[11];
		if(data.length>12)
			country = data[12];
		if(data.length>13)
			locationText = data[13];
		if(data.length>14)
			location = data[14];
		if(data.length>15 && data[15].length()>0)
			isDecommisioned = Boolean.parseBoolean(data[15]);
		if(data.length>16)
			taxReturnsFiled = data[16];
		if(data.length>17)
			extimatedPopulation = data[17];
		if(data.length>18)
			totalWages = data[18];
		if(data.length>19)
			notes = data[19];

	}	

}
