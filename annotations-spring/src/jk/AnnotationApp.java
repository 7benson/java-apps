package jk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach c=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(c.getWorkout());
		
		System.out.println(c.getFortune());
		
		context.close();
	}

}
  