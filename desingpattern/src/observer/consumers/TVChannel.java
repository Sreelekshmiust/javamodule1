package observer.consumers;

import observer.iface.WeatherObserverIface;

public class TVChannel implements WeatherObserverIface{

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TV Channel are updating temperature as "  + temperature);
		
	}

}
