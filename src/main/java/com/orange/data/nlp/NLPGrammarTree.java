package com.orange.data.nlp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.orange.data.xref.CodeDO;


public class NLPGrammarTree {
	public List<NLPNode> nlpNodeList = new ArrayList<>();
	public List<NLPLink> nlpLinkList = new ArrayList<>();
	public List<List<CodeDO>> inclusionCriteriaListList = new ArrayList<>();
	
	
	public String toString() {
		String nodeValue = String.join(",", nlpNodeList.toString());
		String linkValue = String.join(",", nlpLinkList.toString());
		List<CodeDO> serializedValue = this.inclusionCriteriaListList.stream()
								.filter(inclusionCriteriaListList->inclusionCriteriaListList!=null)
								.flatMap(inclusionCriteriaListList->inclusionCriteriaListList.stream())
								.distinct()
								.collect(Collectors.toList());
		Optional<String> stringValue = serializedValue.stream()
											.map(codeDO->codeDO.id())
											.reduce((id1, id2)->id1+"|"+id2);
		return "\"nodes\":"+nodeValue+",\"links\":"+linkValue
//				+"}"
				+(stringValue.isPresent()?",{"+stringValue.get()+"}":"");
	}
	

}
