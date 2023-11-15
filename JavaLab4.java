// Megan Gagliardi
// 12/09/2022
// OOP 3200
// Java Lab 4: Inheritance

import java.util.ArrayList;
import java.util.List;

public class JavaLab4 {
	public static void main(String[] args) {		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1, "Iron Man Sticker", 3.99, 10, 5, "Do not get wet"));
		products.add(new Product(2, "Batman Sticker", 4.99, 0, 15, "Do not get wet"));
		products.add(new Product(3, "Mando Mug", 19.99, 5, 20, "Fragile"));
		products.add(new Perishable(4, "Grogu Cookie", 1.99, 20, 30, "N/A", 2, 22, 2023));
		products.add(new Perishable(5, "Grogu Cake", 15.99, 2, 1, "Fragile", 3, 1, 2023));
		
		for (int i = 0; i < products.size(); i++) {
			products.get(i).display();
		}
	}
}
