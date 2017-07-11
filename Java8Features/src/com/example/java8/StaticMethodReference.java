package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.java8.predicate.Person;

public class StaticMethodReference {
	
	public static void main(String[] args){
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Moe", 28));
		people.add(new Person("Doe", 38));
		
		Collections.sort(people, Person :: compareAges);
		
		people.forEach(p -> System.out.println(p));
	}

}
