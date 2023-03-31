package structural.adapter.phoneimpl;

import structural.adapter.phoneiface.MicroUsbPhone;

public  class Android implements MicroUsbPhone {
	private boolean connector;
	@Override
	public void recharge() {
		if(connector) {
			System.out.println("Recharge started");
			System.out.println("Recharge Finished");
		}
		else
			System.out.println("connect Microusb for Android");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void usemicrousb() {
		connector=true;
		System.out.println("micro usb connected");
		// TODO Auto-generated method stub
		
	}

}
