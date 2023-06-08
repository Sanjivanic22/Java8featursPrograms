package com.nt.DefaultMethod;

public interface talkable {
default void talk(){
System.out.println("Hello,This is default method");	
}
void talkMore(String msg);
static void talkLoud(String msg) {
	System.out.println(msg);
}

public class DefaultMethods implements talkable{
public void talkMore(String msg) {
	System.out.println(msg);
		
	}
	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.talk();
		dm.talkMore("Hellooo sanju");
	}
}}