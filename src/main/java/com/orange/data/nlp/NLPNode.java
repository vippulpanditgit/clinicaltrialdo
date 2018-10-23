package com.orange.data.nlp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.orange.data.xref.XRef;

public class NLPNode {

	// https://gist.github.com/nlothian/9240750
	public enum NLPNodeType {
		ROOT("Root"),
		FRAG("Fragment"),
		CC("Coordinating conjunction"),
		CD("Cardinal number"),
		DT("Determiner"),
		EX("Existential there"),
		FW("Foreign word"),
		IN("Preposition or subordinating conjunction"),
		JJ("Adjective"),
		JJR("Adjective, comparative"),
		JJS("Adjective, superlative"),
		LS("List item marker"),
		MD("Modal"),
		NN("Noun, singular or mass"),
		NNS("Noun, plural"),
		NNP("Proper noun, singular"),
		NNPS("Proper noun, plural"),
		PDT("Predeterminer"),
		POS("Possessive ending"),
		PRP("Personal pronoun"),
		PRP$("Possessive pronoun"),
		RB("Adverb"),
		RBR("Adverb, comparative"),
		RBS("Adverb, superlative"),
		RP("Particle"),
		SYM("Symbol"),
		TO("to"),
		UH("Interjection"),
		VB("Verb, base form"),
		VBD("Verb, past tense"),
		VBG("Verb, gerund or present participle"),
		VBN("Verb, past participle"),
		VBP("Verb, non-3rd person singular present"),
		VBZ("Verb, 3rd person singular present"),
		WDT("Wh-determiner"),
		WP("Wh-pronoun"),
		WP$("Possessive wh-pronoun"),
		WRB("Wh-adverb"),
// Clause Level
		S("simple declarative clause, i.e. one that is not introduced by a (possible empty) subordinating conjunction or a wh-word and that does not exhibit subject-verb inversion."),
		SBAR("Clause introduced by a (possibly empty) subordinating conjunction."),
		SBARQ("Direct question introduced by a wh-word or a wh-phrase. Indirect questions and relative clauses should be bracketed as SBAR, not SBARQ."),
		SINV("Inverted declarative sentence, i.e. one in which the subject follows the tensed verb or modal."),
		SQ("Inverted yes/no question, or main clause of a wh-question, following the wh-phrase in SBARQ."),
// Phrase Level"),
		NP("Noun Phrase"),
		QP("Quantifier Phrase (i.e. complex measure/amount phrase); used within NP."),
		PP("Prepositional Phrase"),
		ADJP("Adjective Phrase."),
		PRN("Parenthetical"),
		ADVP("Adverb Phrase"),
		VP("Verb Phrase"),
		WHNP("Wh-noun Phrase. Introduces a clause with an NP gap. May be null (containing the 0 complementizer) or lexical, containing some wh-word, e.g. who, which book, whose daughter, none of which, or how many leopards."),
		WHAVP("Wh-adverb Phrase. Introduces a clause with an NP gap. May be null (containing the 0 complementizer) or lexical, containing a wh-adverb such as how or why."),
		UCP("Unlike Coordinated Phrase."),
		LST("List maker. Includes surrounding punctuation."),
		WHADVP("Wh-adjective Phrase. Adjectival phrase containing a wh-adverb, as in how hot."),
		X("Unknown, uncertain, or unbracketable. X is often used for bracketing typos and in bracketing the...the-constructions."),
		WHPP("Wh-prepositional Phrase. Prepositional phrase containing a wh-noun phrase (such as of which or by whose authority) that either introduces a PP gap or is contained by a WHNP."),
		PRT("Particle. Category for words that should be tagged RP."),
		RRC("Reduced Relative Clause."),
		NX("Used within certain complex NPs to mark the head of the NP. Corresponds very roughly to N-bar level but used quite differently."),
		CONJP("Conjunction Phrase"),
		NAC("Not a Constituent; used to show the scope of certain prenominal modifiers within an NP."),
		INTJ("Interjection. Corresponds approximately to the part-of -speech tag"),
		;
		private String description;
		
		NLPNodeType(String description) {
			this.description = description;
		}
		public String getDescription(){
			return this.description;
		}
	}
	public NLPNodeType type;
	public String value;
	public String namespace; // should be in the format of "ROOT/NN/NNS..."
	public List<XRef> xMedicalCodeRefListOfList;
	public String uuid;
	
	public NLPNode(String nodetype) {
		type = NLPNodeType.valueOf(nodetype);
		uuid = UUID.randomUUID().toString();
		xMedicalCodeRefListOfList = new ArrayList<>();
	}
	public String toString() {
		return "{\"type\":\""+type.name()+"\",\"uuid\":\""+uuid+"\",\"namespace\":\""+namespace+"\",\"value\":\""+value+"\",\"xref\":"+xMedicalCodeRefListOfList.toString()+"}";
	}

}
