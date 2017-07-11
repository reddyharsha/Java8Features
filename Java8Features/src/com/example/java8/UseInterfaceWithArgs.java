package com.example.java8;

import com.example.java8.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		
		InterfaceWithArgs obj = (v1, v2) -> 
		{
			int result = v1 * v2;
			System.out.println("The result is " + result);
		};
		obj.calculate(10, 5);

	}

}
