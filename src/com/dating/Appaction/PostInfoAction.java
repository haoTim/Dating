package com.dating.Appaction;

import java.util.ArrayList;
import java.util.List;

import com.dating.base.BaseAction;
import com.dating.domain.PostInfo;
import com.dating.service.PostInfoService;


public class PostInfoAction extends  BaseAction<PostInfo>{
	
	
	private long post_id;
	private List<PostInfo> postInfoList;
	private PostInfo postInfo;
	
	public String ListAll(){//返回所有的postInfo信息
		postInfoList=new ArrayList<PostInfo>();
		postInfoList=postInfoService.findAll();
		return SUCCESS;
	}
	
	
	public String ListAPostInfo(){//返回某个postInfo
		postInfo=new PostInfo();
		postInfo=postInfoService.getById(post_id);
		return SUCCESS;
		
	}


	
	
	
	
	
	
	
	
	
	
	//-----get set----------------------------
	public long getPost_id() {
		return post_id;
	}


	public List<PostInfo> getPostInfoList() {
		return postInfoList;
	}


	public PostInfo getPostInfo() {
		return postInfo;
	}


	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}


	public void setPostInfoList(List<PostInfo> postInfoList) {
		this.postInfoList = postInfoList;
	}


	public void setPostInfo(PostInfo postInfo) {
		this.postInfo = postInfo;
	}
	
	
	
	
	
	
	
	
	
	

}
