package com.example.securityjwt.service;

import com.example.securityjwt.entity.page.PaginationResult;
import com.example.securityjwt.entity.pojo.User;
import com.example.securityjwt.entity.query.UserQuery;

import java.util.List;



/**
 * 
 *  业务接口
 * 
 */
public interface UserService {

	/**
	 * 根据条件查询列表
	 */
	public List<User> findListByParam(UserQuery param);

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(UserQuery param);

	/**
	 * 分页查询
	 */
	public PaginationResult<User> findListByPage(UserQuery param);

	/**
	 * 新增
	 */
	public Integer add(User bean);

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<User> listBean);

	/**
	 * 根据主键修改
	 */
	public Integer updateByPrimaryKey(User bean  ,Integer userId);


	/**
	 * 根据主键删除
	 */
	public Integer deleteByPrimaryKey(Integer userId);


	/**
	 * 根据primaryKey获取对象
	 */
	 public User getUserByPrimaryKey(Integer userId);

}