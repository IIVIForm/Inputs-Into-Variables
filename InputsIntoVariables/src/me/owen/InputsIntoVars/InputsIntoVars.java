package me.owen.InputsIntoVars;

import java.util.Scanner;

public class InputsIntoVars {
	private int one,two,m1,m2,m3,condition=2;
	private double mTotal,Centigrade;
	public static void main(String[] args) {
		InputsIntoVars object = new InputsIntoVars();
		System.out.println("Total: "+object.addTwoInts());
		System.out.println("Average: "+object.testMarks());
		System.out.println("Centigrade: "+object.fahrenheitToCentigrade());
		
	}
	/*       Simple Adder Challenge       */
	private int addTwoInts(){
		Scanner input = new Scanner(System.in); //Import correct methods to read keyboard
		System.out.println("First number:");
		one=input.nextInt();
		System.out.println("Second number:");
		two=input.nextInt();
		input.close();// Remember to close the stream!
		return (one+two);
	}
	/*        Test Marks Challenge         */
	private double testMarks(){
		Scanner input = new Scanner(System.in);
		//This can be shortened but will do that later ;D
		do{
			m1=input.nextInt();
			if(m1<=100 || m1>0){
				condition=1;
			}else{
				System.out.println("Between 1-100");
			}
		}while(condition>1);
		condition=2;
		do{
			m2=input.nextInt();
			if(m2<=100 || m2>0){
				condition=1;
			}else{
				System.out.println("Between 1-100");
			}
		}while(condition>1);
		condition=2;
		do{
			m3=input.nextInt();
			if(m3<=100 || m3>0){
				condition=1;
			}else{
				System.out.println("Between 1-100");
			}
		}while(condition>1);
		input.close();
		mTotal=(double)(m1+m2+m3)/3;
		return mTotal;
	}
	private double fahrenheitToCentigrade(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		Centigrade=((input.nextDouble()-32)*(5/9));
		input.close();
		return Centigrade;
	}
}
