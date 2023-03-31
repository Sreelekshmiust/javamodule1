package structural.adapter.main;

import structural.adapter.phoneiface.Lightningphone;
import structural.adapter.phoneiface.MicroUsbPhone;
import structural.adapter.phoneimpl.Android;
import structural.adapter.phoneimpl.Iphone;
import structural.adapter.wrap.LightningToMicroUsbAdapter;

public class AdapterMainDemo {

	public static void rechargeMicroUsbPhone(MicroUsbPhone phone) {
		phone.usemicrousb();
		phone.recharge();
	}

	public static void rechargeLightningPhone(Lightningphone phone) {
		phone.uselightning();
		phone.recharge();
	}

	public static void main(String[] args) {
		Android android = new Android();
		Iphone iPhone = new Iphone();
		
		boolean result = android instanceof MicroUsbPhone;
		System.out.println(result);
		

		System.out.println("Recharging android with MicroUsb");
		rechargeMicroUsbPhone(android);

		System.out.println("Recharging iPhone with Lightning");
		rechargeLightningPhone(iPhone);

				
	
	System.out.println("Recharging iPhone with MicroUsb");
	    rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));// call goes to  line#11
	}
}
