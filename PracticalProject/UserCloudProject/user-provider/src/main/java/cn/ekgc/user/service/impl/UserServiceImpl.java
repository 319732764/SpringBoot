package cn.ekgc.user.service.impl;

import cn.ekgc.user.dao.UserDao;
import cn.ekgc.user.pojo.entity.User;
import cn.ekgc.user.pojo.vo.Page;
import cn.ekgc.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * <b>用户功能业务实现类</b>
 * @author Kirito
 * @version 4.1.0
 * @since 4.1.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	/**
	 * <b>保存用户信息</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(User user) throws Exception {
		// 进行唯一性校验(手机号码、身份证号码和电子邮件)

		int count = userDao.save(user);
		if (count > 0){
			return true;
		}
		return false;
	}

	/**
	 * <b>获得分页对象</b>
	 * @param page
	 * @return
	 * @throws Exception
	 */
	@Override
	public Page<User> getPage(Page<User> page) throws Exception {
		// 创建 PageHelper 分页对象
		PageHelper.startPage(page.getPageNum(),page.getPageSize());
		// 进行列表查询
		List<User> list = userDao.findListByQuery(new User());
		// 根据获得的列表创建 PageInfo 对象
		PageInfo<User> pageInfo = new PageInfo<User>(list);

		// 提取数据
		page.setList(pageInfo.getList());
		page.setTotalCount(pageInfo.getTotal());
		page.setTotalPage(pageInfo.getPages());

		return page;
	}

	/**
	 * <b>修改对象</b>
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(User user) throws Exception {
		Integer count = userDao.update(user);
		if (count > 0){
			return true;
		}
		return false;
	}

	/**
	 * <b>根据主键查询用户信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getById(Long id) throws Exception {
		// 封装查询对象
		User query = new User();
		query.setId(id);
		// 使用查询对象进行列表查询
		List<User> list = userDao.findListByQuery(query);
		// 判断结果
		if (list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}
}
