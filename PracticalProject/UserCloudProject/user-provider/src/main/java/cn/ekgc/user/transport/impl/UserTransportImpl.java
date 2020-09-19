package cn.ekgc.user.transport.impl;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import cn.ekgc.user.service.UserService;
import cn.ekgc.user.transport.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("userTransport")
@RequestMapping("/user")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;


	@PostMapping("/page")
	@Override
	public Page<User> getPage(@RequestBody Page<User> page) throws Exception {
		return userService.getPage(page);
	}

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

	@PostMapping("/id")
	@Override
	public User getById(@RequestParam Long id) throws Exception {
		return userService.getById(id);
	}

	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody User user) throws Exception {
		return userService.update(user);
	}
}
