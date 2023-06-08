package com.nt.main;

public interface Sayable {
public String say();
public class LambdaExpressionEx1{
	public static void main(String[] args) {
		Sayable s=()->{
			return "i have nothing to say";
		};
		System.out.println(s.say());
	}
}
}
