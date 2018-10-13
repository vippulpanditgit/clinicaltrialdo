package com.orange.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;


public abstract class CTBaseDO {
	public String ID="id";
	public String NCT_ID="nct_Id";
	public List<String> attributes = Arrays.asList(ID, NCT_ID);
	public String id;
	public String nct_Id;
	
	public String key() {
		return nct_Id;
	}
	public abstract void deserialize(String[] data);
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
	
	protected String sanatize(String sentence) {
		if(sentence==null||sentence.length()==0)
			return null;
		String[] splitSentence = sentence.split("~");
		List<String> splitSentenceList = new LinkedList<>(Arrays.asList(splitSentence));
		List<Integer> removalIndexList = new ArrayList<>();
		for(int index=0;index<splitSentenceList.size();index++) {
			if(StringUtils.trim(splitSentenceList.get(index)).length()==0
					|| StringUtils.equalsAnyIgnoreCase(StringUtils.trim(splitSentenceList.get(index)), "\"")){
				removalIndexList.add(index);
				continue;
			}
			if(splitSentenceList.get(index).charAt(0)==' ') {
				splitSentenceList.set(index, StringUtils.trim(splitSentenceList.get(index)));
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
		return String.join(" ", splitSentenceList);
	}
}
