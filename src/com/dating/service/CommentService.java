package com.dating.service;

import java.util.List;

import com.dating.base.DaoSupport;
import com.dating.domain.Comment;

public interface CommentService extends DaoSupport<Comment>{

	//展示某个postInfo所有的评论
	List<Comment> ListAllComment(Long post_id);

}