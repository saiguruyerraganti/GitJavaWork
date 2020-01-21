Main


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class Main
{
    public static void main(String[] args) throws NumberFormatException, IOException
	{
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(input);
		
		System.out.println("1)Privilege Customer\n2)SeniorCitizen Customer\nEnter Customer Type");
		int n= Integer.parseInt(br.readLine());
		
		
		if(n==1)
		{
			System.out.println("Enter The Name");
			String s= br.readLine();
			
			System.out.println("Enter The Age");
			int x=Integer.parseInt(br.readLine());
			
			System.out.println("Enter The Address");
			String y= br.readLine();
			
			System.out.println("Enter The Mobile Number");
			String m= br.readLine();
			
			System.out.println("Enter The Purchased Amount");
			double am=Double.parseDouble(br.readLine());
			
			PrivilegeCustomer ob1= new PrivilegeCustomer(s,y,x,m,am);
			System.out.println("Bill Details");
			ob1.displayCustomer();
			System.out.println("Your bill amount is Rs "+am+". Your bill amount is discount under privilege customer");
			System.out.print("You have to pay Rs ");
			PrintStream printf = System.out.printf("%.2f",ob1.generateBillAmount(am));
		}
		else if(n==2)
		{
			System.out.println("Enter The Name");
			String s= br.readLine();
			
			System.out.println("Enter The Age");
			int x=Integer.parseInt(br.readLine());
			
			System.out.println("Enter The Address");
			String y= br.readLine();
			
			System.out.println("Enter The Mobile Number");
			String m= br.readLine();
			
			System.out.println("Enter The Purchased Amount");
			double am=Double.parseDouble(br.readLine());
			
			SeniorCitizenCustomer ob1= new SeniorCitizenCustomer(s,y,x,m,am);
			System.out.println("Bill Details");
			ob1.displayCustomer();
			System.out.println("Your bill amount is Rs "+am+". Your bill amount is discount under senior citizen customer");
			System.out.print("You have to pay Rs ");
			System.out.printf("%.2f",ob1.generateBillAmount(am));
		}
		else
		{
			System.out.println("Invalid Customer Type");
		}
		
		
		
		
	}
}
====================

Customer

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Customer {

    private String name;
    private String address;
	private int age;
	private String mobileNumber;
	
	public Customer(String name, String address, int age, String mobileNumber) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.mobileNumber = mobileNumber;
	}

	public Customer() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public void displayCustomer()
	{
		System.out.println("Name "+this.name);
		System.out.println("Mobile "+this.mobileNumber);
		System.out.println("Age "+this.age);
		System.out.println("Address "+this.address);
	}
}
===================================
Seniorcitizen

class SeniorCitizenCustomer extends Customer
{

    public  double amount;	
	public SeniorCitizenCustomer(String name, String address, int age, String mobileNumber, double amount) {
		super(name, address, age, mobileNumber);
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public double generateBillAmount(double amount)
	{
		double x= amount-(0.12*amount);
		return x;
	}
}
===============================
PrivilegeCus

class PrivilegeCustomer extends Customer{



    double amount;
	
	public PrivilegeCustomer(String name, String address, int age, String mobileNumber, double amount) {
		super(name, address, age, mobileNumber);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double generateBillAmount(double amount)
	{
		double x= amount-(0.3*amount);
		return x;
	}
	
}