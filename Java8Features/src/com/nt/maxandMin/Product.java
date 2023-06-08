package com.nt.maxandMin;

import java.util.ArrayList;
import java.util.List;



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
//			 List<Float>priceList1=productlist.stream()
			 //max method t get max product price
//			 Product productA=productlist.stream().max((product1, product2)->product1.price>product2.price?1:-1).get();
//		System.out.println(productA.price);
//		Product productB=productlist.stream().min((product1,product)->product.price>product.price?1:-1).get();
//		System.out.println(productB.price);
//		}
			 //count method in collection
			 //count number of product basedin filter
			 long count=productlist.stream()
					 .filter(product->product.price<6000)
					 .count();
			 System.out.println(count);
					 
	}

	}
}
