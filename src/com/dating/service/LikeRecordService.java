package com.dating.service;

import com.dating.base.DaoSupport;
import com.dating.domain.LikeRecord;

public interface LikeRecordService extends DaoSupport<LikeRecord>{

	//根据post_id和user_id查找点赞情况
	LikeRecord isliked(long post_id, long user_id);

}