package com.orange.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.orange.global.GlobalInstance;


public abstract class CTBaseDO {
	public static final String ID="id";
	public static final String NCT_ID="nct_Id";
	public static final List<String> attributes = Arrays.asList(ID, NCT_ID);
	public String id;
	public String nct_Id;
	
	public String key() {
		return nct_Id;
	}
	public abstract void deserialize(String[] data, boolean isExtendeFileFormat);
	public Map<String, Object> attributeMap() {
		Map<String, Object> map = new HashMap<>();
		map.put(ID, id);
		map.put(NCT_ID, nct_Id);
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		id = (String)map.get(ID);
		nct_Id = (String)map.get(NCT_ID);
	}

	private static String[] SENTENCE_STARTS_WITH = {
			"[0-9]+[\\.\\)]",
			"M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})[\\.\\)]",
	};
	private Pattern[] getSentencePattern() {
		Pattern[] pattern = new Pattern[SENTENCE_STARTS_WITH.length];
		for(int index=0;index< SENTENCE_STARTS_WITH.length;index++) {
			pattern[index] = Pattern.compile(SENTENCE_STARTS_WITH[index]);
		}
		return pattern;
	}
	private void test(String sentence) {
		Pattern[] patterns = this.getSentencePattern();
		for(int index=0;index<patterns.length;index++) {
			Matcher matcher = patterns[index].matcher(sentence);
	        // check all occurance
	        while (matcher.find()) {
	            System.out.print("Start index: " + matcher.start());
	            System.out.print(" End index: " + matcher.end() + " ");
	            System.out.println(matcher.group());
	        }
		}
		
	}
	protected String nullable(String value) {
		if(value==null||value.length()==0)
			return null;
		return value;
	}
	protected List<String> nullable(List<String> value) {
		if(value==null||value.size()==0)
			return null;
		List<String> removeBlankLines = new ArrayList<>();
		for(int index=0;index<value.size();index++) {
			if(StringUtils.isNotBlank(value.get(index)))
				removeBlankLines.add(value.get(index));
		}
		return removeBlankLines;
	}
	protected String sanatize(String sentence) {
		if(sentence==null||sentence.length()==0)
			return null;
		String[] splitSentence = sentence.split("~");
		List<String> splitSentenceList = new LinkedList<>(Arrays.asList(splitSentence));
		List<Integer> removalIndexList = new ArrayList<>();
		boolean isNewSentence = false;
		int startSentenceIndex = 0;
		for(int index=0;index<splitSentenceList.size();index++) {
			if(StringUtils.trim(splitSentenceList.get(index)).length()==0
					|| StringUtils.equalsAnyIgnoreCase(StringUtils.trim(splitSentenceList.get(index)), "\"")){
				removalIndexList.add(index);
				continue;
			}
			if(splitSentenceList.get(index).charAt(0)==' ') {
				splitSentenceList.set(index, StringUtils.trim(splitSentenceList.get(index)));
			}
			if(!isNewSentence && splitSentenceList.get(index).charAt(0)=='-') {
				startSentenceIndex = index;
				isNewSentence = true;
			}
			if(isNewSentence && !(splitSentenceList.get(index).charAt(0)=='-')) {
				String startSentence = splitSentenceList.get(startSentenceIndex)+" "+splitSentenceList.get(index);
				splitSentenceList.set(startSentenceIndex, startSentence);
				removalIndexList.add(index);
				if(splitSentenceList.get(index).charAt(splitSentenceList.get(index).length()-1)=='.') 
					isNewSentence = false;
			}
			splitSentenceList.set(index,StringUtils.replaceAll(splitSentenceList.get(index), NLPSpecialCharacters.REGEX_GREATER_THAN_OR_EQUAL_TO, ">="));
			splitSentenceList.set(index,StringUtils.replaceAll(splitSentenceList.get(index), NLPSpecialCharacters.REGEX_LESS_THAN_OR_EQUAL_TO, "<="));
			splitSentenceList.set(index,StringUtils.replaceAll(splitSentenceList.get(index), NLPSpecialCharacters.REGEX_NOT_EQUAL_TO, "!="));
		}
		int arrayIndex = 0;
		if(removalIndexList.size()>0) {
			for(int index=0;index<removalIndexList.size();index++) {
				splitSentenceList.remove(((Integer)removalIndexList.get(index)).intValue()-arrayIndex);
				arrayIndex++;
			}
		}
		for(int index=0;index<splitSentenceList.size();index++) {
			StringTokenizer st = new StringTokenizer(splitSentenceList.get(index));
		     while (st.hasMoreTokens()) {
		    	 String token = st.nextToken().toLowerCase();
		    	 if(GlobalInstance.getInstance().tokenMap.get(token)!=null) {
		    		 GlobalInstance.getInstance().tokenMap.put(token, GlobalInstance.getInstance().tokenMap.get(token).intValue()+1);
		    	 } else {
		    		 GlobalInstance.getInstance().tokenMap.put(token, 1);
		    	 }
		     }
		}
		return String.join("\n", splitSentenceList);
	}
	public void update(ResultSet query) throws SQLException {
		id = query.getString(ID);
		this.nct_Id = query.getString(NCT_ID);
		
	}
}
