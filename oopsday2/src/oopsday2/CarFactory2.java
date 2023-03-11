package oopsday2;

public class CarFactory2 {

	public static void main(String[] args) {
		//CarIface car = new CarIface();//
		
		//CarIface car; //not refering to any object
		CarIface car=new Car(5000,500,0,false);
		System.out.println(car);
		car.start();
		car.honk();
		car.move();
		car.stop();
		System.out.println(car);

	}

}
