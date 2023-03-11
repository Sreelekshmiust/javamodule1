package oopsday3.math;

public class MathImp implements MathIface {
	
	
	public MathImp() {
		
	}


	@Override
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	@Override
	public int sum(int num1,int num2) {
		
		return num1+num2;
	}

	@Override
	public void primeOrNot(int num) {
		int flag=0;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("the number is prime");
		else 
			System.out.println("the number not prime");
		
	}

	@Override
	public int oddOrEven(int num) {
		if(num%2==0)
			return 0;
		else
			return 1;
	}

	@Override
	public int multiply(int num1, int num2) {
		return num1*num2;
	}


	@Override
	public int subtraction(int num1, int num2) {
		return num1-num2;
	}


	@Override
	public int division(int num1, int num2) {
		
		return num1/num2;
	}


	@Override
	public int modulus(int num1, int num2) {
		
		return num1%num2;
	}


	@Override
	public int square(int num1) {
		
		return num1*num1;
	}


	@Override
	public int cube(int num1) {
		
		return num1*num1*num1;
	}
	

}
