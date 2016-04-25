package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

import me.owen.InputsIntoVars.InputsIntoVars;

public class FahrenheitConverter {
	public static double convert() {
		double Centigrade;
		Scanner input = InputsIntoVars.getScanner();
		System.out.println("Enter temperature in fahrenheit:");
		Centigrade = ((input.nextDouble() - 32) * (5 / 9));
		return Centigrade;
	}
}
