package com.nt.main;
//multiple parameters
public interface Adable {
int add(int a,int b);
public class LambdaEx2{
	public static void main(String[] args) {
		//without return type
		Adable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		//with return type
		Adable ad2=(int a,int b)->{
			return(a+b);
		};
		System.out.println(ad2.add(100,200));
	}
}
}
