package com.java.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumerExample {

	public static void main(String[] args) {
		Person p =new Person();
		// TODO Auto-generated method stub
		//takes input and modifies data and does not provide output
		Consumer<Person> modifyName=data->data.setName("Consumer");
		modifyName.accept(p);
		System.out.println(p.getName());
		//Bi-consumer takes 2 input parameters and does not provide output
		
		Person p1 =new Person();
		Person p2 =new Person();
		BiConsumer<Person,Person> modifyNameForBiConsumer=(x,y)->{
			x.setName("Consumer1");
			y.setName("Consumer2");
		};
		modifyNameForBiConsumer.accept(p1,p2);
		
		System.out.println(p1.getName()+""+p2.getName());
		
	}

}
