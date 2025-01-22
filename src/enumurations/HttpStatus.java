package enumurations;

public enum HttpStatus {

	
	SUCCESS(200),
	CLIENT_ERROR(400),
	SERVER_ERROR(500);
	
	private int statusCode;
	
	private HttpStatus(int statusCode) {
		this.statusCode=statusCode;
	}
	
	public int getStatusCode() {
		return this.statusCode;
	}
	
}
