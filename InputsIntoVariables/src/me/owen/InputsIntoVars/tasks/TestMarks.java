package me.owen.InputsIntoVars.tasks;

import java.util.Scanner;

public class TestMarks {
	private static int m1,m2,m3,condition=2;
	private static double mTotal;
	/* Test Marks Challenge */
	public static double testMarks() {
		Scanner input = new Scanner(System.in);
		// This can be shortened but will do that later ;D
		do {
			m1 = input.nextInt();
			if (m1 <= 100 || m1 > 0) {
				condition = 1;
			} else {
				System.out.println("Between 1-100");
			}
		} while (condition > 1);
		condition = 2;
		do {
			m2 = input.nextInt();
			if (m2 <= 100 || m2 > 0) {
				condition = 1;
			} else {
				System.out.println("Between 1-100");
			}
		} while (condition > 1);
		condition = 2;
		do {
			m3 = input.nextInt();
			if (m3 <= 100 || m3 > 0) {
				condition = 1;
			} else {
				System.out.println("Between 1-100");
			}
		} while (condition > 1);
		input.close();
		mTotal = (double) (m1 + m2 + m3) / 3;
		return mTotal;
	}
}
