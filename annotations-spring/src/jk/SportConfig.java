package jk;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("jk")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach SwimCoach() {
		Coach swimCoach=new SwimCoach(sadFortuneService());
		return swimCoach;
	}
}
