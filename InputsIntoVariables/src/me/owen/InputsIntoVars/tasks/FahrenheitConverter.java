package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

public class FahrenheitConverter {
	private static double Centigrade;
	public static double convert() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		Centigrade = ((input.nextDouble() - 32) * (5 / 9));
		input.close();
		return Centigrade;
	}
}
