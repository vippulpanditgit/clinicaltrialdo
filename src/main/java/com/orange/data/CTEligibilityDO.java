package com.orange.data;

import org.apache.commons.lang3.StringUtils;

import com.orange.data.nlp.NLPGrammarTree;
import com.orange.data.nlp.NLPXRefMedicalCodes;
import com.orange.data.util.CTEligibilityUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CTEligibilityDO extends CTBaseDO {
    private static String PRE_ELIGIBILITY_FILE_LINE_SPLIT_REGEX = "\\|(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)";
    private static String POST_ELIGIBILITY_FILE_LINE_SPLIT_REGEX = "\\|(?=(?:[^\"]*\"[^\"]*\")*[^\"]*)";

   public static final String SAMPLING_METHOD = "sampling_method";
   public String sampling_method;
   public static final String GENDER = "gender";
   public String gender;
   public static final String MINIMUM_AGE = "MINIMUM_AGE";
   public String minimum_age;
   public static final String MAXIMUM_AGE = "MAXIMUM_AGE";
   public String maximum_age;
   public static final String HEALTHY_VOLUNTEERS = "healthy_volunteers";
   public String healthy_volunteers;
   public static final String POPULATION = "population";
   public String population;
   public static final String CRITERIA = "criteria";
   public String criteria;
   public static final String GENDER_DESCRIPTION = "gender_description";
   public String gender_description;
   public static final String GENDER_BASED = "gender_based";
   public String gender_based;
   public static final String INCLUSION_CRITIERIA_LIST = "inclusionCriteriaList";
   public List<String> inclusionCriteriaList;
   public static final String EXCLUSION_CRITERIA_LIST = "exclusionCriteriaList";
   public List<String> exclusionCriteriaList;
   public static final String PARSED_INCLUSION_CRITERIA_LIST = "parsedInclusionCriteriaList";
   public List<String> parsedInclusionCriteriaList;
   public static final String PARSED_EXCLUSION_CRITERIA_LIST = "parsedExclusionCriteriaList";
   public List<String> parsedExclusionCriteriaList;
   
   private static final String NLP_INCLUSION_GRAMMAR_TREE_LIST = "nlpInclusionGrammarTreeList";
   public List<NLPGrammarTree> nlpInclusionGrammarTreeList;
   private static final String NLP_EXCLUSION_GRAMMAR_TREE_LIST = "nlpExclusionGrammarTreeList";

   public List<NLPGrammarTree> nlpExclusionGrammarTreeList;
   public List<CTCriteriaDO> inclusionCriteriaListV2;
   public List<CTCriteriaDO> exclusionCriteriaListV2;
   
   private static final String NODE_LINK_REPRESENTATION = "nodeLinkRepresentaiton";
   public String nodeLinkRepresentaiton;
   public NLPXRefMedicalCodes nlpXRefMedicalCodes;

	public Map<String, Object> attributeMap() {
		Map<String, Object> map = super.attributeMap();
		map.put(SAMPLING_METHOD, nullable(sampling_method));
		map.put(GENDER, nullable(gender));
		map.put(MINIMUM_AGE, nullable(minimum_age));
		map.put(MAXIMUM_AGE, nullable(maximum_age));
		map.put(HEALTHY_VOLUNTEERS, nullable(healthy_volunteers));
		map.put(POPULATION, nullable(population));
		map.put(CRITERIA, nullable(criteria));
		map.put(GENDER_DESCRIPTION, nullable(gender_description));
		map.put(GENDER_BASED, nullable(gender_based));
		map.put(INCLUSION_CRITIERIA_LIST, nullable(inclusionCriteriaList));
		map.put(EXCLUSION_CRITERIA_LIST, nullable(exclusionCriteriaList));
		map.put(PARSED_INCLUSION_CRITERIA_LIST, nullable(parsedInclusionCriteriaList));
		map.put(PARSED_EXCLUSION_CRITERIA_LIST, nullable(parsedExclusionCriteriaList));
		map.put(NLP_INCLUSION_GRAMMAR_TREE_LIST, null);
		map.put(NLP_EXCLUSION_GRAMMAR_TREE_LIST, null);
		map.put(NODE_LINK_REPRESENTATION, nullable(nodeLinkRepresentaiton));
		
		
		return map;
	}
	public void deAttributeMap(Map<String, Object> map) {
		super.deAttributeMap(map);
		sampling_method = (String)map.get(SAMPLING_METHOD);
		gender = (String)map.get(GENDER);
		minimum_age = (String)map.get(MINIMUM_AGE);
		maximum_age = (String)map.get(MAXIMUM_AGE);
		healthy_volunteers = (String)map.get(HEALTHY_VOLUNTEERS);
		population = (String)map.get(POPULATION);
		criteria = (String)map.get(CRITERIA);
		gender_description = (String)map.get(GENDER_DESCRIPTION);
		gender_based = (String)map.get(GENDER_BASED);
		inclusionCriteriaList = (List<String>)map.get(INCLUSION_CRITIERIA_LIST);
		exclusionCriteriaList = (List<String>)map.get(EXCLUSION_CRITERIA_LIST);
		
		
		nodeLinkRepresentaiton = (String)map.get(NODE_LINK_REPRESENTATION);
		
	}
   public boolean equals(Object eligibilityDO) {
       if(!(eligibilityDO instanceof CTEligibilityDO))
           return false;
       return StringUtils.equalsIgnoreCase(((CTEligibilityDO)eligibilityDO).nct_Id, nct_Id);
   }
   public String toString() {
	   
		Optional<String> concatParsedInclusion = Optional.empty();
		Optional<String> concatParsedExclusion = Optional.empty();
		if(parsedInclusionCriteriaList!=null && !parsedInclusionCriteriaList.isEmpty())
			concatParsedInclusion= this.parsedInclusionCriteriaList.stream().reduce((t, u) -> t + "," + u);
		if(parsedExclusionCriteriaList!=null &&!parsedExclusionCriteriaList.isEmpty())
			concatParsedExclusion=this.parsedExclusionCriteriaList.stream().reduce((t, u) -> t + "," + u);
		Optional<String> concatInclusion = Optional.empty();
		Optional<String> concatExclusion = Optional.empty();
		if(inclusionCriteriaList!=null && !inclusionCriteriaList.isEmpty())
			concatInclusion= this.inclusionCriteriaList.stream().reduce((t, u) -> t + "," + u);
		if(parsedExclusionCriteriaList!=null &&!exclusionCriteriaList.isEmpty())
			concatExclusion=this.exclusionCriteriaList.stream().reduce((t, u) -> t + "," + u);

	   return id
               + "|"+nct_Id+"|"+sampling_method
			   + "|"+gender+"|"+minimum_age+"|"+maximum_age+"|"+healthy_volunteers
			   + "|"+population+"|"+criteria+"|"+gender_description
			   + "|"+gender_based
			   + (concatInclusion.isPresent()?"|"+concatInclusion.get():"|")
			   + (concatExclusion.isPresent()?"|"+concatExclusion.get():"|")
			   + (concatParsedInclusion.isPresent()?"|["+concatParsedInclusion.get()+"]":"|")
			   + (concatParsedExclusion.isPresent()?"|["+concatParsedExclusion.get()+"]":"|")
               + "|"+nodeLinkRepresentaiton;
   }
   public void deserialize(String[] data, boolean isExtendeFileFormat) {
	   String[] postProcessList = data;
	   this.deserialize(data);
	   //Extended Format
	   if (data.length > 11) {
		   this.inclusionCriteriaList = Arrays.asList(data[11].split(","));
	   } else if(this.criteria!=null && this.criteria.length()>0) {
		   CTEligibilityUtil.inclusion(this);
	   }
	   if (data.length > 12) {
		   this.exclusionCriteriaList = Arrays.asList(data[12].split(","));
	   } else if(this.criteria!=null && this.criteria.length()>0) {
		   CTEligibilityUtil.exclusion(this);
	   }

/*	   if (postProcessList!=null&& postProcessList.length>1) {
		   this.parsedInclusionCriteriaList = Arrays.asList("{\"inclusion\":["+postProcessList[1]+"}");
	   }
	   if (postProcessList!=null&& postProcessList.length>2) {
		   this.parsedExclusionCriteriaList = Arrays.asList("{\"exclusion\\\":["+postProcessList[2]+"]");
	   }*/	
   }
   public void deserialize(String line, boolean extendedFormatFile) {
       String[] postProcessList = line.split("\\|\\[");
       String originalString = line;
       if(postProcessList.length>0) {
           originalString = postProcessList[0].replace("null", "");
       }
       String[] data = originalString.split(PRE_ELIGIBILITY_FILE_LINE_SPLIT_REGEX);
       if(extendedFormatFile)
           data = originalString.split(POST_ELIGIBILITY_FILE_LINE_SPLIT_REGEX);
       this.deserialize(data, extendedFormatFile);
       //Extended Format
       if (data.length > 11) {
           this.inclusionCriteriaList = Arrays.asList(data[11].split(","));
       } else if(this.criteria!=null && this.criteria.length()>0) {
    	   CTEligibilityUtil.inclusion(this);
       }
       if (data.length > 12) {
           this.exclusionCriteriaList = Arrays.asList(data[12].split(","));
       } 
       if((this.inclusionCriteriaList==null || this.inclusionCriteriaList.size()==0)
    		   && (this.exclusionCriteriaList==null || this.exclusionCriteriaList.size()==0)) {
    	   if(this.criteria!=null && this.criteria.length()>0) {
    		   CTEligibilityUtil.exclusion(this);
    	   }
       }
       if (postProcessList!=null&& postProcessList.length>1) {
           this.parsedInclusionCriteriaList = Arrays.asList("{\"inclusion\":["+postProcessList[1]+"}");
       }
       if (postProcessList!=null&& postProcessList.length>2) {
           this.parsedExclusionCriteriaList = Arrays.asList("["+postProcessList[2]);
       }

   }
	public void deserialize(String[] data) {
	       if (data.length > 0)
	           this.id = data[0];
	       if (data.length > 1) {
	           this.nct_Id = data[1];
	       }
	       if (data.length > 2)
	           this.sampling_method = data[2];
	       if (data.length > 3)
	           this.gender = data[3];
	       if (data.length > 4)
	           this.minimum_age = data[4];
	       if (data.length > 5)
	           this.maximum_age = data[5];
	       if (data.length > 6)
	           this.healthy_volunteers = data[6];
	       if (data.length > 7)
	           this.population = data[7];
	       if (data.length > 8)
	           this.criteria = sanatize(data[8]);
	       if (data.length > 9)
	           this.gender_description = data[9];
	       if (data.length > 10)
	           this.gender_based = data[10];
		
	}
}
