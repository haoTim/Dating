package com.dating.Appaction;

import com.dating.base.BaseAction;
import com.dating.domain.LikeRecord;
import com.dating.domain.PostInfo;

public class LikeRecordAction extends BaseAction<LikeRecord>{
	
	
	private long post_id;
	private long user_id;
	private LikeRecord likeRecord;
	
	
	public void isliked(){
		likeRecord=new LikeRecord();
		likeRecord=likeRecordService.isliked(post_id, user_id);
		int i;
		if(likeRecord!=null )//有这条记录证明已经点赞过了
		{//执行取消点赞的操作   对应的postInfo中likecount也要减一 
			likeRecordService.delete(likeRecord.getLike_id());
			i=-1;
		}
		else
		{//新增点赞记录 对应的postInfo中likecount也要加一
			likeRecord=new LikeRecord();
			likeRecord.setPost_id(post_id);
			likeRecord.setUser_id(user_id);
			likeRecordService.save(likeRecord);
			i=1;
		}
		
		PostInfo postInfo=postInfoService.getById(post_id);
		postInfo.setLikeNumber(postInfo.getLikeNumber()+i);
		postInfoService.update(postInfo);

	}
	

}
