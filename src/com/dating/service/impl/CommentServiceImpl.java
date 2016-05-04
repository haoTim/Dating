package com.dating.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dating.base.DaoSupportImpl;
import com.dating.domain.Comment;
import com.dating.service.CommentService;

@Service("commentService")
public class CommentServiceImpl extends DaoSupportImpl<Comment> implements CommentService{
	
	//展示某个postInfo所有的评论
	@Override
	public List<Comment> ListAllComment(Long post_id){
		String hql = "from "+clazz.getSimpleName()+" where post_id=?";  
		return getSession()
		.createQuery(
				hql)
		.setParameter(0, post_id).list();
		
	}
	

}
