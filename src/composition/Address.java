package composition;

public class Address {

	private int houseNumber;
	private String houseName;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(int houseNumber, String houseName, String city, String state, String country) {
		super();
		this.houseNumber = houseNumber;
		this.houseName = houseName;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", houseName=" + houseName + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}
}
