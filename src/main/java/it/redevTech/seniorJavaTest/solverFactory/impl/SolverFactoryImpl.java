package it.redevTech.seniorJavaTest.solverFactory.impl;

import it.redevTech.seniorJavaTest.common.QuestionEnum;
import it.redevTech.seniorJavaTest.common.SolverEnum;
import it.redevTech.seniorJavaTest.solver.Solver;
import it.redevTech.seniorJavaTest.solverFactory.SolverFactory;

public class SolverFactoryImpl implements SolverFactory {

	@Override
	public Solver<?, ?> getSolver(QuestionEnum question) throws Exception {
		return (Solver<?, ?>) SolverEnum.getFromQuestion(question).getConstructor().newInstance();
	}

}
