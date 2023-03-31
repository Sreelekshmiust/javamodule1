package TestLambdas;

@FunctionalInterface
interface Shape{
	double area();    
	//double perimeter();                can't add another function
}

interface Math{
	double power(int b, int e);
}

interface factorial{
	int fact(int a);
}

public class Example1 {

	public static void main(String[] args) {
		
	int localvariable=10;
		
		factorial f = (int a) -> {
									int fact =1;
									for(int i=1;i<=a;i++) {
										fact = fact * i;
									}
									return fact;
							};
		int result1 = f.fact(5);
		System.out.println(result1);
							
		Runnable r1 = new Runnable(){
			public void run() {
				System.out.println("from run method");
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r = () -> {
								for(int i=1;i<5;i++) {
									System.out.println("in run method" + i +" " + localvariable);
								}
							
							};
							
				Thread t = new Thread(r);
				t.start();
			
		
		Math m = (int b, int e) -> {
							int p=1;
							for(int i=1;i<=e;i++) {
								p *= b;
							}
							return p;
						};
		double p=m.power(2, 3);
		System.out.println(p);
		
		Shape s = () -> {
							return 0.0;
						};
		double result = s.area();
		System.out.println(result);

	}

}
