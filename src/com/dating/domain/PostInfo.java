package com.dating.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * postInfo   finding模块是发布的择偶信息表
 * post_id,   主键 ，自增长
 * fordollPhotoPath,  求偶人照片的图片地址
 * intendedTime,  入学时间
 * college, 所读大学
 * characters,  性格
 * standard, 择偶标准
 * desert    发布者心愿
 * user_id,  发布者id    外键
 * postTime  发布时间 
 * likeNumber 点赞数               
 * */
public class PostInfo implements Serializable {
	private long post_id;
	private String fordollPhotoPath;
	private Date intendedTime;
	private String college;
	private String characters;
	private String standard;
	private String desert;
	//private long user_id;
	private Date postTime;
	private long likeNumber;
	private User user;
	
	
	public PostInfo()
	{}
	
	public PostInfo(long post_id,String fordollPhotoPath,Date intendedTime,String college,
			     String characters,String standard,String desert,
			     //long user_id,
			     Date postTime,long likeNumber)
	{
		this.post_id=post_id;
		this.fordollPhotoPath=fordollPhotoPath;
		this.intendedTime=intendedTime;
		this.college=college;
		this.characters=characters;
		this.standard=standard;
		this.desert=desert;
//		this.user_id=user_id;
		this.postTime=postTime;
		this.likeNumber=likeNumber;
	}
	
	
	public long getLikeNumber() {
		return likeNumber;
	}


	public void setLikeNumber(long likeNumber) {
		this.likeNumber = likeNumber;
	}


	public long getPost_id() {
		return post_id;
	}


	public String getFordollPhotoPath() {
		return fordollPhotoPath;
	}


	public Date getIntendedTime() {
		return intendedTime;
	}


	public String getCollege() {
		return college;
	}


	public String getCharacters() {
		return characters;
	}


	public String getStandard() {
		return standard;
	}


	public String getDesert() {
		return desert;
	}


//	public long getUser_id() {
//		return user_id;
//	}


	public Date getPostTime() {
		return postTime;
	}


	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}


	public void setFordollPhotoPath(String fordollPhotoPath) {
		this.fordollPhotoPath = fordollPhotoPath;
	}


	public void setIntendedTime(Date intendedTime) {
		this.intendedTime = intendedTime;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public void setCharacters(String characters) {
		this.characters = characters;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public void setDesert(String desert) {
		this.desert = desert;
	}


//	public void setUser_id(long user_id) {
//		this.user_id = user_id;
//	}


	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	



}
