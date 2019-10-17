package com.my.vo;

import java.io.Serializable;
import java.sql.Time;
import java.util.List;

public class Order implements Serializable{

	private int id;
	private int orderNo;
	private Time orderTime;
	private String orderPerson;
	private List<Product> products;

	public Order() {
		super();
	}

	public Order(int id, int orderNo, Time orderTime, String orderPerson) {
		super();
		this.id = id;
		this.orderNo = orderNo;
		this.orderTime = orderTime;
		this.orderPerson = orderPerson;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public Time getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderPerson() {
		return orderPerson;
	}

	public void setOrderPerson(String orderPerson) {
		this.orderPerson = orderPerson;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", orderTime=" + orderTime + ", orderPerson=" + orderPerson
				+ ", products=" + products + "]";
	}

}
