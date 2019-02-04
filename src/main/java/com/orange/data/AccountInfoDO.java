package com.orange.data;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.orange.data.user.UserProfile;

public class AccountInfoDO {
	public String firstName;
	public String lastName;
	public Date dateOfBirth;
	public String email;
	public String id;
	public String country;
	public String state;
	public String gender;
	public List<String> conditions;
	public boolean termAndConditionAccepted;
	public Date termAndConditionAcceptedDate;
	public List<String> phases;
	public List<String> statuses;
	public int studyStartMonths;
	public int primaryCompletionMonths;
	public int firstPostedMonths;
	public int lastUpdatePostedMonths;
	public List<String> nctIds;
	public String zipcode;
	public Date studyStartStartDate;
	public Date studyStartEndDate;
	public Date primaryCompletionStartDate;
	public Date primaryCompletionEndDate;
	public Date firstPostedStartDate;
	public Date firstPostedEndDate;
	public Date lastUpdatedStartDate;
	public Date lastUpdatedEndDate;
	public String userName;
	public String password;
	public String phoneNumber;
	public String newPassword;
	
	public void map(UserProfile userProfile) {
		id = userProfile.id;
		firstName= userProfile.firstName;
		lastName= userProfile.lastName; 
		email= userProfile.email; 
		dateOfBirth= userProfile.dateOfBirth; 
//		savedTrials= acccountInfoData.savedTrials; 
		conditions= userProfile.conditions;
		phases= userProfile.phases;
		statuses= userProfile.statuses;
		zipcode= userProfile.zipcode;
		studyStartMonths= userProfile.statusStartMonths.intValue();
		primaryCompletionMonths= new Integer(userProfile.primaryCompletionMonths);
		firstPostedMonths= new Integer(userProfile.firstPostedMonths);
		lastUpdatePostedMonths= new Integer(userProfile.lastUpdatePostedMonths);
		nctIds= userProfile.nctIds;
		studyStartStartDate= userProfile.studyStartStartDate; 
		studyStartEndDate= userProfile.studyStartEndDate;
		primaryCompletionStartDate= userProfile.primaryCompletionStartDate;
		primaryCompletionEndDate= userProfile.primaryCompletionEndDate; 
		firstPostedStartDate= userProfile.firstPostedStartDate; 
		firstPostedEndDate= userProfile.firstPostedEndDate;
		lastUpdatedStartDate= userProfile.lastUpdateStartDate;
		lastUpdatedEndDate= userProfile.lastUpdateEndDate;
		phoneNumber= userProfile.phoneNumber;		
		
	}
}
