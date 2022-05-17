package jk;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortunes= {"Good Day","Bad Day","Make your day"};
	@Override
	public String getFortune() {
		Random rand=new Random();
		int randInt=rand.nextInt(fortunes.length);
		return fortunes[randInt];
	}

}
