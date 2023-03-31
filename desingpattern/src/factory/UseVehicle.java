package factory;

public class UseVehicle {

	public static void main(String[] args) {
		
		VehicleIface selton = VehicleFactory.newInstance("Selton");
		selton.honk();
		VehicleIface xcross = VehicleFactory.newInstance("Xcross");
		xcross.start();

	}

}
