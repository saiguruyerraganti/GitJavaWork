

					STRINGPRASINGUSINGLENHTH

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter address:");
		String s= sc.nextLine();
		
		String a0= s.substring(0,20);
		String a1= s.substring(20,44);
		String a2= s.substring(44,57);
		String a3= s.substring(57,68);
		String a4= s.substring(68,71);
		String a5= s.substring(71,77);
		String a6= s.substring(77,79);
		String a7= s.substring(79,84);
		
	    String line1=a0;
		String line2=a1;
		String line3=a3;
		String city=a4;
		String state=a6;
		String country=a7;
		String otherDetails=a2;
		int zipCode=Integer.parseInt(a5);
		
		System.out.println("Address : ");
		Address ob= new Address(line1,line2,line3,city,state,country,
				otherDetails,zipCode) ;
		System.out.println(ob);

	}

}
--------------------------------------------------------------------------------------------







public class Address {
    
	private String line1;
	private String line2;
	private String line3;
	private String city;
	private String state;
	private String country;
	private String otherDetails;
	private int zipCode;
	
	public Address(String line1, String line2, String line3, String city, String state, String country,
			String otherDetails, int zipCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.otherDetails = otherDetails;
		this.zipCode = zipCode;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return this.line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOtherDetails() {
		return this.otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	public int getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return line1+",\n"+line2+",\n"+otherDetails+",\n"+line3+",\n"+city+" - "+zipCode+",\n"+state+",\n"+country;
	}
	
	

}
