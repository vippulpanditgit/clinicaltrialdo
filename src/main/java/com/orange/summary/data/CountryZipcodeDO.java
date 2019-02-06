package com.orange.summary.data;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryZipcodeDO {
	public static final String NCT_ID="nct_id";
	public static final String COUNTRY="COUNTRY";
	public static final String ZIP="ZIP";

	public String nct_id;
	public String country;
	public String zipcode;
	public void update(ResultSet query) throws SQLException {
		nct_id = query.getString(NCT_ID);
		country = query.getString(COUNTRY);
		zipcode = query.getString(ZIP);

	}

}
