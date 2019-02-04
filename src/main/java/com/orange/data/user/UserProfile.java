package com.orange.data.user;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.orange.data.AccountInfoDO;
import com.orange.data.util.DateUtil;


public class UserProfile {
	public static final int partitionValue=1000;
	public static final String UUID = "UUID";
	public String id;
	public static final String FIRST_NAME_KEY="FIRST_NAME";
	public String firstName;
	public static final String LAST_NAME_KEY="LAST_NAME";
	public String lastName;
	public static final String USER_NAME_KEY="USER_NAME";
	public String userName=dynamoDBDefault("");
	public static final String PASSWORD_KEY="PASSWORD";
	public String userPassword=dynamoDBDefault("");
	public static final String EMAIL_KEY="EMAIL";
	public String email;
	public static final String DATE_OF_BIRTH_KEY="DATE_OF_BIRTH";
	public Date dateOfBirth;
	public String name;
	public boolean isSelected;
//	public static final String SAVED_TRIALS="SAVED_TRIALS";
//	public String[] savedTrials;
	public static final String CREATE_TS="CREATE_TS";
	public Date create_ts = new Date();
	public static final String UPDATE_TS="UPDATE_TS";
	public Date update_ts = new Date();
	public static final String CREATE_BY="CREATE_BY";
	public String create_by;
	public static final String UPDATE_BY="UPDATE_BY";
	public String update_by;
	
	public static final String SEARCH_CRITERIA = "SEARCH_CRITERIA";
	public String searchCriteria=dynamoDBDefault("");
	public static final String CONDITIONS = "CONDITIONS";
	public List<String> conditions;
	public static final String PHASES = "PHASES";
	public static final String STATUSES = "STATUSES";
	public static final String ZIPCODE = "ZIPCODE";
	public static final String STATUS_START_MONTHS = "STATUS_START_MONTHS";
	public static final String PRIMARY_COMPLETIION_MONTHS = "PRIMARY_COMPLETIION_MONTHS";
	public static final String FIRST_POSTED_MONTHS = "FIRST_POSTED_MONTHS";
	public static final String LAST_UPDATE_POSTED_MONTHS = "LAST_UPDATE_POSTED_MONTHS";
	public static final String NCT_IDS = "NCT_IDS";
	public static final String STUTDY_START_START_DATE = "STUTDY_START_START_DATE";
	public static final String STUDY_START_END_DATE = "STUDY_START_END_DATE";
	public static final String PRIMARY_COMPLETION_START_DATE = "PRIMARY_COMPLETION_START_DATE";
	public static final String PRIMARY_COMPLETION_END_DATE = "PRIMARY_COMPLETION_END_DATE";
	public static final String FIRST_POSTED_START_DATE = "FIRST_POSTED_START_DATE";
	public static final String FIRST_POSTED_END_DATE = "FIRST_POSTED_END_DATE";
	public static final String LAST_UPDATE_START_DATE = "LAST_UPDATE_START_DATE";
	public static final String LAST_UPDATE_END_DATE = "LAST_UPDATE_END_DATE";
	public static final String PHONENUMBER = "PHONENUMBER";

	
	public List<String> phases;
	public List<String> statuses;
	public String zipcode;
	public Integer statusStartMonths;
	public Integer primaryCompletionMonths;
	public Integer firstPostedMonths;
	public Integer lastUpdatePostedMonths;
	public List<String> nctIds;
	public Date studyStartStartDate;
	public Date studyStartEndDate;
	public Date primaryCompletionStartDate;
	public Date primaryCompletionEndDate;
	public Date firstPostedStartDate;
	public Date firstPostedEndDate;
	public Date lastUpdateStartDate;
	public Date lastUpdateEndDate;
	public String phoneNumber;
	
