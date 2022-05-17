package jk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach c=context.getBean("SwimCoach",SwimCoach.class);
		
		System.out.println(c.getWorkout());

		System.out.println(c.getFortune());
		System.out.println(c.getEmail());
		System.out.println(c.getTeam());
		
		context.close();
	}

}
  