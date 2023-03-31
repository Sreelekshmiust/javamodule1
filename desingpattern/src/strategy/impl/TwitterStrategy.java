package strategy.impl;

import strategy.iface.ISocialMediaStrategy;

public class TwitterStrategy implements ISocialMediaStrategy{

	@Override
	public void connectTo(String friendName) {
		System.out.println(
	    		"Connecting with " + friendName + " through Twitter");
		
	}

}
