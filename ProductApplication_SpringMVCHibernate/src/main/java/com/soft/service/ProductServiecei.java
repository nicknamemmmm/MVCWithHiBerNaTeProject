package com.soft.service;

import java.util.List;

import com.soft.entity.ProductName;

public interface ProductServiecei {
	
	public int saveProduct(ProductName productname);

	public List<ProductName> getallProduct();
	public ProductName prodeuctusergetbyid (int productname);
}
