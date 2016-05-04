package com.dating.base;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import com.dating.service.CommentService;
import com.dating.service.LikeRecordService;
import com.dating.service.PostInfoService;
import com.dating.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction<T> extends ActionSupport {

	private static final long serialVersionUID = 1L;	
	
	
	protected T model;

	@SuppressWarnings("unchecked")
	public BaseAction() {
	
		try {
			//通锟斤拷锟斤拷锟饺�odel锟斤拷锟斤拷实锟斤拷锟斤拷
			ParameterizedType pt = (ParameterizedType)this.getClass().getGenericSuperclass();
			Class<T> clazz = (Class<T>) pt.getActualTypeArguments()[0];
			
			//通锟斤拷锟戒创锟斤拷model锟斤拷实锟斤拷
			model = clazz.newInstance();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public T getModel() {
		
		return model;
	}
	
	
	
	
	
	//--------------------------------------
	
	@Resource(name="userService")
	protected UserService userService;
	
	@Resource(name="postInfoService")
	protected PostInfoService postInfoService;
	
	@Resource(name="commentService")
	protected CommentService commentService;
	
	@Resource(name="likeRecordService")
	protected LikeRecordService likeRecordService;
	
}
