package com.sudheer;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import com.sudheer.stock.Category;
import com.sudheer.stock.Stock;
import com.sudheer.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate many to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
        stock.setStockCode("1111");
        stock.setStockName("DKS");
 
        Category category1 = new Category("CONSUMER", "CONSUMER COMPANY");
        Category category2 = new Category("INVESTMENT", "INVESTMENT COMPANY");
    
        Set<Category> categories = new HashSet<Category>();
        categories.add(category1);
        categories.add(category2);
        
        stock.setCategories(categories);
        
        session.save(stock);
    
		session.getTransaction().commit();
		System.out.println("Done");
	}
}
