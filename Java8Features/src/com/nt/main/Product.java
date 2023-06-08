package com.nt.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Product{
int id;
String name;
float price;
public Product(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}


public class LamdaEx4{
	public static void main(String[] args) {
		List<Product> li=new ArrayList<Product>();
		li.add(new Product(1,"HP Laptop",4500));
		li.add(new Product(2,"Dell laptop",56000));
		li.add(new Product(3,"Dell keyboard",1000));
		System.out.println("filtered on the basis of name");
//		Collections.sort(li,(p1,p2)->{
//			return p1.name.compareTo(p2.name);
//			
//		});
//		for(Product p:li) 
//		{
//			System.out.println(p.id+" "+p.name+" "+p.price);
//		}
		//using lambda to filter
		Stream<Product>filtered_Data=li.stream().filter(p->p.price>2000);
	//using lambda to iterate through collection
		filtered_Data.forEach(
				product->System.out.println(product.name+":"+product.price)
				);
	}
	}
}