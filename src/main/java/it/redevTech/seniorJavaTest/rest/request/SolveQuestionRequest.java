package it.redevTech.seniorJavaTest.rest.request;

import java.io.Serializable;
import java.util.Arrays;

import it.redevTech.seniorJavaTest.common.QuestionEnum;

public class SolveQuestionRequest implements Serializable {

	private static final long serialVersionUID = 2456680540820958617L;
	
	private QuestionEnum question;
	
	private Integer[] input;

	public QuestionEnum getQuestion() {
		return question;
	}

	public void setQuestion(QuestionEnum question) {
		this.question = question;
	}

	public Integer[] getInput() {
		return input;
	}

	public void setInput(Integer[] input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return "SolveQuestionRequest [question=" + question + ", input=" + Arrays.toString(input) + "]";
	}
	
}
