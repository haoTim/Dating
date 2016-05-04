package com.dating.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



/**
 * User类
 * 
 *user(
 * user_id,	主键，取值方式为  自增
 * account,	账号
 * password,密码
 * userName,用户名
 * sex,性别
 * identificationID,身份证
 * trueName,姓名
 * birthday,出生年月
 * telephone,联系电话
 * email,邮箱
 * description,描述
 * college,所读大学
 * intendedTime,入学时间
 * userPhotoPath 用户头像路径
 * )
 * */
public class User implements Serializable {
	
	private long user_id; 
	private String account;
	private String password;
	private String userName;
	private String sex;
	private String identificationID;
	private String trueName;
	private Date birthday;
	private String telephone;
	private String email;
	private String description;
	private String college;
	private Date intendedTime;
	private String userPhotoPath;
	private Set<PostInfo> posts=new HashSet<PostInfo>();
	
	
	public User(){}
	
	public User(//long user_id,
			String account,String password,String userName,
			String sex,String identificationID,String trueName,
			Date birthday,String telephone,String email,String description,
			String college,Date intendedTime,String userPhotoPath)
	{
		// this.user_id=user_id;
		 this.account=account;
		 this.password=password;
		 this.userName=userName;
		 this.sex=sex;
		 this.identificationID=identificationID;
		 this.trueName=trueName;
		 this.birthday=birthday;
		 this.telephone=telephone;
		 this.email=email;
		 this.description=description;
		 this.college=college;
		 this.intendedTime=intendedTime;
		 this.userPhotoPath=userPhotoPath;
	}
	
	
	
	public long getUser_id() {
		return user_id;
	}
	public String getAccount() {
		return account;
	}
	public String getPassword() {
		return password;
	}
	public String getUserName() {
		return userName;
	}
	public String getSex() {
		return sex;
	}
	public String getIdentificationID() {
		return identificationID;
	}
	public String getTrueName() {
		return trueName;
	}
	
	public String getTelephone() {
		return telephone;
	}
	public String getEmail() {
		return email;
	}
	public String getDescription() {
		return description;
	}
	public String getCollege() {
		return college;
	}
	
	public String getUserPhotoPath() {
		return userPhotoPath;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setIdentificationID(String identificationID) {
		this.identificationID = identificationID;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	
	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public Date getIntendedTime() {
		return intendedTime;
	}



	public void setIntendedTime(Date intendedTime) {
		this.intendedTime = intendedTime;
	}



	public void setUserPhotoPath(String userPhotoPath) {
		this.userPhotoPath = userPhotoPath;
	}


	public Set<PostInfo> getPosts() {
		return posts;
	}


	public void setPosts(Set<PostInfo> posts) {
		this.posts = posts;
	}
	
	
	

}
