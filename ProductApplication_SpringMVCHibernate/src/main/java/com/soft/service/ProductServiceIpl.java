package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.dao.SaveproductInDB;
import com.soft.entity.ProductName;
@Component
public class ProductServiceIpl implements ProductServiecei{

	@Autowired
	private SaveproductInDB saveproductindb;
	
	@Override
	public int saveProduct(ProductName productname) {
		
		return saveproductindb.saveproducdatabace(productname);
	}

	@Override
	public List<ProductName> getallProduct() {
		
		return saveproductindb.getslluserintodb();
	}

	@Override
	public ProductName prodeuctusergetbyid(int productname) {
		return saveproductindb.updateexistuserdao(productname);
		
	}

}
