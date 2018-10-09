package com.orange.data;

public class NLPSpecialCharacters {
    // https://www.compart.com/en/unicode/html
    public static final String REGEX_LESS_THAN_OR_EQUAL_TO = "\\u00E2\\u0089\\u00A4";//"≤";
    public static final String REGEX_GREATER_THAN_OR_EQUAL_TO = "\\u00E2\\u0089\\u00A5";//"≥";
    public static final String REGEX_NOT_EQUAL_TO = "\\u00E2\\u0089\\u00A0";//"≠";
    public static final String REGEX_REPLACEMENT = "\\u00E2\\u0089\\u00A0";//"�"


/*
                                    try {
                                        originalString=originalString.replaceAll("\\u00E2\\u0089\\u00A4", "<=");
                                        byte[] testutf8 = originalString.getBytes("UTF-8");
                                        originalString = new String(testutf8,"UTF-8");
                                    }catch(Exception exp){
                                        exp.printStackTrace();
                                    }

 */
}
