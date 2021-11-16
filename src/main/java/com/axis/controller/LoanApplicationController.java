package com.axis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.entity.LoanApplication;
import com.axis.service.ILoanApplicationService;

@RestController
@RequestMapping(value="/api/v1")
public class LoanApplicationController {
	
	@Autowired
	ILoanApplicationService iLoanApplicationService;
	
	@PostMapping(value="/applyloan")
	public ResponseEntity<LoanApplication> saveLoanApplicationToDb(@RequestBody LoanApplication loanapplication)
	{
		return new ResponseEntity<LoanApplication>(iLoanApplicationService.saveLoanApplication(loanapplication),HttpStatus.OK);
	}
	
	@GetMapping(value = "/approveLoan/{loanId}")
	public ResponseEntity<LoanApplication> approveLoanApplication(@PathVariable int loanId){
		return new ResponseEntity<LoanApplication>(iLoanApplicationService.approveLoanApplication(loanId), HttpStatus.OK);
	}
	
	@GetMapping(value = "/rejectLoan/{loanId}")
	public ResponseEntity<LoanApplication> rejectLoanApplication(@PathVariable int loanId){
		return new ResponseEntity<LoanApplication>(iLoanApplicationService.rejectLoanApplication(loanId), HttpStatus.OK);
	}
	
}
