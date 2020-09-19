package cn.ekgc.user.service;

import cn.ekgc.user.pojo.entity.User;

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
}
