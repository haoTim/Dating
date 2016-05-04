package com.dating.service;

import java.util.Set;

import com.dating.base.DaoSupport;
import com.dating.domain.PostInfo;
import com.dating.domain.User;

public interface UserService extends DaoSupport<User>{

	//展示所该用户所有公布的信息
	Set<PostInfo> listALLPostInfos(Long id);

	User findByAccount(String account, String password);

	User checkTEL(String tel);

}