package javastreams;

import java.util.*;
import java.util.stream.Collectors;

class Product 
{
	int id;
	String name;
	float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class StreamAnotherDemo {

	public static void main(String[] args) {
		List<Product> products= new ArrayList<>();
		products.add(new Product(1, "Dell Laptop", 25000f));
		products.add(new Product(2, "Hp Laptop", 50000f));
		products.add(new Product(3, "Apple Laptop", 250000f));
		
		for(Product product: products)
		{
			System.out.println(product.id);
			System.out.println(product.name);
			System.out.println(product.price);
			System.out.println();
		}
		
		List<Float> productPrice= products.stream().filter(i->i.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPrice);
		
		
		
		
	}

}
