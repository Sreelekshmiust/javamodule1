package factory;

public class VehicleFactory {

	public static VehicleIface newInstance(String car) {
		VehicleIface vehicle=null;
		if(car==null) {
			return null;
		}
		else if(car.equals("Selton")) {
			vehicle = new Selton();
		}
		else if(car.equals("Xcross")){
			vehicle = new Xcross();
		}
		return vehicle;
	}
}
