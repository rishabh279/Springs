package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService{
	//String arr[] = new String[]{"Today is your lucky day","Unlucky Day","neutral"};
    //String randomString = arr[(int)(Math.random() * arr.length)];
	@Override
	public String getFortune(){
		return "Today is your lucky day";
	}
}
