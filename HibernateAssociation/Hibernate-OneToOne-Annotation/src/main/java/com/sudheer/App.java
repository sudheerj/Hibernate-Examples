package com.sudheer;

import java.util.Date;

import org.hibernate.Session;

import com.sudheer.stock.Stock;
import com.sudheer.stock.StockDetail;
import com.sudheer.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();

		stock.setStockCode("666");
		stock.setStockName("WMart");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("Wal-Mart Stores");
		stockDetail.setCompDesc("Best retail corporation in the world");
		stockDetail.setRemark("");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		session.getTransaction().commit();

		System.out.println("Done");
	}
}
