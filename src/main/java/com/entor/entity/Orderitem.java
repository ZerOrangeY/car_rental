package com.entor.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Orange
 * @since 2019-10-16
 */
public class Orderitem extends Model<Orderitem> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer cid;
	private Integer uid;
	private Integer oid;


	public Integer getId() {
		return id;
	}

	public Orderitem setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getCid() {
		return cid;
	}

	public Orderitem setCid(Integer cid) {
		this.cid = cid;
		return this;
	}

	public Integer getUid() {
		return uid;
	}

	public Orderitem setUid(Integer uid) {
		this.uid = uid;
		return this;
	}

	public Integer getOid() {
		return oid;
	}

	public Orderitem setOid(Integer oid) {
		this.oid = oid;
		return this;
	}

	public static final String ID = "id";

	public static final String CID = "cid";

	public static final String UID = "uid";

	public static final String OID = "oid";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Orderitem{" +
			", id=" + id +
			", cid=" + cid +
			", uid=" + uid +
			", oid=" + oid +
			"}";
	}
}
