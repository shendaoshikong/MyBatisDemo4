package com.my.test;

import java.sql.Time;

import org.apache.ibatis.session.SqlSession;

import com.my.mapper.OrderMapper;
import com.my.mapper.ProductMapper;
import com.my.util.MybatisUtil;
import com.my.vo.Order;
import com.my.vo.Product;

public class Test2 {

	// 2.一个订单包括多个商品（1：N）
	// 要求完成：
	// 1.根据订单编号查询所有商品
	// 2.添加商品、修改商品、删除商品
	// 3.添加订单、删除订单
	public static void main(String[] args) {
		SqlSession session = MybatisUtil.openseesion();
		OrderMapper orderMapper = session.getMapper(OrderMapper.class);
		ProductMapper productMapper = session.getMapper(ProductMapper.class);

		// System.out.println(orderMapper.selectOrderById(1));

//		Product product = new Product();
//		product.setId(4);
//		product.setProNo(3);
//		product.setProName("大瓜");
//		product.setType("瓜");
//		product.setProNum(3);
//		product.setPrice(999);
//		product.setOrder_id(1);

		// productMapper.saveProduct(product);

		// productMapper.updateProductById(product);

		// productMapper.deleteProductById(3);

//		Order order = new Order();
//		order.setOrderNo(3);
//		order.setOrderPerson("陈华");
//		order.setOrderTime(new Time(4, 5, 5));
		// orderMapper.saveOrder(order);

//		orderMapper.deleteOrderById(2);

		session.commit();
		session.close();
	}

}
