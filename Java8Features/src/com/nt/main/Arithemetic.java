package com.nt.main;

import java.util.function.BiFunction;

public class Arithemetic {
public static int add(int a,int b) {
	return a+b;
}
public class MethodReferance{

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>adder=Arithemetic::add;
		int result=adder.apply(10,20);
		System.out.println(result);
	}
	
}
}
