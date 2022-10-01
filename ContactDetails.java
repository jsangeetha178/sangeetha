package p1;

public class ContactDetails {
	private String housenumber;
	private String cityname;
	private String statename;
	private String countryname;
	private long pincode;
	private long mobilenumber;
	private long emailid;
	
	

	

	public ContactDetails(String housenumber, String cityname, String statename, String countryname, long pincode,
			long mobilenumber, long emailid) {
		super();
		this.housenumber = housenumber;
		this.cityname = cityname;
		this.statename = statename;
		this.countryname = countryname;
		this.pincode = pincode;
		this.mobilenumber = mobilenumber;
		this.emailid = emailid;
	}

	
	



	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public long getEmailid() {
		return emailid;
	}

	public void setEmailid(long emailid) {
		this.emailid = emailid;
	}

	public String getLocalityName1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "ContactDetails [housenumber=" + housenumber + ", cityname=" + cityname + ", statename=" + statename
				+ ", countryname=" + countryname + ", pincode=" + pincode + ", mobilenumber=" + mobilenumber
				+ ", emailid=" + emailid + "]";
	}






	
	

}
