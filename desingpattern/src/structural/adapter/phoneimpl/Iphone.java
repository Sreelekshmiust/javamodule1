package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.Lightningphone;

public class Iphone implements Lightningphone {
private boolean connector;
	@Override
	public void uselightning() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("lightning phone connected");
	}

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge Finished");
		}
		else
			System.out.println("connect lightning phone for Iphone");
	}

}
