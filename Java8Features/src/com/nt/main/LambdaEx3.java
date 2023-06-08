package com.nt.main;

public class LambdaEx3 {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
public void run() {
	System.out.println("Thread is running");
}
		};
		Thread t1=new Thread(r)	;
		t1.start();
		//thread with lamda expression
		Runnable r2=()-{
			System.out.println("Thread is running");
		};
		Thread t2=new Thread(r2);
		t2.start();
			
		}
	}


