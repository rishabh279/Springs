package com.luv2code.com;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	public String getFortune(){
		
		return "Have a good day";
	}
}
