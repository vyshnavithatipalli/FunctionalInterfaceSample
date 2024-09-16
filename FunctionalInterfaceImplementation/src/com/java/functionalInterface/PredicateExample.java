package com.java.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//takes input and returns boolean value
		
		Predicate<String> checklength=s->s.length()>10;
		
		System.out.println(checklength.test("predicateExample"));
		System.out.println(checklength.test("Exam"));
		
		BiPredicate<String, String> highestLength=(x,y)->x.length()>y.length();
		System.out.println(highestLength.test("value","val"));
	}

}
