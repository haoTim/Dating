package com.dating.test;

import java.util.Date;

import org.junit.Test;

import com.dating.base.DaoSupport;
import com.dating.base.DaoSupportImpl;
import com.dating.domain.User;

public class TestDaoSupportImpl {
	
	
	
	@Test
	public void test(){
		DaoSupport<User> dao =new DaoSupportImpl<User>();
		
		Date date=new Date();
		User user=new User("aska","aska","aska", "aska", "aska", 
							"aska", date, "aska", "aska", "aska", 
							"aska", date, "aska");
		dao.save(user);

	}
	
	@Test
	public void test1(){
		String user_id="1";
		System.out.print(Long.parseLong(user_id));
		
		
	}
	
}
