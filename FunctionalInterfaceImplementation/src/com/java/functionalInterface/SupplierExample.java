package com.java.functionalInterface;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//does not take input and gives output
		
		Supplier<Double> getRandom=()->Math.random();
		System.out.println(getRandom.get());
		

	}

}
