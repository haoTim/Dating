package com.dating.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * comment
 * comment_id, 主键 自增长
 * post_id,	某个择偶贴id  外键
 * user_id, 评论者id    外键
 * content, 评论内容
 * commentTime  评论时间
 * 
 * 
 * */
public class Comment implements Serializable{
	
	
	private long comment_id;
	private long post_id;
	private long user_id;
	private String content;
	private Date commentTime;
	
	public Comment(){}
	
	
	public Comment(long comment_id,	 long post_id,	 long user_id, String content,Date commentTime)
	{
		this.comment_id=comment_id;
		this.post_id=post_id;
		this.user_id=user_id;
		this.content=content;
		this.commentTime=commentTime;

	}
	
	public long getComment_id() {
		return comment_id;
	}


	public long getPost_id() {
		return post_id;
	}


	public long getUser_id() {
		return user_id;
	}


	public String getContent() {
		return content;
	}


	public Date getCommentTime() {
		return commentTime;
	}


	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}


	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}


	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}


	
	
}
