package multithreading;
import java.util.Scanner;
public class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("enter your input");
			int a= new Scanner(System.in).nextInt();
			System.out.println("got the input proceeding");
			System.out.println(Thread.currentThread().getName() + "=" + i);
			 try { 
				 Thread.sleep(3000); 
				 }
			  catch (InterruptedException e) {
				  e.printStackTrace(); 
				  }
			 

		}

	}

}
