package com.entor.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
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
@TableName("order_")
public class Order extends Model<Order> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private Integer uid;
	private Integer cid;
	private String phone;
	private Date createTime;
	private Date returnTime;
	private Double deposit;
	private Double cost;

	public Integer getId() {
		return id;
	}

	public Order setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getUid() {
		return uid;
	}

	public Order setUid(Integer uid) {
		this.uid = uid;
		return this;
	}

	public Integer getCid() {
		return cid;
	}

	public Order setCid(Integer cid) {
		this.cid = cid;
		return this;
	}

	public String getPhone() {
		return phone;
	}

	public Order setPhone(String phone) {
		this.phone = phone;
		return this;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public Order setCreateTime(Date createTime) {
		this.createTime = createTime;
		return this;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public Order setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
		return this;
	}

	public Double getDeposit() {
		return deposit;
	}

	public Order setDeposit(Double deposit) {
		this.deposit = deposit;
		return this;
	}
	
	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public static final String ID = "id";

	public static final String UID = "uid";

	public static final String CID = "cid";

	public static final String PHONE = "phone";

	public static final String CREATETIME = "createTime";

	public static final String RETURNTIME = "returnTime";

	public static final String DEPOSIT = "deposit";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Order{" +
			", id=" + id +
			", uid=" + uid +
			", cid=" + cid +
			", phone=" + phone +
			", createTime=" + createTime +
			", returnTime=" + returnTime +
			", deposit=" + deposit +
			"}";
	}
}
