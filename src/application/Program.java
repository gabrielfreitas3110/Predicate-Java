package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.0));
		list.add(new Product("sMouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.90));

		double minimo = 100.0;
	 	//list.removeIf(new ProductPredicate());
	 	//list.removeIf(Product::staticProductPredicate);
	 	//list.removeIf(Product::nonStaticProductPredicate);
	 	
	 	Predicate<Product> pred = p -> p.getPrice() >= minimo;
	 	list.removeIf(pred);
	 	for(Product p: list) {
	 		System.out.println(p);
	 	}
	}
}