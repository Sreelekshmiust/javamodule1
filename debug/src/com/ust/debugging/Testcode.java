package com.ust.debugging;

public class Testcode {
	int a=1;
	boolean b=true;
		void m1(){
			    System.out.println("from m1" +this.a++);
			  }
			 void m2(){
			    this.b=false;
			   System.out.println("1"+ this.a++);
			   System.out.println("2");
			   System.out.println("3");
			    this.m1();
			    this.b=true;
			    System.out.println("4"+this.a++);
			    System.out.println("5");
			    System.out.println("6"+this.a--);
			  }
			 int factorial(int n) {
				  int fact=1;
				  for(int i=1;i<=n;i++) {
					  fact=fact*i;
				  }
				  return fact;
			  }
			 public static void main(String[] args) {
				 new Testcode().m2();
				 new Testcode().factorial(5);
			 }
}