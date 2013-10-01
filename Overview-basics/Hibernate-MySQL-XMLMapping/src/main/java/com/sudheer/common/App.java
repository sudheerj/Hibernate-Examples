package com.sudheer.common;

import org.hibernate.Session;
import com.sudheer.persistence.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        Stock stock = new Stock();
        
        stock.setStockCode("111");
        stock.setStockName("JEW");
        
        session.save(stock);
        session.getTransaction().commit();
    }
}
