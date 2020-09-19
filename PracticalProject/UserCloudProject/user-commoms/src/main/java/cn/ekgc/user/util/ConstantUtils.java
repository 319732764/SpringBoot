package cn.ekgc.user.util;

import com.github.pagehelper.Page;

import java.util.Properties;

/**
 * <b>系统常用工具类</b>
 */
public class ConstantUtils {
	private static Properties props = new Properties();

	static {
		try {
			props.load(ConstantUtils.class.getClassLoader().getResourceAsStream("props/user.properties"));
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * <b>分页信息：默认页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(props.getProperty("page.num"));
	/**
	 * <b>分页信息：每页显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(props.getProperty("page.size"));
}
