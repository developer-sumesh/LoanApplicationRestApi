package com.axis.exception;

public class LoanApplicationNotFoundException extends RuntimeException{
	private String msg;

	public LoanApplicationNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
