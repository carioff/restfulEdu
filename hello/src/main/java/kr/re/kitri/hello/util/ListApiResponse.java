package kr.re.kitri.hello.util;

import java.util.List;

import kr.re.kitri.hello.util.ApiResponse.ApiError;
import kr.re.kitri.hello.util.ApiResponse.Status;

public class ListApiResponse {

    private final Status status;
    private final List<Object> data;
    private final ApiError error;
    private final int pageNumber;
    private final String nextPage;
    private final long total;

    public ListApiResponse(Status status, 
				    		List<Object> data, 
				    		ApiError error, 
				    		int pageNumber, 
				    		String nextPage,
				    		long total) {
        this.status = status;
        this.data = data;
        this.error = error;
        this.pageNumber = pageNumber;
        this.nextPage = nextPage;
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public List<Object> getData() {
        return data;
    }

    public ApiError getError() {
        return error;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getNextPage() {
        return nextPage;
    }

    public long getTotal() {
        return total;
    }
}
