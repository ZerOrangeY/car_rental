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
public class Cars extends Model<Cars> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String name;
	private String type;
	private String licence;
	private Double gas;
	private Integer status;
	private Double price;


	public Integer getId() {
		return id;
	}

	public Cars setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Cars setName(String name) {
		this.name = name;
		return this;
	}

	public String getType() {
		return type;
	}

	public Cars setType(String type) {
		this.type = type;
		return this;
	}

	public String getLicence() {
		return licence;
	}

	public Cars setLicence(String licence) {
		this.licence = licence;
		return this;
	}

	public Double getGas() {
		return gas;
	}

	public Cars setGas(Double gas) {
		this.gas = gas;
		return this;
	}

	public Integer getStatus() {
		return status;
	}

	public Cars setStatus(Integer status) {
		this.status = status;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public Cars setPrice(Double price) {
		this.price = price;
		return this;
	}

	public static final String ID = "id";

	public static final String NAME = "name";

	public static final String TYPE = "type";

	public static final String LICENCE = "licence";

	public static final String GAS = "gas";

	public static final String STATUS = "status";

	public static final String PRICE = "price";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Cars{" +
			", id=" + id +
			", name=" + name +
			", type=" + type +
			", licence=" + licence +
			", gas=" + gas +
			", status=" + status +
			", price=" + price +
			"}";
	}
}
