package com.example.securityjwt.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.example.securityjwt.entity.enums.PageSize;
import com.example.securityjwt.entity.page.PaginationResult;
import com.example.securityjwt.entity.page.SimplePage;
import com.example.securityjwt.entity.pojo.User;
import com.example.securityjwt.entity.query.UserQuery;
import com.example.securityjwt.mapper.UserMapper;
import com.example.securityjwt.service.UserService;
import org.springframework.stereotype.Service;



/**
 * 
 *  业务接口实现
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper<User, UserQuery> userMapper;

	/**
	 * 根据条件查询列表
	 */
	public List<User> findListByParam(UserQuery param) {
		List<User> list = this.userMapper.selectList(param);
		return list;
	}

	/**
	 * 根据条件查询列表
	 */
	public Integer findCountByParam(UserQuery param) {
		Integer count = this.userMapper.selectCount(param);
		return count;
	}

	/**
	 * 分页查询方法
	 */
	public PaginationResult<User> findListByPage(UserQuery param) {
		int count = this.userMapper.selectCount(param);
		int pageSize = param.getPageSize()==null? PageSize.SIZE15.getSize():param.getPageSize();
		int pageNo = 0;
		if (null != param.getPageNo()) {
			pageNo=param.getPageNo();
		}
		SimplePage page = new SimplePage(pageNo, count, pageSize);
		param.setPage(page);
		List<User> list = this.userMapper.selectList(param);
		PaginationResult<User> result = new PaginationResult<User>(page, list);
		return result;
	}

	/**
	 * 新增
	 */
	public Integer add(User bean){
		return this.userMapper.insert(bean);
	}

	/**
	 * 批量新增
	 */
	public Integer addBatch(List<User> listBean){
		if (listBean == null || listBean.isEmpty()) {
			return 0;
		}
		return this.userMapper.insertBatch(listBean);
	}

	/**
	 * 修改
	 */
	public Integer updateByPrimaryKey(User bean,Integer userId){
		return this.userMapper.updateByPrimaryKey(bean,userId);
	}

	/**
	 * 删除
	 */
	public Integer deleteByPrimaryKey(Integer userId){
		return this.userMapper.deleteByPrimaryKey(userId);
	}

	/**
	 * 根据primaryKey获取对象
	 */
	public User getUserByPrimaryKey(Integer userId){
		return this.userMapper.selectByPrimaryKey(userId);
	}

}