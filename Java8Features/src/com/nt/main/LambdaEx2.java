package com.nt.main;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx2 {

	public static void main(String[] args) {
	List<String> li=new ArrayList<String>();
	li.add("sanju");
	li.add("kunal");
	li.add("Akash");
	li.forEach(
			(n)->System.out.println(n)
	);
	}

}
