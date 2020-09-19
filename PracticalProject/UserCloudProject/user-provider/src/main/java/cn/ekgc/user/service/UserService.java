package cn.ekgc.user.service;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;

/**
 * <b>用户功能业务接口层</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
public interface UserService {

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean save(User user) throws Exception;

	/**
	 * <b>获得分页对象</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	Page<User> getPage(Page<User> page) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	boolean update(User user) throws Exception;

	/**
	 * <b>根据主键查询用户信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	User getById(Long id) throws Exception;
}
