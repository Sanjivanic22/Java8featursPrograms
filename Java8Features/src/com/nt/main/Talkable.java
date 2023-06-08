package com.nt.main;

public interface Talkable {
public String talk(String name);
public class LambdaExample{
	public static void main(String[] args) {
		Talkable t=name->{
		return "Hello,"+name;	
		};
System.out.println(t.talk("sanju"));
	}
	
}
	
}
