package isp;

public class UstPermanentEmployee implements BasicDetails, PfDetails {

	@Override
	public void updatePfDetails() {
		System.out.println("updated Pf Details");
	}

	@Override
	public void updateBasicDetails() {
		System.out.println("updated basic details");

	}

}
