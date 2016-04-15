package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

public class SimpleAdder {
	private static int one,two;
	public static int addTwoInts(){
		Scanner input = new Scanner(System.in); //Import correct methods to read keyboard
		System.out.println("First number:");
		one=input.nextInt();
		System.out.println("Second number:");
		two=input.nextInt();
		input.close();// Remember to close the stream!
		return (one+two);
	}
}
