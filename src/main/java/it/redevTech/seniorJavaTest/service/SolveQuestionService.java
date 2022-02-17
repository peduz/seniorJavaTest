package it.redevTech.seniorJavaTest.service;

import org.springframework.stereotype.Service;

import it.redevTech.seniorJavaTest.rest.request.SolveQuestionRequest;
import it.redevTech.seniorJavaTest.rest.response.BaseResponse;

@Service
public interface SolveQuestionService {

	
	BaseResponse getSolution(SolveQuestionRequest request) throws Exception;
}
