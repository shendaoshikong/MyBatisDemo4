package com.my.vo;

import java.io.Serializable;

public class Product implements Serializable{

	private int id;
	private int proNo;
	private String proName;
	private String type;
	private int proNum;
	private int price;
	private int order_id;

	private Order order;

	public Product() {
		super();
	}

	public Product(int id, int proNo, String proName, String type, int proNum, int price, int order_id) {
		super();
		this.id = id;
		this.proNo = proNo;
		this.proName = proName;
		this.type = type;
		this.proNum = proNum;
		this.price = price;
		this.order_id = order_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProNo() {
		return proNo;
	}

	public void setProNo(int proNo) {
		this.proNo = proNo;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getProNum() {
		return proNum;
	}

	public void setProNum(int proNum) {
		this.proNum = proNum;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", proNo=" + proNo + ", proName=" + proName + ", type=" + type + ", proNum="
				+ proNum + ", price=" + price + ", order_id=" + order_id + ", order=" + order + "]";
	}

}
