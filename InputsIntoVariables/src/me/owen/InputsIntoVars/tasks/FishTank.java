package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

import me.owen.InputsIntoVars.InputsIntoVars;

public class FishTank {
	public static void main(){
		Scanner input= InputsIntoVars.getScanner();
		System.out.println("Enter length of fish tank: ");
		double length = input.nextDouble();
		System.out.println("Enter width of fish tank: ");
		double width = input.nextDouble();
		System.out.println("Enter height of fish tank: ");
		double height = input.nextDouble();
		System.out.println("The volume of your fish tank is: "+(length*height*width));
	}
}
