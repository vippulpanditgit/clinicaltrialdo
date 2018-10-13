package com.orange.data.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AWSFormatUtil {

	public static String getAWSFormattedDate(String dateFormat, String date) { //yyyy-MM-dd(input)
		if(date==null)
			return null;
		SimpleDateFormat originalFormat = new SimpleDateFormat(dateFormat);
		SimpleDateFormat destinationFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		
		Date dateValue;
		try {
			dateValue = originalFormat.parse(date);
		} catch (ParseException e) {
			return null;
		}
		
		return destinationFormat.format(dateValue);
	}
}
