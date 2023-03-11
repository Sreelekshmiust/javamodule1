package multithreading;

public class TestThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main started....");
		Mythread t1 = new Mythread("T1");
		Mythread t2 = new Mythread("T2");
		
		t1.start();
		t2.start();
		
		System.out.println("main ended....");
		

	}

}
