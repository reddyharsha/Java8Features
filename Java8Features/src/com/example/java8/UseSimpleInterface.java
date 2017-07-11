/**
 * 
 */
package com.example.java8;

import com.example.java8.interfaces.SimpleInterface;

/**
 * @author hsubbagari
 *
 */
public class UseSimpleInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();

	}

}
