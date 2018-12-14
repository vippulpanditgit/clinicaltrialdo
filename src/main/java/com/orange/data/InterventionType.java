package com.orange.data;

public enum InterventionType {
	BEHAVIORAL("Behavioral"),
	DIAGNOSTIC_TEST("Diagnostic Test"),
	OTHER("Other"),
	RADIATION("Radiation"),
	PROCEDURE("Procedure"),
	DEVICE("Device"),
	DIETARY_SUPPLEMENT("Dietary Supplement"),
	GENETIC("Genetic"),
	COMBINATION("Combination Product"),
	DRUG("Drug"),
	BIOLOGICAL("Biological");
	private String value;
	InterventionType(String value) {
		value = value;
	}
	String get() {
		return value;
	}
	

}
