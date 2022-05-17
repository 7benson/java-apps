package com.hiber.app;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("he");

		SessionFactory factory= new Configuration().configure().buildSessionFactory();

		Session sess = factory.openSession();
		
//		Student st=new Student("JK","Hyd");
		
		
//		FileInputStream fis=new FileInputStream("src/main/java/pic.PNG");
//		byte[] data=new byte[fis.available()];
//		fis.read(data);
//		
//		Address add=new Address("street1","city1",false,2.4,new Date(),data);
		
		Course c=new Course("dbms","4 months");
		Student st=new Student(1,"jk","hyd",c);
		
		
		Transaction tx=sess.beginTransaction();
		
		sess.save(st);
		
		tx.commit();
		sess.close();
	}
}