package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * <b>功能：</b>TS_ANNOUNCE AnnounceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-22 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AnnounceEO extends BaseEntity {

	private Integer deleteflag;
	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updatetime;
	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "创建时间不能为空")
	private Date createtime;
	private String announcecreator;
	private Integer state;
	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expriytime;
	private String content;
	private String title;
	private String pkannounce;

	/**
	 * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
	 * <p>
	 * 字段列表：
	 * </p>
	 * <li>deleteflag -> deleteflag</li>
	 * <li>updatetime -> updatetime</li>
	 * <li>createtime -> createtime</li>
	 * <li>announcecreator -> announcecreator</li>
	 * <li>state -> state</li>
	 * <li>expriytime -> expriytime</li>
	 * <li>content -> content</li>
	 * <li>title -> title</li>
	 * <li>pkannounce -> pkannounce</li>
	 */
	public static String fieldToColumn(String fieldName) {
		if (fieldName == null)
			return null;
		switch (fieldName) {
		case "deleteflag":
			return "deleteflag";
		case "updatetime":
			return "updatetime";
		case "createtime":
			return "createtime";
		case "announcecreator":
			return "announcecreator";
		case "state":
			return "state";
		case "expriytime":
			return "expriytime";
		case "content":
			return "content";
		case "title":
			return "title";
		case "pkannounce":
			return "pkannounce";
		default:
			return null;
		}
	}

	/**
	 * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
	 * <p>
	 * 字段列表：
	 * </p>
	 * <li>deleteflag -> deleteflag</li>
	 * <li>updatetime -> updatetime</li>
	 * <li>createtime -> createtime</li>
	 * <li>announcecreator -> announcecreator</li>
	 * <li>state -> state</li>
	 * <li>expriytime -> expriytime</li>
	 * <li>content -> content</li>
	 * <li>title -> title</li>
	 * <li>pkannounce -> pkannounce</li>
	 */
	public static String columnToField(String columnName) {
		if (columnName == null)
			return null;
		switch (columnName) {
		case "deleteflag":
			return "deleteflag";
		case "updatetime":
			return "updatetime";
		case "createtime":
			return "createtime";
		case "announcecreator":
			return "announcecreator";
		case "state":
			return "state";
		case "expriytime":
			return "expriytime";
		case "content":
			return "content";
		case "title":
			return "title";
		case "pkannounce":
			return "pkannounce";
		default:
			return null;
		}
	}

	/**  **/
	public Integer getDeleteflag() {
		return this.deleteflag;
	}

	/**  **/
	public void setDeleteflag(Integer deleteflag) {
		this.deleteflag = deleteflag;
	}

	/**  **/
	public Date getUpdatetime() {
		return this.updatetime;
	}

	/**  **/
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**  **/
	public Date getCreatetime() {
		return this.createtime;
	}

	/**  **/
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**  **/
	public String getAnnouncecreator() {
		return this.announcecreator;
	}

	/**  **/
	public void setAnnouncecreator(String announcecreator) {
		this.announcecreator = announcecreator;
	}

	/**  **/
	public Integer getState() {
		return this.state;
	}

	/**  **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**  **/
	public Date getExpriytime() {
		return this.expriytime;
	}

	/**  **/
	public void setExpriytime(Date expriytime) {
		this.expriytime = expriytime;
	}

	/**  **/
	public String getContent() {
		return this.content;
	}

	/**  **/
	public void setContent(String content) {
		this.content = content;
	}

	/**  **/
	public String getTitle() {
		return this.title;
	}

	/**  **/
	public void setTitle(String title) {
		this.title = title;
	}

	/**  **/
	public String getPkannounce() {
		return this.pkannounce;
	}

	/**  **/
	public void setPkannounce(String pkannounce) {
		this.pkannounce = pkannounce;
	}

}
