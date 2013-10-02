package com.sudheer;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;

import com.sudheer.stock.Stock;
import com.sudheer.stock.StockDailyRecord;
import com.sudheer.util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		System.out.println("Hibernate one to many (Annotation)");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		Stock stock = new Stock();
        stock.setStockCode("888");
        stock.setStockName("MAC");
        session.save(stock);
        
        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        Calendar today = Calendar.getInstance();  
       // Subtract 1 day  
        today.add(Calendar.DATE, -1);
        stockDailyRecords.setDate(new Date(today.getTimeInMillis() ));
        
        stockDailyRecords.setStock(stock);        
        stock.getStockDailyRecords().add(stockDailyRecords);

        session.save(stockDailyRecords);

		session.getTransaction().commit();
		System.out.println("Done");
	}
}
