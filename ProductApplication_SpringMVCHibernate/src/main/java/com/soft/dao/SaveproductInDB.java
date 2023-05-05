package com.soft.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.soft.entity.ProductName;
@Component
public class SaveproductInDB {
//DATA ACCESS ONBJECT
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveproducdatabace(ProductName productname) {
		int userId = (int) hibernateTemplate.save(productname);
		return userId;
	}
	public List<ProductName> getslluserintodb(){
		
		List<ProductName> list = hibernateTemplate.loadAll(ProductName.class);
		return list;
	}
	public ProductName updateexistuserdao(int productname) {
		ProductName existuser = hibernateTemplate.get(ProductName.class,productname );
		return existuser;
	}
}
