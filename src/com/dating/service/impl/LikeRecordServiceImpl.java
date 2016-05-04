package com.dating.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dating.base.DaoSupportImpl;
import com.dating.domain.LikeRecord;
import com.dating.service.LikeRecordService;

@Service("likeRecordService")
public class LikeRecordServiceImpl extends DaoSupportImpl<LikeRecord> implements LikeRecordService{
	
	//根据post_id和user_id查找点赞情况
	@Override
	public LikeRecord isliked(long post_id,long user_id){
		LikeRecord record=null;
		List<LikeRecord> list= getSession()
				.createQuery(
						"from " + clazz.getSimpleName()
								+ " where post_id=? and user_id=?")
				.setParameter(0, post_id).setParameter(1, user_id).list();
		
		if(list!=null)
			record=list.get(0);
		return record;
			
	}

}
