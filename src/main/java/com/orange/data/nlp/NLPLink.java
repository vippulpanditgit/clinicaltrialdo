package com.orange.data.nlp;

import java.util.UUID;

public class NLPLink {
	public NLPNode from;
	public NLPNode to;
	public String uuid;

	public NLPLink(NLPNode from, NLPNode to) {
		this.from = from;
		this.to= to;
		uuid = UUID.randomUUID().toString();
	}
	public String toString() {
		return "{\"name\":\""+uuid+"\",\"source\":{\"nodeID\":"
				+(this.from!=null?"\""+this.from.uuid+"\"":"\"\"")+",\"connectorIndex\":0},\"target\":{\"nodeID\":"+(this.to!=null?"\""+this.to.uuid+"\"":"\"\"")+",\"connectorIndex\":0},}";

	}
}
