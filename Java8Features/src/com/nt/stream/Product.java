package com.nt.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
int id;
String name;
float price;

	public Product(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public class JavaStreamEx{
	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<>();
		 productlist.add(new Product(1,"laptop",5677889));
		 productlist.add(new Product(2,"Washing machin",56774f));
		 productlist.add(new Product(3,"Fan",5670f));
		 productlist.add(new Product(4,"chair",500f));
		 productlist.add(new Product(5,"cooler",20000f));
//		 List<Float>priceList1=productlist.stream()
//				 .filter(p->p.price>30000)
//				 .map(p->p.price)
//				 .collect(Collectors.toList());
//		 System.out.println( priceList1);
		 //using collectors method to sum the prices
		 double totalPrice=productlist.stream()
				 .collect(Collectors.summingDouble(product->product.price));
		 System.out.println(totalPrice);
}
	
	

	}

}
