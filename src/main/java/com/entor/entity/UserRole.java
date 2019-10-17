package com.entor.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
@TableName("user_role")
public class UserRole extends Model<UserRole> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer uid;
	private Integer rid;


	public Integer getId() {
		return id;
	}

	public UserRole setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUid() {
		return uid;
	}

	public UserRole setUid(Integer uid) {
		this.uid = uid;
		return this;
	}

	public Integer getRid() {
		return rid;
	}

	public UserRole setRid(Integer rid) {
		this.rid = rid;
		return this;
	}

	public static final String ID = "id";

	public static final String UID = "uid";

	public static final String RID = "rid";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "UserRole{" +
			", id=" + id +
			", uid=" + uid +
			", rid=" + rid +
			"}";
	}
}
