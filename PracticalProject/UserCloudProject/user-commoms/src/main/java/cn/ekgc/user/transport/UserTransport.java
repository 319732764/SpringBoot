package cn.ekgc.user.transport;

import cn.ekgc.user.pojo.entity.User;
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
	 * <b>添加用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody User user) throws Exception;
}
