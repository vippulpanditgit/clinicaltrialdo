package com.orange.data.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.orange.data.CTEligibilityDO;

public class CTEligibilityUtil {
	private static final String[] INCLUSION_CRITERIA = {"inclusion criteria:", "disease characteristics:", "patient characteristics:", "inclusion criteria"};
	private static final String[] EXCLUSION_CRITERIA = {"exclusion criteria:", "exclusion criteria"};
	private static final String LINE_SEPERATOR = "-";

	static Pattern numberedPattern = Pattern.compile("^(\\d+)\\.");
	static Pattern dashPattern = Pattern.compile("^-\\s+");

	public static boolean isContainedInInclusionList(String criteria) {
		for(int index=0;index<INCLUSION_CRITERIA.length;index++) {
			if(StringUtils.containsIgnoreCase(criteria, INCLUSION_CRITERIA[index]))
				return true;
		}
		return false;
	}
	public static boolean isContainedInExclusionList(String criteria) {
		for(int index=0;index<EXCLUSION_CRITERIA.length;index++) {
			if(StringUtils.containsIgnoreCase(criteria, EXCLUSION_CRITERIA[index]))
				return true;
		}
		return false;
	}
	public static void inclusion(CTEligibilityDO eligibilityDO) {
		if (eligibilityDO.criteria != null) {
			String[] criteria = eligibilityDO.criteria.split("\n"); // expectation is that all the "~" are converted to \n. Split by "\n"
			// Sanitize the string for unicode characters.
			List<String> trimmedCriteriaList = Arrays.asList(criteria);
			boolean inclusionCriteria = false;
			boolean exclusionCriteria = false;
			for (String criteriaValue : trimmedCriteriaList) {
				criteriaValue = criteriaValue.replaceAll("\\|", "");
				if (StringUtils.isNotEmpty(criteriaValue)&& isContainedInInclusionList(criteriaValue)) {
					inclusionCriteria = true;
					exclusionCriteria = false;
					continue;
				}
				if (StringUtils.isNotEmpty(criteriaValue)&& isContainedInExclusionList(criteriaValue)) {
					inclusionCriteria = false;
					exclusionCriteria = true;
					continue;
				}
				if (inclusionCriteria) {
					if (eligibilityDO.inclusionCriteriaList == null)
						eligibilityDO.inclusionCriteriaList = new ArrayList<String>();
					Matcher numberPatternMatcher = numberedPattern.matcher(criteriaValue);
					Matcher dashPatternMatcher = dashPattern.matcher(criteriaValue);
					if (numberPatternMatcher.find()) {
						eligibilityDO.inclusionCriteriaList
								.add(criteriaValue.substring(numberPatternMatcher.group().length()).trim());
					} else if (dashPatternMatcher.find()) {
						eligibilityDO.inclusionCriteriaList.add(criteriaValue.substring(dashPatternMatcher.group().length()).trim());
					} else {
						if (eligibilityDO.inclusionCriteriaList.size() > 0) {
							StringBuffer inclusionCriteriaValue = new StringBuffer(
									eligibilityDO.inclusionCriteriaList
											.get(eligibilityDO.inclusionCriteriaList.size() - 1));
							inclusionCriteriaValue.append(" ").append(criteriaValue);
							eligibilityDO.inclusionCriteriaList.set(eligibilityDO.inclusionCriteriaList.size() - 1,
									inclusionCriteriaValue.toString());
						} else {
							eligibilityDO.inclusionCriteriaList.add(criteriaValue);
						}

					}
				}
				if (exclusionCriteria) {
					continue;
				}
			}
		} else {
		}
	}
	public static void exclusion(CTEligibilityDO eligibilityDO) {
		if (eligibilityDO.criteria != null) {
			String[] criteria = eligibilityDO.criteria.split("\n"); // expectation is that all the "~" are converted to \n. Split by "\n"
			// Sanitize the string for unicode characters.
			List<String> trimmedCriteriaList = Arrays.asList(criteria);
			boolean inclusionCriteria = false;
			boolean exclusionCriteria = false;
			for (String criteriaValue : trimmedCriteriaList) {
				criteriaValue = criteriaValue.replaceAll("\\|", "");
				if (StringUtils.isNotEmpty(criteriaValue)&& isContainedInInclusionList(criteriaValue)) {
					inclusionCriteria = true;
					exclusionCriteria = false;
					continue;
				}
				if (StringUtils.isNotEmpty(criteriaValue)&& isContainedInExclusionList(criteriaValue)) {
					inclusionCriteria = false;
					exclusionCriteria = true;
					continue;
				}
				if (inclusionCriteria) {
					continue;
				}
				if (exclusionCriteria) {
					if (eligibilityDO.exclusionCriteriaList == null)
						eligibilityDO.exclusionCriteriaList = new ArrayList<>();
					Matcher numberPatternMatcher = numberedPattern.matcher(criteriaValue);
					Matcher dashPatternMatcher = dashPattern.matcher(criteriaValue);
					if (numberPatternMatcher.find()) {
						eligibilityDO.exclusionCriteriaList
								.add(criteriaValue.substring(numberPatternMatcher.group().length()).trim());
					} else if (dashPatternMatcher.find()) {
						eligibilityDO.exclusionCriteriaList
								.add(criteriaValue.substring(dashPatternMatcher.group().length()).trim());
					} else {
						if (eligibilityDO.exclusionCriteriaList.size() > 0) {
							StringBuffer inclusionCriteriaValue = new StringBuffer(
									eligibilityDO.exclusionCriteriaList
											.get(eligibilityDO.exclusionCriteriaList.size() - 1));
							inclusionCriteriaValue.append(" ").append(criteriaValue);
							eligibilityDO.exclusionCriteriaList.set(eligibilityDO.exclusionCriteriaList.size() - 1,
									inclusionCriteriaValue.toString());
						} else {
							eligibilityDO.exclusionCriteriaList.add(criteriaValue);
						}
					}
				}
			}
		} else {
		}
	}
}
