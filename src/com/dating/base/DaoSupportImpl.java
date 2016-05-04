package com.dating.base;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@SuppressWarnings("unchecked")
public class DaoSupportImpl<T> implements DaoSupport<T> {
	
	@Resource
	private SessionFactory sessionFactory;
	
	protected Class<T> clazz;
	
	
	public DaoSupportImpl() {

		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		
		 System.out.println("getClass = " + getClass());
		 System.out.println("type = " + this.getClass()
					.getGenericSuperclass());
		 
		this.clazz = (Class) pt.getActualTypeArguments()[0];

		System.out.println("clazz = ===" + clazz.getSimpleName());//获取clazz类型为 T  ，即获取了一个T类型
	}
	 
	
	protected Session getSession() {//开启事务
		Session session;
		if((session=sessionFactory.getCurrentSession())==null)
			session=sessionFactory.openSession();
		
		return session;
	}
	
	@Override
	public void save(T entity) {//增加
		System.out.print("))))))))))))))");
		getSession().save(entity);
	}
	
	@Override
	public void delete(Long id) {//删除，暂时觉得不需要

		Object object = getSession().get(clazz, id);

		getSession().delete(object);
	}
	
	@Override
	public void update(T entity) {//更新

		getSession().update(entity);
	}
	
	@Override
	public T getById(Long id) {//根据id查询

		if (id == null) {
			System.out.println("nullnullnulllnulll");
			return null;
		} else {
			
			if(getSession().get(clazz, id)!=null)
			{
				System.out.println("nonullnullnulllnulll"+id);
			}
			return (T) getSession().get(clazz, id);
		}
	}
	
	@Override
	public List<T> getByIds(Long[] ids) {//根据id查询

		if (ids == null || ids.length == 0) {

			return Collections.EMPTY_LIST;//返回空的list
			
		} else {

			return getSession()
					.createQuery(
							"from " + clazz.getSimpleName()
									+ " where id in (:ids)")
					.setParameterList("ids", ids).list();
		}
	}
	
	@Override
	public List<T> findAll() {
		return getSession().createQuery(
				"FROM " + clazz.getSimpleName())
				.list();
	}
	
	
	

	
	
	
	
	
}
