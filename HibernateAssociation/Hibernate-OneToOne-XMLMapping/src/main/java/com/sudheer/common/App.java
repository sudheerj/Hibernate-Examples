package com.sudheer.common;

import java.util.Date;
import org.hibernate.Session;
import com.sudheer.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate One-to-One example + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Stock stock = new Stock();
        
        stock.setStockCode("555");
        stock.setStockName("FM");
     
        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("Ford Motors");
        stockDetail.setCompDesc("Best automaker in the world");
        stockDetail.setRemark("");
        stockDetail.setListedDate(new Date());
        
        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);
        
        session.save(stock);

        session.getTransaction().commit();
        
        
    }
}
