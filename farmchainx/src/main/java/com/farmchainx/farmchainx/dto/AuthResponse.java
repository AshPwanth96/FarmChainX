package com.farmchainx.farmchainx.dto;

public class AuthResponse {

	private String token;
	private String role;
	private String email;
	private long expiresAt;
	
	
	public AuthResponse(String token, String role, String email, long expiresAt) {
		super();
		this.token = token;
		this.role = role;
		this.email = email;
		this.expiresAt = expiresAt;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getExpiresAt() {
		return expiresAt;
	}
	public void setExpiresAt(long expiresAt) {
		this.expiresAt = expiresAt;
	}
	
	
}
