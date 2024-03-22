package com.productapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.productapp.exceptions.ProductNotFoundException;
import com.productapp.model.Product;

@Mapper
public interface IProductRepository {
	
	@Insert("insert into product (product_name, brand, price, category)  values (#{productName},#{brand},#{price},#{category})")
	void addProduct(Product product);
	
	void  updateProduct(Product product);
	void deleteProduct(int productId);
	Product findById(int productId) throws ProductNotFoundException;
	List<Product> findAll();
	List<Product> findByBrand(String brand) throws ProductNotFoundException;
	List<Product> findByLessPrice(double price) throws ProductNotFoundException;
	List<Product> findByCategoryAndPrice(String category, double price) throws ProductNotFoundException;
}
