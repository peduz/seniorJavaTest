package it.redevTech.seniorJavaTest.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.redevTech.seniorJavaTest.rest.request.SolveQuestionRequest;
import it.redevTech.seniorJavaTest.rest.response.BaseResponse;
import it.redevTech.seniorJavaTest.service.SolveQuestionService;

@RestController
public class SolveQuestionRestController {

	@Autowired
	private SolveQuestionService solveQuestionService;
	
	@GetMapping("/")
	public ResponseEntity<String> checkup() {
		return new ResponseEntity<>("Service up", HttpStatus.OK);
	}
	
	@PostMapping("/solution")
	public ResponseEntity<BaseResponse> getSolution(@RequestBody SolveQuestionRequest request) {
		try {
			return new ResponseEntity<>(solveQuestionService.getSolution(request), HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(new BaseResponse<String>(HttpStatus.BAD_REQUEST.value(), e.getMessage(), ""), HttpStatus.BAD_REQUEST);
		}
	}
}
