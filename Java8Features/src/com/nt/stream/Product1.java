package com.nt.stream;

import java.util.ArrayList;
import java.util.List;

public class Product1 {
int id;
String name;
float price;

	public Product1(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public class JavaStreamEx{
	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		productlist.add(new Product(1,"HP laptop",45000));
		productlist.add(new Product(2,"Dell laptop",30000));
		productlist.add(new Product(3,"Lenovo laptop",50000));
		productlist.add(new Product(4,"sony laptop",65000));
		productlist.stream()
		.filter(product->product.price==65000)
		.forEach(product->System.out.println(product.id));
	}
	}

}
