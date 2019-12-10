package com.example.demo;

public class User {

	private String loginMessage;
	private String userId;
	private String password;
	private String name;
	private int age;
	
	
	public String getLoginMessage() {
		return loginMessage;
	}
	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [loginMessage=" + loginMessage + ", userId=" + userId + ", password=" + password + ", name=" + name
				+ ", age=" + age + "]";
	}

	
	
}
