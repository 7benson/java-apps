package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingApp {

public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	
	Session sess=factory.openSession();
	
	Question q=new Question(1,"whats ur name ?");
	
	Answer a1=new Answer(1,"JK",q);
	Answer a2=new Answer(2,"J1",q);
	Answer a3=new Answer(3,"J123",q);
	Answer a4=new Answer(4,"23K",q);
	List<Answer> ans=new ArrayList<Answer>();
	ans.add(a1);
	ans.add(a2);
	ans.add(a3);
	ans.add(a4);
	
	q.setAnswer(ans);
	
	Transaction tx=sess.beginTransaction();

	sess.save(a1);
	sess.save(a2);
	sess.save(a3);
	sess.save(a4);

	sess.save(q);
	
	tx.commit();
	
	sess.close();
	factory.close();
}

}
