package com.audi.hibernateone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.audi.hibernateone.ProductDTO;

public class ProductDAO {

	public static void main(String[] args) {
		
		ProductDTO pdto = new ProductDTO();
		
		pdto.setPid(2);
		pdto.setPname("newuser");
		pdto.setQunt(5);
		
		Configuration configuration = new Configuration();
		
		configuration.configure();
		
		configuration.addAnnotatedClass(ProductDTO.class);
		
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.save(pdto);
		
		session.beginTransaction().commit();
		
		
		
	}
	
}
