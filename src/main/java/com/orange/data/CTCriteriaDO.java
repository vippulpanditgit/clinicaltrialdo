package com.orange.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.orange.data.xref.CodeDO;

public class CTCriteriaDO implements Serializable, Cloneable {
	public List<String> origCriteria;
	public List<String> parsedCriteria;
	public List<List<CodeDO>> codeXformListList;
	
	public CTCriteriaDO() {
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
