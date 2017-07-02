package springannotationpractise;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise Batting First";
	}

}
