package com.kodewala.arrays;



public class Driver1 {
     public static void main(String[] args) {
		Product product1 = new Product("Iphone", "Apple");
		Product product2 = new Product("Mac", "Apple");
		Product product3 = new Product("shoes", "Nick");
		
		Product[] products = new Product[3];
		products[0] = product1;
		products[1] = product2;
		products[2] = product3;
		
	//	System.out.println(Arrays.toString(products));
		
		for(Product pr : products) {
			System.out.println(pr.productName + "  " + pr.productBrand);
		}
		
	}
}
