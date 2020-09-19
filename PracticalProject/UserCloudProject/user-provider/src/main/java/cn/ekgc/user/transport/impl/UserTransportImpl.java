package cn.ekgc.user.transport.impl;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.service.UserService;
import cn.ekgc.user.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("userTransport")
@RequestMapping("/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;
	/**
	 * <b>添加用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody User user) throws Exception {
		return userService.save(user);
	}
}
