package kr.re.kitri.park.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import kr.re.kitri.park.util.ApiResponse;
import kr.re.kitri.park.util.ApiResponse.Status;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = IllegalArgumentException.class)
	public ApiResponse handleIllegalAE(Exception e) {
//		return "hello, exception";
		return new ApiResponse(
				Status.ERROR, null, 
				new ApiResponse.ApiError(0, e.getMessage()));
	}
	
	@ExceptionHandler(value = Exception.class)
	public ApiResponse handle(Exception e) {
//		return "hello, exception";
		return new ApiResponse(
				Status.ERROR, null, 
				new ApiResponse.ApiError(0, e.getMessage()));
	}
}
