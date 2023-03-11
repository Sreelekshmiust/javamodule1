package multithreading;


public class Mythread extends Thread {

	private String name;
	public Mythread() {
		
	}
	public Mythread(String name) {
		super();
		this.name = name;
	}
	public void run() {
		for (int i = 1; i < 600; i++) {
			System.out.println(name + " " + i);
		}
	}
	
}