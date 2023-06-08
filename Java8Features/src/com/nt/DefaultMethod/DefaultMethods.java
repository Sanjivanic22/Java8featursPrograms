package com.nt.DefaultMethod;
interface Sayable{
	default void say() 
	{
		System.out.println("Hello,this is default method");
	}
	//abstract method
	void sayMore(String msg);
}
public class DefaultMethods implements Sayable{
	public void sayMore(String msg) {
	System.out.println(msg);
		
	}
	public static void main(String[] args) {
		 DefaultMethods dm=new  DefaultMethods();
		 dm.say();
		 dm.sayMore("work is worship");

	}


	

}
