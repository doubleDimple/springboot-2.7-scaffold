package com.example.securityjwt.entity.query;



/**
 * 
 * 参数
 * 
 */
public class UserQuery extends BaseParam{


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 
	 */
	private String userName;

	private String userNameFuzzy;

	/**
	 * 
	 */
	private String password;

	private String passwordFuzzy;

	/**
	 * 
	 */
	private String userAge;

	private String userAgeFuzzy;

	/**
	 * 
	 */
	private String role;

	private String roleFuzzy;


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

	public void setUserNameFuzzy(String userNameFuzzy){
		this.userNameFuzzy = userNameFuzzy;
	}

	public String getUserNameFuzzy(){
		return this.userNameFuzzy;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public void setPasswordFuzzy(String passwordFuzzy){
		this.passwordFuzzy = passwordFuzzy;
	}

	public String getPasswordFuzzy(){
		return this.passwordFuzzy;
	}

	public void setUserAge(String userAge){
		this.userAge = userAge;
	}

	public String getUserAge(){
		return this.userAge;
	}

	public void setUserAgeFuzzy(String userAgeFuzzy){
		this.userAgeFuzzy = userAgeFuzzy;
	}

	public String getUserAgeFuzzy(){
		return this.userAgeFuzzy;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return this.role;
	}

	public void setRoleFuzzy(String roleFuzzy){
		this.roleFuzzy = roleFuzzy;
	}

	public String getRoleFuzzy(){
		return this.roleFuzzy;
	}

}
