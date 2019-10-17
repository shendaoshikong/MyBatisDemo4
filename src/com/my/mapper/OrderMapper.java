package com.my.mapper;

import com.my.vo.Order;

public interface OrderMapper {

	public Order selectOrderById(int id);

	public void saveOrder(Order order);

	public void deleteOrderById(int id);

	// public void updateOrderById(Order card);
}