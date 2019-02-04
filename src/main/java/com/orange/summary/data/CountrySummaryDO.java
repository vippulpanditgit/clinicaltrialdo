package com.orange.summary.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountrySummaryDO {
	public static final String NAME="country_name";
	public static final String COUNT="clinical_trial_count";

	public String country_name;
	public int clinical_trial_count;
	public void update(ResultSet query) throws SQLException {
		country_name = query.getString(NAME);
		clinical_trial_count = query.getInt(COUNT);

	}
}
