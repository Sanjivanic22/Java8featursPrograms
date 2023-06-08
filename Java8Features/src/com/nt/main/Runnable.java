package com.nt.main;

public interface Runnable {
String run(String message);
public class LambdaEx2{
	public static void main(String[] args) {
		Runnable person=(message)->{
			String str1="I would like to say,";
			String str2=str1+message;
			return str2;
		};
		System.out.println(person.run("Time is precious."));
	}
}
}
