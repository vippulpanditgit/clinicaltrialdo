package com.orange.data.user;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.orange.data.util.DateUtil;


public class UserProfile {
	public static final int partitionValue=1000;
	public String id;
	public static final String FIRST_NAME_KEY="FIRST_NAME_KEY";
	public String firstName;
	public static final String LAST_NAME_KEY="LAST_NAME_KEY";
	public String lastName;
	public static final String USER_NAME_KEY="USER_NAME_KEY";
	public String userName;
	public static final String PASSWORD_KEY="PASSWORD_KEY";
	public String userPassword;
	public static final String EMAIL_KEY="EMAIL_KEY";
	public String email;
	public static final String DATE_OF_BIRTH_KEY="DATE_OF_BIRTH_KEY";
	public Date dateOfBirth;
	public String name;
	public boolean isSelected;
	public static final String SAVED_TRIALS="SAVED_TRIALS";
	public String[] savedTrials;
	
	public Map<String, Object> infoMap(){
		Map<String, Object> infoMap = new HashMap<>();
		infoMap.put(FIRST_NAME_KEY, firstName);
		infoMap.put(LAST_NAME_KEY, lastName);
		infoMap.put(USER_NAME_KEY, userName);
		infoMap.put(PASSWORD_KEY, userPassword);
		infoMap.put(EMAIL_KEY, email);
		infoMap.put(DATE_OF_BIRTH_KEY, DateUtil.convert(dateOfBirth));
		infoMap.put(SAVED_TRIALS, savedTrials);
		return infoMap;
	}
}
