package me.owen.InputsIntoVars;

import me.owen.InputsIntoVars.tasks.FahrenheitConverter;
import me.owen.InputsIntoVars.tasks.SimpleAdder;
import me.owen.InputsIntoVars.tasks.TestMarks;

public class InputsIntoVars {
	public static void main(String[] args) {
		System.out.println("Total: "+SimpleAdder.addTwoInts());
		System.out.println("Average: "+TestMarks.testMarks());
		System.out.println("Centigrade: "+FahrenheitConverter.convert());
		
	}
}
