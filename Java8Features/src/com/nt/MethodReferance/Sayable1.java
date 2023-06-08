package com.nt.MethodReferance;

import com.nt.main.Sayable;

public interface Sayable1 {
	void say();

	
public class InstanceMethodReferance {
	public void saySomething() {
		System.out.println("Hello,this is no-static method");
		
	}
	public static void main(String[] args) {
		InstanceMethodReferance methodreferance=new InstanceMethodReferance();
//running nonstatic method using referance
		Sayable1 sayable=methodreferance::saySomething;
		//calling inteface method
		sayable.say();
		//refering nonstatic method using annonymous bject
		Sayable1 sayable2=new InstanceMethodReferance()::saySomething;
		sayable2.say();
	}
	
}
	
}
