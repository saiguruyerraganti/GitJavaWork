

					EMAILCOMP

MAIN

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Customer Details :");
		System.out.println("Enter Customer Name :");
		String cname1=sc.next();
		System.out.println("Enter Customer Email :");
		String cmail1=sc.next();
		
		System.out.println("Enter Second Customer Details :");
		System.out.println("Enter Customer Name :");
		String cname2=sc.next();
		System.out.println("Enter Customer Email :");
		String cmail2=sc.next();
		
		Customer c1= new Customer(cname1,cmail1);
		Customer c2= new Customer(cname2,cmail2);
		
		if(c1.equals(c2))
		{
			System.out.println("The Email ids of "+cname1+" and "+cname2+" are equal");
		}
		else
		{
			System.out.println("The Email ids of "+cname1+" and "+cname2+" are not equal");
		}
		
		System.out.println("Comparing without considering the cases :");
		
		if(c1.equalsIgnoreCase(c2))
		{
			System.out.println("The Email ids of "+cname1+" and "+cname2+" are Equal");
		}
		else
		{
			System.out.println("The Email ids of "+cname1+" and "+cname2+" are not Equal");
		}

	}

}
---------------------------------------------------------------------------------------


CUST




public class Customer {
    
	private String customerName;
	private String customerEmail;
	
	public Customer(String customerName, String customerEmail) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		return true;
	}
	public boolean equalsIgnoreCase(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equalsIgnoreCase(other.customerEmail))
			return false;
		return true;
	}
	

}


