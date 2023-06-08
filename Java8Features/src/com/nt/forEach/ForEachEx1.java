package com.nt.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx1 {

	public static void main(String[] args) {
	//default void forEach(Consumer<super T>action)
		List<String> gameList=new ArrayList<String>();
		gameList.add("football");
		gameList.add("cricket");
		gameList.add("chess");
		gameList.add("Hockey");
		System.out.println("iterating by passing lambda expression");
		//gameList.forEach(games->System.out.println(games));
		gameList.forEach(System.out::println);
	}

}
