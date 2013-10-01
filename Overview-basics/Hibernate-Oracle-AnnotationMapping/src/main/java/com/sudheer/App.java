package com.sudheer;

import java.util.Date;
import org.hibernate.Session;
import com.sudheer.util.HibernateUtil;
import com.sudheer.user.DBUser;

public class App {
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		DBUser user = new DBUser();

		user.setUserId(222);
		user.setUsername("Superman");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
	}
}
