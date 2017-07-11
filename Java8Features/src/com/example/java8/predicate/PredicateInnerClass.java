package com.example.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInnerClass {
	
	public static void main(String[] args){
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("John", 22));
		people.add(new Person("Doe", 32));
		people.add(new Person("Mary", 42));
		
		//Predicate is a Java 8 feature
		Predicate<Person> pred = new Predicate<Person>() {
			
			@Override
			public boolean test(Person t) {
				return t.getAge()>=30;
			}
		};
		
		for (Person person : people) {
			if(pred.test(person)){
				System.out.println(person.toString());
			}
		}
		
		//Now lets Use only Java 8 features to replicate the above
		Predicate<Person> predOlder = (p) -> p.getAge() > 30;
		Predicate<Person> predYounger = (p) -> p.getAge() < 30;
		
		people.forEach(p -> {
			if(predOlder.test(p)){
				System.out.println("Not very old people: \n" + p.toString());
			}
			if(predYounger.test(p)){
				System.out.println("Young people: \n" + p.toString());
			}
		});
	}

}
