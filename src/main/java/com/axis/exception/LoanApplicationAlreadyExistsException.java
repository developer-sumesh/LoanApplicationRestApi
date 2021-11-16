package com.axis.exception;

public class LoanApplicationAlreadyExistsException extends RuntimeException {
	private String msg;

	public LoanApplicationAlreadyExistsException(String msg) {
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
