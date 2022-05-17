package com.many2many;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyApp {
	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session sess=factory.openSession();

		Emp e1=new Emp(1,"JK");
		Emp e2=new Emp(2,"JK1");

		Project p1=new Project(1,"p1");
		Project p2=new Project(2,"p2");
		
		List<Project> p=new ArrayList<Project>();
		p.add(p1);
		p.add(p2);

		List<Emp> e=new ArrayList<Emp>();
		e.add(e1);
		e.add(e2);
		
		e1.setProjects(p);
		p1.setEmps(e);
		
		Transaction tx=sess.beginTransaction();

		sess.save(e1);
		sess.save(e2);
		sess.save(p1);
		sess.save(p2);
		
		tx.commit();
		
		sess.close();
		factory.close();
	}
}
