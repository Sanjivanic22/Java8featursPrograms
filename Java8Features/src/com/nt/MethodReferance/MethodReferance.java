package com.nt.MethodReferance;
interface Sayable{
	void say();
}
public class MethodReferance {
public static void saySomething() {
	System.out.println("Hello,This is static method");
}
	public static void main(String[] args) {
		Sayable sayable=MethodReferance::saySomething;
//calling interface method
	sayable.say();	
	}

}
