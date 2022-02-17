package it.redevTech.seniorJavaTest.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import it.redevTech.seniorJavaTest.rest.request.SolveQuestionRequest;
import it.redevTech.seniorJavaTest.rest.response.BaseResponse;
import it.redevTech.seniorJavaTest.service.SolveQuestionService;
import it.redevTech.seniorJavaTest.solver.Solver;
import it.redevTech.seniorJavaTest.solverFactory.SolverFactory;
import it.redevTech.seniorJavaTest.solverFactory.impl.SolverFactoryImpl;

@Service
public class SolveQuestionServiceImpl implements SolveQuestionService {

	@Override
	public BaseResponse getSolution(SolveQuestionRequest request) throws Exception {
		try {
			SolverFactory factory = new SolverFactoryImpl();

			Solver solver = factory.getSolver(request.getQuestion());
			
			return new BaseResponse(HttpStatus.OK.value(), "Ok", solver.solve(request.getInput()));
		} catch (Exception e) {
			throw e;
		}
	}

}
