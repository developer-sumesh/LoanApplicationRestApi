package com.axis.service;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dao.IloanApplicationDao;
import com.axis.entity.LoanApplication;
import com.axis.exception.LoanApplicationAlreadyExistsException;
import com.axis.exception.LoanApplicationNotFoundException;

@Service
public class LoanApplicationServiceImpl implements ILoanApplicationService {

	@Autowired
	IloanApplicationDao loanApplicationDao;
	
	@Override
	public LoanApplication saveLoanApplication(LoanApplication loanApplication){
		// TODO Auto-generated method stub
		try{
			loanApplicationDao.findById(loanApplication.getId()).get();
			throw new LoanApplicationAlreadyExistsException("Loan Application Already exist");
		 }
		catch(NoSuchElementException e) {
			loanApplicationDao.save(loanApplication);
			return loanApplication;
		}
	}

	@Override
	public LoanApplication approveLoanApplication(int loanId){
		// TODO Auto-generated method stub
		try {
			LoanApplication loanApplication;
			loanApplication = loanApplicationDao.findById(loanId).get();
			loanApplication.setStatus("Approved");
			loanApplicationDao.deleteById(loanId);
			loanApplicationDao.save(loanApplication);
			return loanApplication;
		}
		catch(NoSuchElementException e){
			throw new LoanApplicationNotFoundException("Loan Application Not Found");
		}
		
	}

	@Override
	public LoanApplication rejectLoanApplication(int loanId){
		// TODO Auto-generated method stub
		try {
			LoanApplication loanApplication;
			loanApplication = loanApplicationDao.findById(loanId).get();
			loanApplication.setStatus("Rejected");
			loanApplicationDao.deleteById(loanId);
			loanApplicationDao.save(loanApplication);
			return loanApplication;
		}
		catch(NoSuchElementException e){
			throw new LoanApplicationNotFoundException("Loan Application Not Found");
		}
	}

}
