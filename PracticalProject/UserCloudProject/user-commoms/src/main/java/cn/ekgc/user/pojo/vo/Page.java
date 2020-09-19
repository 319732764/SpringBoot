package cn.ekgc.user.pojo.vo;

import cn.ekgc.user.util.ConstantUtils;

import java.io.Serializable;
import java.util.List;

/**
 * <b>分页视图对象</b>
 * @param <E>
 * @author Kirito
 * @version 4.1.0
 * @since 2.0.0
 */

public class Page<E> implements Serializable {
	private static final long serialVersionUID = -2773638322411861688L;
	private Integer pageNum;                    // 当前页码
	private Integer pageSize;                   // 每页显示条数
	private Integer draw;                       // dataTables 分页信息值
	private List<E> list;                       // 分页列表
	private Long totalCount;                    // 总条数
	private Integer totalPage;                  // 总页数

	public Page() {}

	public Page(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		} else{
			this.pageNum = ConstantUtils.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		} else{
			this.pageSize = ConstantUtils.PAGE_SIZE;
		}
	}

	public Page(Integer pageNum, Integer pageSize, Integer draw) {
		if (pageNum != null && pageNum > 0){
			this.pageNum = pageNum;
		} else{
			this.pageNum = ConstantUtils.PAGE_NUM;
		}
		if (pageSize != null && pageSize > 0){
			this.pageSize = pageSize;
		} else{
			this.pageSize = ConstantUtils.PAGE_SIZE;
		}
		this.draw = draw;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
