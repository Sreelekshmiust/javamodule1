package observer.consumers;

import observer.iface.WeatherObserverIface;

public class NewsPaper  implements WeatherObserverIface{

public void doUpdate(int temperature) {
		
		System.out.println("Newspapers are updating temperature as " + temperature);
		//boolean result = new NewsPapers() instanceof WeatherObserver;
		//System.out.println(result);

	}
}
