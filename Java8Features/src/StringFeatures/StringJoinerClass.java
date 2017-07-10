package StringFeatures;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String args[]) {
		
		//Creating String Joiner
		StringJoiner sj = new StringJoiner(",", "{", "}");
		sj.setEmptyValue("No Strings yet");
		System.out.println(sj);
		
		sj.add("James Harden");
		sj.add("Paul George");
		sj.add("Lebron James");
		System.out.println(sj);
		
		//Merging
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Champ");
		
		sj.merge(sj2);
		System.out.println(sj);
		
		//Working with collections
		Set<String> set = new TreeSet<>();
		set.add("Peyton Manning");
		set.add("Tom Brady");
		set.add("Andrew Luck");
		
		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s -> sj3.add(s));
		
		System.out.println(sj3);
	}
}
