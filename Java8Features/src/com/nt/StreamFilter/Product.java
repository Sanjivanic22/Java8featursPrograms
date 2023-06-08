package com.nt.StreamFilter;

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
	public class JavaStreamExample{
		public static void main(String[] args) {
		List<Product> productsList=new ArrayList<Product>();
		productsList.add(new Product(1,"Lenovo laptop",45000f));
		productsList.add(new Product(2,"assus laptop",55000f));
		productsList.add(new Product(3,"Sony laptop",65000f));
		List<Float>priceList=productsList.stream()
.filter(p->p.price>30000)
.map(p->p.price)
//.forEach(System.out::println);
.collect(Collectors.toList());
		System.out.println(priceList);
	
		}
	}

}
