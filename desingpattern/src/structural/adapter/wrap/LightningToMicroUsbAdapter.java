package structural.adapter.wrap;

import structural.adapter.phoneiface.Lightningphone;
import structural.adapter.phoneiface.MicroUsbPhone;

public class LightningToMicroUsbAdapter implements MicroUsbPhone {
	
    private final Lightningphone lightningPhone;

    public LightningToMicroUsbAdapter(Lightningphone lightningPhone) {
        this.lightningPhone = lightningPhone;
    }
    @Override
    public void recharge() {
        lightningPhone.recharge();
    }

	@Override
	public void usemicrousb() {
		System.out.println("MicroUsb connected");
        lightningPhone.uselightning();
	}
}