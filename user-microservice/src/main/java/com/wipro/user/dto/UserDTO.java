package com.wipro.user.dto;


public class UserDTO {  // pojo class

	private long userId;
	private String userName;
	private String email;
	private long  departmentId;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(long userId, String userName, String email, long departmentId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.departmentId = departmentId;
	}
	
	
}
