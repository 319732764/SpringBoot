package cn.ekgc.user.dao;

import cn.ekgc.user.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>用户功能数据持久层接口</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@Repository
public interface UserDao {

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	Integer save(User user) throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	Integer update(User user) throws Exception;
}
