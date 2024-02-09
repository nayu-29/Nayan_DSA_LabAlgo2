package com.gl.assig2;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		
		int currency[]=new int[size];
		System.out.println("Enter the curreny denominations value");
		for (int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
		}
		
		System.out.println("Before Sorting "+Arrays.toString(currency));
		
		InsertionSort is=new InsertionSort();
		is.sort(currency);
		System.out.println("After Sorting : "+Arrays.toString(currency));
		
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		
		NoteCount nc=new NoteCount();
		nc.counting(currency,amount);
				
		

	}


}
