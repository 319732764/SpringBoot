package cn.ekgc.user.transport;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>用户功能传输层接口</b>
 * @author Kirito
 * @version 4.1.0
 * @since 1.0.0
 */
@FeignClient(name = "user-provider")
@RequestMapping("/user")
public interface UserTransport {
	/**
	 * <b>查询分页信息</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	Page<User> getPage(@RequestBody Page<User> page) throws Exception;

	/**
	 * <b>添加用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody User user) throws Exception;

	/**
	 * <b>根据主键查询用户信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	User getById(@RequestBody Long id) throws Exception;

	/**
	 * <b>修改用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody User user) throws Exception;

}
