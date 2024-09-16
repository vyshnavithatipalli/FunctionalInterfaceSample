package com.java.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//takes input and returns output
		
		Function<Integer,String> value=val->val*10 + "value after multiplied by 10";
		
		System.out.println(value.apply(2));
		
		//BiFunction takes input and returns output
		
		BiFunction<Integer, Integer, String> result=(x,y)->x*y+"data multiplied";
		System.out.println(result.apply(2, 3));

	}

}
