package factory;

public class Selton implements VehicleIface {


	@Override
	public void start() {
		System.out.println("Started..."+getClass());
		
	}

	@Override
	public void stop() {
		System.out.println("Stopped..."+getClass());
		
	}

	@Override
	public void honk() {
		System.out.println("pom pom..."+getClass());
		
	}

	@Override
	public void move() {
		System.out.println("Moving..."+getClass());
		
	}

}
