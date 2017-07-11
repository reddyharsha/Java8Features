package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.example.java8.predicate.Person;

public class InstanceMethodReference {
	
	public static void main(String[] args){
		InstanceMethodReference imf = new InstanceMethodReference();
		imf.sortData();
	}

	private void sortData() {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Moe", 28));
		people.add(new Person("Doe", 38));
		
		Collections.sort(people, this :: compareAges);
		
		people.forEach(p -> System.out.println(p));
	}
	
	private int compareAges(Person p1, Person p2){
		Integer p1Age = p1.getAge();
		return p1Age.compareTo(p2.getAge());
	}

}
