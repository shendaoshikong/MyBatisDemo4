package com.my.mapper;

import com.my.vo.Product;

public interface ProductMapper {

	public Product selectProductByOrderId(int id);

	public void saveProduct(Product product);

	public void deleteProductById(int id);

	public void updateProductById(Product product);
}