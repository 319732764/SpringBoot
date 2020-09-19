package cn.ekgc.user.controller;

import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import cn.ekgc.user.transport.UserTransport;
import netscape.security.UserTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <b>用户功能控制器</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserTransport userTransport;

	/**
	 * <b>获得分页对象</b>
	 * @param pageNum
	 * @param pageSize
	 * @param draw
	 * @return
	 */
	@PostMapping("/page")
	@ResponseBody
	public Page<User> queryPage(Integer pageNum, Integer pageSize, Integer draw) throws Exception{
		// 封装分页对象 Page
		Page<User> page = new Page<User>(pageNum,pageSize,draw);
		// 进行分页查询
		page = userTransport.getPage(page);
		return page;
	}

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@ResponseBody
	public boolean save(User user) throws Exception{

		return userTransport.save(user);
	}

	/**
	 * <b>修改用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	@ResponseBody
	public boolean update(User user) throws Exception{
		// 进行用户状态修改
		boolean flag = userTransport.update(user);

		return flag;
	}
}
