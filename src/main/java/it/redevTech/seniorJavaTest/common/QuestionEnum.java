package it.redevTech.seniorJavaTest.common;

import com.fasterxml.jackson.annotation.JsonValue;

public enum QuestionEnum {
	SUM_TWO_VALUES_ARRAY("sumTwoValues");
	
	private String value;
	
	private QuestionEnum(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}
	
}
