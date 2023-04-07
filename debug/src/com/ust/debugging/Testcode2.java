package com.ust.debugging;


public class Testcode2 {

	int a;
	int b;
	int x;
	int result=0;
	int a1[]= {2,5,6,8,9};
	int b1[]= {23,24,54,3,5};
	int x1[]= {17,20,21,22,4};
	//ax^2+bx^2+2ab;
	void fun() {
		for(int i=0;i<5;i++) {
			a=a1[i];
			b=b1[i];
			x=x1[i];
			result=(a*(x*x)+(b*(x*x))+(2*a*b));
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		
		new Testcode2().fun();
		
	}

}
