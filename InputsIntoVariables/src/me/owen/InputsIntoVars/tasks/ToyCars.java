package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

import me.owen.InputsIntoVars.InputsIntoVars;

public class ToyCars {
	public static void main(){
		Scanner input = InputsIntoVars.getScanner();
		System.out.println("Amount of hours you've worked today: ");
		double hour = input.nextDouble();
		System.out.println("Amount of toys made today: ");
		int toys = input.nextInt();
		System.out.println("You earned "+calculate(hour, toys)+" today!");
	}
	private static double calculate(double hours, int toys){
		double total;
		hours*=6;
		toys*=0.60;
		total= hours+toys;
		return total;
	}
}
