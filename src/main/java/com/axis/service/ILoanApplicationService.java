package com.axis.service;

import com.axis.entity.LoanApplication;
import com.axis.exception.LoanApplicationAlreadyExistsException;
import com.axis.exception.LoanApplicationNotFoundException;

public interface ILoanApplicationService {
	
	LoanApplication saveLoanApplication(LoanApplication loanApplication);
	LoanApplication approveLoanApplication(int loanId);
	LoanApplication rejectLoanApplication(int loanId);
	
}
