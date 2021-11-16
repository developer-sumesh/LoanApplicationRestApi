package com.axis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "loanApplication")
public class LoanApplication {
	@Id
	private int id;
	private String bankName;
	private int minLoanAmount;
	private int maxLoanAmount;
	private int minInterestRate;
	private int minCreditScore;
	private int termLength;
	private int processingFee;
	private float rating;
	private String status;
		
	public LoanApplication() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getMinLoanAmount() {
		return minLoanAmount;
	}

	public void setMinLoanAmount(int minLoanAmount) {
		this.minLoanAmount = minLoanAmount;
	}

	public int getMaxLoanAmount() {
		return maxLoanAmount;
	}

	public void setMaxLoanAmount(int maxLoanAmount) {
		this.maxLoanAmount = maxLoanAmount;
	}

	public int getMinInterestRate() {
		return minInterestRate;
	}

	public void setMinInterestRate(int minInterestRate) {
		this.minInterestRate = minInterestRate;
	}

	public int getMinCreditScore() {
		return minCreditScore;
	}

	public void setMinCreditScore(int minCreditScore) {
		this.minCreditScore = minCreditScore;
	}

	public int getTermLength() {
		return termLength;
	}

	public void setTermLength(int termLength) {
		this.termLength = termLength;
	}

	public int getProcessingFee() {
		return processingFee;
	}

	public void setProcessingFee(int processingFee) {
		this.processingFee = processingFee;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}	
	
}
