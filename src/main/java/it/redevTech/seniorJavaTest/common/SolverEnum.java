package it.redevTech.seniorJavaTest.common;

import it.redevTech.seniorJavaTest.solver.impl.ArraySolver;
import it.redevTech.seniorJavaTest.solver.impl.SumSubarraySolver;

public enum SolverEnum {

	SUM_TWO_VALUES_ARRAY_SOLVER(QuestionEnum.SUM_TWO_VALUES_ARRAY, ArraySolver.class),
	SUM_SUBARRAY_SOLVER(QuestionEnum.SUM_SUBARRAY, SumSubarraySolver.class);

	private Class<?> solver;

	private QuestionEnum question;

	private SolverEnum(QuestionEnum question, Class<?> solver) {
		this.question = question;
		this.solver = solver;
	}

	public static Class<?> getFromQuestion(QuestionEnum question) {
		for (SolverEnum item : values()) {
			if (item.question.equals(question)) {
				return item.solver;
			}
		}
		return null;
	}

	public QuestionEnum getQuestion() {
		return question;
	}

	public Class<?> getSolver() {
		return solver;
	}

}
