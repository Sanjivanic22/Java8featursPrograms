package com.nt.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrderedEx {

	public static void main(String[] args) {
	//ForEachOrdered() -used to iterate element is the order specified by the stream.
List<String> gameList=new ArrayList<String>();
gameList.add("football");
gameList.add("cricket");
gameList.add("chess");
gameList.add("Hockey");
System.out.println("iterating by lambada Expression");
gameList.stream().forEachOrdered(games->System.out.println(games));
//iterating by passing method referance
System.out.println("iterating by method referance");
gameList.stream().forEachOrdered(System.out::println);
	}

}
