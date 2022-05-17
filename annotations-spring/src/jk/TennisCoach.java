package jk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	

	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	public TennisCoach(FortuneService fort) {
//		fortuneService=fort;
//	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff");
	}
	@PreDestroy
	public void doMyEndStuff() {
		System.out.println("doMyEndStuff");
	}
	
	@Override
	public String getWorkout() {
		return "practice volley";
	}
	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
}
