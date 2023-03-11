package oopsday3.math;

public class MathFactory {

	public static void main(String[] args) {
		
		MathIface m= new MathImp();
		
		System.out.println("factorial =" + m.factorial(5));
		m.primeOrNot(23);
		int result=m.oddOrEven(18);
		if(result==0)
			System.out.println("the number is even");
		else
			System.out.println("the number odd");
		System.out.println("sum =" + m.sum(5,10));
		System.out.println("product =" + m.multiply(5,10));
		System.out.println("difference =" + m.subtraction(10,8));
		System.out.println("division =" + m.division(10,2));
		System.out.println("square =" + m.square(10));
		System.out.println("cube =" + m.cube(10));
		

	}

}
