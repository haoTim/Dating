package com.dating.domain;

import java.io.Serializable;


/**
 * likeRecord
 * like_id
 * post_id  
 * user_id  
 * 
 * isliked  是否点赞了
 * */
public class LikeRecord implements Serializable{
	private long like_id;
	private long post_id;
	private long user_id;
	private boolean isliked;
	
	public LikeRecord(){}
	
	public LikeRecord(long like_id,long post_id,long user_id,boolean isliked){
		this.post_id=post_id;
		this.user_id=user_id;
		this.isliked=isliked;
		
	}
	
	public long getLike_id() {
		return like_id;
	}

	public void setLike_id(long like_id) {
		this.like_id = like_id;
	}

	public long getPost_id() {
		return post_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public boolean isIsliked() {
		return isliked;
	}

	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public void setIsliked(boolean isliked) {
		this.isliked = isliked;
	}
	
	
}
