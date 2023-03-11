package exceptionhandlingday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Program task begin"); int a=10; int b=0; int c=a/b;
		 * System.out.println(c); System.out.println("Program completed task");            //without try catch
		 */
		
		/*System.out.println("Program task begins");
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot / by zero");
		}
		System.out.println("Program completed task");
	}*/
		
		System.out.println("Program task begins");
		
		try {
			Scanner scn = new Scanner(System.in);
			int a=scn.nextInt();
			int b=scn.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot / by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("invalid input format");
		}
		System.out.println("Program completed task");
	}

}
