package kr.re.kitri.park.controller;

import kr.re.kitri.park.util.ApiResponse.ApiError;

public class ClientException extends RuntimeException{

	private final int errorCode;
	private final String errorDescription;

	public ClientException(ApiError error) {
		super(error.getErrorCode() + ": " + error.getDescription());
		this.errorCode = error.getErrorCode();
		this.errorDescription = error.getDescription();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public ClientException(int errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

}
