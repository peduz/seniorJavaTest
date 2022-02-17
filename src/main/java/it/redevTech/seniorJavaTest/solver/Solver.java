package it.redevTech.seniorJavaTest.solver;

public interface Solver<T, E> {

	public T solve(E params) throws Exception;
}
