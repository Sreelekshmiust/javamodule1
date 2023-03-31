package observer.subject;

import observer.iface.WeatherObserverIface;

public abstract class  Observable {
    public abstract void addObserver(WeatherObserverIface weatherObserver);
	public abstract void removeObserver(WeatherObserverIface weatherObserver);
	public abstract void doNotify(); // update
}
