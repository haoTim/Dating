package com.dating.test;

import java.lang.reflect.ParameterizedType;
import java.util.Date;
import java.util.List;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dating.domain.User;


/**
 * 测试Hibernate 是否映射成功*/
public class TestHibernate  {
	
	private Class clazz;
	
	@Test
	public void test(){
		Configuration cfg=new Configuration().configure();
		SchemaExport export=new SchemaExport(cfg);
		export.create(true, true);
	}
	
	

	
	
}
