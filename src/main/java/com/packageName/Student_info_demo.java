package com.packageName;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Student_info_demo {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// insert data into dB
		MyPOJO pojo = new MyPOJO();
		
		// For creation
		pojo.setName("Daniel");
		//pojo.setRoll_num(999); Rollnumber would be 1, coz it is auto generated and increemented.
		pojo.setStandard("VI");
		pojo.setGrade('D');
		pojo.setSchool("DPS");
		
		session.save(pojo);
		transaction.commit();
		
		// Update
//		MyPOJO pojo1 = (MyPOJO)session.get(MyPOJO.class, 1);
//		pojo.setName("Xeiniel");
//		session.update(pojo1);
//		
//		session.save(pojo1);
//		transaction.commit();
		
		// Delete
//		MyPOJO pojo2 = (MyPOJO)session.get(MyPOJO.class, 1);
//		session.delete(pojo2);
//		
//		session.save(pojo2);
//		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		System.out.println("Record inserted ^^");

	}

}