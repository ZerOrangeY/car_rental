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
@TableName("role_permission")
public class RolePermission extends Model<RolePermission> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer rid;
	private Integer pid;


	public Integer getId() {
		return id;
	}

	public RolePermission setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getRid() {
		return rid;
	}

	public RolePermission setRid(Integer rid) {
		this.rid = rid;
		return this;
	}

	public Integer getPid() {
		return pid;
	}

	public RolePermission setPid(Integer pid) {
		this.pid = pid;
		return this;
	}

	public static final String ID = "id";

	public static final String RID = "rid";

	public static final String PID = "pid";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "RolePermission{" +
			", id=" + id +
			", rid=" + rid +
			", pid=" + pid +
			"}";
	}
}
