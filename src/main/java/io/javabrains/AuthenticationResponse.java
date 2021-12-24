package io.javabrains;

public class AuthenticationResponse {
	
	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}

	private final String jwt;

	public String getJwt() {
		return jwt;
	}
	
}
