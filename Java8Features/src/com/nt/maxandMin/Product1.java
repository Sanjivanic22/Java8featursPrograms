package com.nt.maxandMin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.nt.stream.Product;

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
			List<Product> productlist=new ArrayList<>();
			 productlist.add(new Product(1,"laptop",5677889));
			 productlist.add(new Product(2,"Washing machin",56774f));
			 productlist.add(new Product(3,"Fan",5670f));
			 productlist.add(new Product(4,"chair",500f));
			 productlist.add(new Product(5,"cooler",20000f));
//		converting product list to set
			 Set<Float> productPriceList =   
					 productlist.stream()  
			            .filter(product->product.price < 30000)   // filter product on the base of price  
			            .map(product->product.price)  
			            .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)  
			        System.out.println(productPriceList);  
			    }  
			}  
					 
	

	}
	}
}
