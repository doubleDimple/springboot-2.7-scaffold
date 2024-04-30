package com.example.securityjwt.entity.pojo;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class User implements Serializable {


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 
	 */
	private String userName;

	/**
	 * 
	 */
	private String password;

	/**
	 * 
	 */
	private String userAge;

	/**
	 * 
	 */
	private String role;


	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setUserAge(String userAge){
		this.userAge = userAge;
	}

	public String getUserAge(){
		return this.userAge;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

	public String toString (){
		return "userId:"+(userId == null ? "空" : userId)+"，userName:"+(userName == null ? "空" : userName)+"，password:"+(password == null ? "空" : password)+"，userAge:"+(userAge == null ? "空" : userAge)+"，role:"+(role == null ? "空" : role);
	}
}
