package com.orange.data.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String DATE_FORMAT = "yyyy-MM-dd";
	public static String convert(Date date) {
		// Create an instance of SimpleDateFormat used for formatting 
		// the string representation of date (month/day/year)
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);

		// Get the date today using Calendar object.
		Date today = Calendar.getInstance().getTime();        
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		return(df.format(date));

	}
	public static Date convert(String date) throws ParseException {
		// Create an instance of SimpleDateFormat used for formatting 
		// the string representation of date (month/day/year)
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);

		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		return(df.parse(date));
		
	}

}