	public Map<String, Object> infoMap(){
		Map<String, Object> infoMap = new HashMap<>();
		infoMap.put(FIRST_NAME_KEY, firstName);
		infoMap.put(LAST_NAME_KEY, lastName);
		infoMap.put(USER_NAME_KEY, userName);
		infoMap.put(PASSWORD_KEY, userPassword);
		infoMap.put(EMAIL_KEY, email);
		infoMap.put(DATE_OF_BIRTH_KEY, DateUtil.convert(dateOfBirth));
//		infoMap.put(SAVED_TRIALS, savedTrials);
		infoMap.put(CREATE_TS, DateUtil.convert(create_ts));
		infoMap.put(UPDATE_TS, DateUtil.convert(update_ts));
		infoMap.put(CREATE_BY, create_by);
		infoMap.put(UPDATE_BY, update_by);
		infoMap.put(SEARCH_CRITERIA, searchCriteria);
		infoMap.put(CONDITIONS, conditions);
		infoMap.put(PHASES, phases);
		infoMap.put(STATUSES, statuses);
		infoMap.put(ZIPCODE, zipcode);
		infoMap.put(STATUS_START_MONTHS, statusStartMonths);
		infoMap.put(PRIMARY_COMPLETIION_MONTHS, primaryCompletionMonths);
		infoMap.put(FIRST_POSTED_MONTHS, firstPostedMonths);
		infoMap.put(LAST_UPDATE_POSTED_MONTHS, lastUpdatePostedMonths);
		infoMap.put(NCT_IDS, nctIds);
		infoMap.put(STUTDY_START_START_DATE, DateUtil.convert(studyStartStartDate));
		infoMap.put(STUDY_START_END_DATE, DateUtil.convert(studyStartEndDate));
		infoMap.put(PRIMARY_COMPLETION_START_DATE, DateUtil.convert(primaryCompletionStartDate));
		infoMap.put(PRIMARY_COMPLETION_END_DATE, DateUtil.convert(primaryCompletionEndDate));
		infoMap.put(FIRST_POSTED_START_DATE, DateUtil.convert(firstPostedStartDate));
		infoMap.put(FIRST_POSTED_END_DATE, DateUtil.convert(firstPostedEndDate));
		infoMap.put(LAST_UPDATE_START_DATE, DateUtil.convert(lastUpdateStartDate));
		infoMap.put(LAST_UPDATE_END_DATE, DateUtil.convert(lastUpdateEndDate));
		infoMap.put(PHONENUMBER, phoneNumber);
		
		return infoMap;
	}
	public void mapInfo(Map<String, Object> infoMap) throws ParseException{
		firstName= (String) infoMap.get(FIRST_NAME_KEY);
		lastName= (String) infoMap.get(LAST_NAME_KEY); 
		email= (String) infoMap.get(EMAIL_KEY); 
		dateOfBirth= DateUtil.convert((String)infoMap.get(DATE_OF_BIRTH_KEY)); 
//		savedTrials= (String[]) infoMap.get(SAVED_TRIALS); 
		create_ts= DateUtil.convert((String)infoMap.get(CREATE_TS)); 
		update_ts= DateUtil.convert((String)infoMap.get(UPDATE_TS));
		create_by= (String) infoMap.get(CREATE_BY); 
		update_by= (String) infoMap.get(UPDATE_BY);
		searchCriteria= (String) infoMap.get(SEARCH_CRITERIA); 
		conditions= (List<String>) infoMap.get(CONDITIONS);
		phases= (List<String>) infoMap.get(PHASES); 
		statuses= (List<String>) infoMap.get(STATUSES); 
		zipcode= (String) infoMap.get(ZIPCODE);
		statusStartMonths= ((BigDecimal)infoMap.get(STATUS_START_MONTHS)).intValue();
		primaryCompletionMonths= ((BigDecimal)infoMap.get(PRIMARY_COMPLETIION_MONTHS)).intValue();
		firstPostedMonths= ((BigDecimal)infoMap.get(FIRST_POSTED_MONTHS)).intValue();
		lastUpdatePostedMonths= ((BigDecimal)infoMap.get(LAST_UPDATE_POSTED_MONTHS)).intValue();
		nctIds= (List<String>)  infoMap.get(NCT_IDS); 
		studyStartStartDate= DateUtil.convert((String)infoMap.get(STUTDY_START_START_DATE)); 
		studyStartEndDate= DateUtil.convert((String)infoMap.get(STUDY_START_END_DATE));
		primaryCompletionStartDate= DateUtil.convert((String)infoMap.get(PRIMARY_COMPLETION_START_DATE)); 
		primaryCompletionEndDate= DateUtil.convert((String)infoMap.get(PRIMARY_COMPLETION_END_DATE)); 
		firstPostedStartDate= DateUtil.convert((String)infoMap.get(FIRST_POSTED_START_DATE)); 
		firstPostedEndDate= DateUtil.convert((String)infoMap.get(FIRST_POSTED_END_DATE));
		lastUpdateStartDate= DateUtil.convert((String)infoMap.get(LAST_UPDATE_START_DATE)); 
		lastUpdateEndDate= DateUtil.convert((String)infoMap.get(LAST_UPDATE_END_DATE));
		phoneNumber= (String) infoMap.get(PHONENUMBER);
		
	}
	public String dynamoDBDefault(String value) {
		if(value==null || value.length()==0)
			return null;
		return value;
	}
	public void map(AccountInfoDO accountInfoData) {
		id = accountInfoData.id;
		firstName= dynamoDBDefault(accountInfoData.firstName);
		lastName= dynamoDBDefault(accountInfoData.lastName); 
		email= dynamoDBDefault(accountInfoData.email); 
		name = dynamoDBDefault(accountInfoData.firstName);
		dateOfBirth= accountInfoData.dateOfBirth; 
//		create_ts= DateUtil.convert((String)infoMap.get(CREATE_TS)); 
		update_ts= new Date();
//		create_by= (String) infoMap.get(CREATE_BY); 
		create_by = dynamoDBDefault("");
		update_by= dynamoDBDefault(accountInfoData.id);
		if(accountInfoData.conditions!=null&&accountInfoData.conditions.size()>0)
			conditions= accountInfoData.conditions;
		else 
			conditions = new ArrayList();
		if(accountInfoData.phases!=null&&accountInfoData.phases.size()>0)		
			phases= accountInfoData.phases;
		else 
			phases = new ArrayList();
		if(accountInfoData.statuses!=null&&accountInfoData.statuses.size()>0)
			statuses= accountInfoData.statuses;
		else 
			statuses = new ArrayList();
		zipcode= dynamoDBDefault(accountInfoData.zipcode);
		statusStartMonths= new Integer(accountInfoData.studyStartMonths);
		primaryCompletionMonths= new Integer(accountInfoData.primaryCompletionMonths);
		firstPostedMonths= new Integer(accountInfoData.firstPostedMonths);
		lastUpdatePostedMonths= new Integer(accountInfoData.lastUpdatePostedMonths);
		if(accountInfoData.nctIds!=null&&accountInfoData.nctIds.size()>0)
			nctIds= accountInfoData.nctIds;
		else 
			nctIds =  new ArrayList();
		studyStartStartDate= accountInfoData.studyStartStartDate; 
		studyStartEndDate= accountInfoData.studyStartEndDate;
		primaryCompletionStartDate= accountInfoData.primaryCompletionStartDate;
		primaryCompletionEndDate= accountInfoData.primaryCompletionEndDate; 
		firstPostedStartDate= accountInfoData.firstPostedStartDate; 
		firstPostedEndDate= accountInfoData.firstPostedEndDate;
		lastUpdateStartDate= accountInfoData.lastUpdatedStartDate;
		lastUpdateEndDate= accountInfoData.lastUpdatedEndDate;
		phoneNumber= dynamoDBDefault(accountInfoData.phoneNumber);		
		
	}
}
