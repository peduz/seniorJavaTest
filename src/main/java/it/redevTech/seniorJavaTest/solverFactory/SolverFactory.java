package it.redevTech.seniorJavaTest.solverFactory;

import it.redevTech.seniorJavaTest.common.QuestionEnum;
import it.redevTech.seniorJavaTest.solver.Solver;

public interface SolverFactory {

	public Solver<?, ?> getSolver(QuestionEnum question) throws Exception;
}
