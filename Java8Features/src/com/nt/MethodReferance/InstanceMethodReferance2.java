package com.nt.MethodReferance;

public class InstanceMethodReferance2 {
public void printMsg() {
	System.out.println("Hello,this is instance method");
	
}
	public static void main(String[] args) {
	Thread t=new Thread(new InstanceMethodReferance2()::printMsg);
t.start();
	}

}
