package com.dating.base;

import java.util.List;

public interface DaoSupport<T> {

	void save(T entity);

	void update(T entity);

	T getById(Long id);

	List<T> getByIds(Long[] ids);



	List<T> findAll();

	void delete(Long id);

}