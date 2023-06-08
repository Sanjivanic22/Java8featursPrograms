package com.nt.main;

public class MethodReferance2 {
public static void ThreadStatus() {
	System.out.println("Thread is running");
}
	public static void main(String[] args) {
	Thread t1=new Thread(MethodReferance2::ThreadStatus);
	t1.start();
	}
	

}
