package com.dating.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class TestSpring {
	
	
	
	@Test
	public void test(){
		
		ClassPathXmlApplicationContext dsContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
	}
}
