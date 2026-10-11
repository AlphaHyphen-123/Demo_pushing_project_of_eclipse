package com.kodewala.arrays;

import java.util.Scanner;

public class Driver {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] fruitName = new String[5];
		
		System.out.println("Please enter the all fruits name : ");
		for(int i = 0; i < fruitName.length; i++) {
			fruitName[i] = sc.nextLine();
		}
		
		System.out.println();
		for(String fruit : fruitName) {
			System.out.print(fruit + ", ");
		}
		sc.close();
	}
}
