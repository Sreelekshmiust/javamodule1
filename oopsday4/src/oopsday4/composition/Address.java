package oopsday4.composition;

public class Address {

	private String doorno;
	private String buildingName;
	private String street;
	private String city;
	private long pin;
	
	public Address() {
		
	}

	public Address(String doorno, String buildingName, String street, String city, long pin) {
		super();
		this.doorno = doorno;
		this.buildingName = buildingName;
		this.street = street;
		this.city = city;
		this.pin = pin;
	}

	public String getDoorno() {
		return doorno;
	}

	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", buildingName=" + buildingName + ", street=" + street + ", city=" + city
				+ ", pin=" + pin + "]";
	}
	
	
}
