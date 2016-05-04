package com.dating.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.dating.base.DaoSupportImpl;
import com.dating.domain.PostInfo;
import com.dating.domain.User;
import com.dating.service.UserService;


@Service("userService")
public class UserServiceImpl extends DaoSupportImpl<User> implements UserService{
	
	//展示所该用户所有公布的信息

	@Override
	public Set<PostInfo> listALLPostInfos(Long id){
		User user;
		Set<PostInfo> postInfos=null;
		if((user=getById(id))!=null)
			postInfos=user.getPosts();
		return postInfos;
		
	}
	
	//通过账号和密码获取User
	@Override
	public User findByAccount(String account,String password){
		
		String hql= "from User u where u.account=? and u.password=?";
		return (User)getSession().createQuery(hql).setString(0, account)
				.setString(1,password).uniqueResult();
		
	
	}
	
	//检查tel是否注册过
	@Override
	public User checkTEL(String tel) {
	
		String hql= "from User u where u.telephone=?";
		return (User)getSession().createQuery(hql).setString(0, tel)
				.uniqueResult();
	}
	
	
	
}
