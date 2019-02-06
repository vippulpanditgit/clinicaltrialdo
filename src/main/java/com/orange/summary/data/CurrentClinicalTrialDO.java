package com.orange.summary.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class CurrentClinicalTrialDO {
	public final static String NCT_ID="nct_id";
	public final static String DESCRIPTION = "description";
	public final static String LAST_UPDATED_POSTED_DATE = "last_update_posted_date";
	public final static String BRIEF_TITLE = "brief_title";
	public final static String OFFICIAL_TITLE = "official_title";
	public final static String SOURCE = "source";
	public final static String COUNTRY = "COUNTRY";
	public final static String ZIPCODE = "zipcode";
	
	public String nct_id;
	public String description;
	public Date last_update_posted_date;
	public String brief_title;
	public String official_title;
	public String source;
	public String country;
	public String zipcode;
	public double miles;
	public List<CountryZipcodeDO> countryZipCodes;
	
	public double getDistance() {
		return miles;
	}

	
	public void update(ResultSet query) throws SQLException {
		nct_id = query.getString(NCT_ID);
		description = query.getString(DESCRIPTION);
		last_update_posted_date = query.getDate(LAST_UPDATED_POSTED_DATE);
		brief_title = query.getString(BRIEF_TITLE);
		official_title = query.getString(OFFICIAL_TITLE);
		source = query.getString(SOURCE);
		country = query.getString(COUNTRY);
		zipcode = query.getString(ZIPCODE);
	}
	public void updateV2(ResultSet query) throws SQLException {
		nct_id = query.getString(NCT_ID);
		description = query.getString(DESCRIPTION);
		last_update_posted_date = query.getDate(LAST_UPDATED_POSTED_DATE);
		brief_title = query.getString(BRIEF_TITLE);
		official_title = query.getString(OFFICIAL_TITLE);
		source = query.getString(SOURCE);
	}

}
