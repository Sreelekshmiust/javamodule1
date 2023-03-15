package firsttest;

public class Calculator {
	
	public int power(int b ,int e ) {
		int product=1;
		if(b==0|| e==0)
			return 0;
		else {
		for(int i=1;i<=e;i++) {
			product*=b;
		}
		return product;
	}
	}
	
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public int fibonacci(int num) {
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<num;i++) {
			c=a+b;
			a=b;
			b=c;
		} 
		return c;
	}
}
