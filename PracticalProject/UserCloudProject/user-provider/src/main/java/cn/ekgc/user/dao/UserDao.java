package cn.ekgc.user.dao;

import cn.ekgc.user.pojo.entity.User;
import org.springframework.stereotype.Repository;

/**
 * <b>用户功能数据持久层接口</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@Repository
public interface UserDao {

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	Integer save(User user) throws Exception;
}
