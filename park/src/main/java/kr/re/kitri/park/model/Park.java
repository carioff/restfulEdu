package kr.re.kitri.park.model;

public class Park {

	private String parkId;
	private String name;
	private String alias;
	private String city;
	private String state;
	private String country;
	
	public Park() {}
	
	public Park(String parkId, String name, String alias, String city, String state, String country) {
		super();
		this.parkId = parkId;
		this.name = name;
		this.alias = alias;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String getParkId() {
		return parkId;
	}
	public void setParkId(String parkId) {
		this.parkId = parkId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
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
		return "Park [parkId=" + parkId + ", name=" + name + ", alias=" + alias + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}

	
}
