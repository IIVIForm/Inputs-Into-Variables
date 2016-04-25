package me.owen.InputsIntoVars;

import java.util.Scanner;

import me.owen.InputsIntoVars.tasks.FahrenheitConverter;
import me.owen.InputsIntoVars.tasks.FishTank;
import me.owen.InputsIntoVars.tasks.SimpleAdder;
import me.owen.InputsIntoVars.tasks.TestMarks;

public class InputsIntoVars {
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int runProgram = 1;
		String choice = "";
		while(runProgram>0){
			System.out.println("Enter which task you would like to execute");
			System.out.println("Fahrenheit | FishTank | SimpleAdder | TestMarks");
			System.out.println("ToyCars | EXIT");
			System.out.println("Enter: ");
			choice=input.next();
			switch (choice.toLowerCase()){
			case "fahrenheit":
				System.out.println("Centigrade: "+FahrenheitConverter.convert());
				break;
			case "fishtank":
				FishTank.main();
				break;
			case "simpleadder":
				System.out.println("Total: "+SimpleAdder.addTwoInts());
				break;
			case "testmarks":
				System.out.println("Average: "+TestMarks.testMarks());
				break;
			case "exit":
				runProgram=0;
				break;
			default:
				System.out.println("You did not enter a valid argument!");
				break;
			}
		}
		System.out.println("Exiting...");
		input.close();
	}
	public static Scanner getScanner(){
		return input;
	}
}
