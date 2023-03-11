package oopsday3.overloading;

public class TestMath {

	public static void main(String[] args) {
		Math math=new Math();
		int result = math.add(10,20);
		System.out.println("Sum is " +result);
		
		 result = math.add(10,20,30);
		System.out.println("Sum is " +result);
		
		double result2 = math.add(10.5,12.5);
		System.out.println("Sum is " +result2);
		
	 result2 = math.add(10.0,20.6,30.5);
	System.out.println("Sum is " +result2);
	
	result2=math.add(5L,20L,30L);
	System.out.println("long " +result2);
	
	result2=math.add(5F,20.5F,30F);
	System.out.println("float " +result2);
		
	}

}
