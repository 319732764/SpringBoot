package cn.ekgc.user.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>用户信息实体</b>
 * @author Kirito
 * @version 4.1.0
 * @since 1.0.0
 */
public class User implements Serializable {
	private static final long serialVersionUID = 4853697898306087409L;
	private Long id;                    // 主键
	private String name;                // 姓名
	private String cellphone;           // 手机号码
	private String idCard;              // 身份证号码
	private String email;               // 电子邮件
	private Date createTime;            // 创建时间
	private Date updateTime;            // 修改时间

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
