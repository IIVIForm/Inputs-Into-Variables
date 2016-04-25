package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

import me.owen.InputsIntoVars.InputsIntoVars;

public class SimpleAdder {
	private static int one,two;
	public static int addTwoInts(){
		Scanner input = InputsIntoVars.getScanner();
		System.out.println("First number:");
		one=input.nextInt();
		System.out.println("Second number:");
		two=input.nextInt();
		return (one+two);
	}
}
