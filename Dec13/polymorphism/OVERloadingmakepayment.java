TicketBooking

public class TicketBooking {
    
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	
	public TicketBooking() {
		super();
	}

	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		super();
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noOfSeats = noOfSeats;
	}

	public String getStageEvent() {
		return this.stageEvent;
	}

	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getNoOfSeats() {
		return this.noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
	public void makePayment(double amount)
	{
		System.out.println("Amount "+amount+" paid in cash");
	}
	
	public void makePayment(String walletNumber ,double amount)
	{
		System.out.println("Amount "+amount+" paid using wallet number "+walletNumber);
	}
	
	public void makePayment(String creditCard,String ccv,String name,double amount)
	{
		System.out.println("Amount "+amount+" paid using "+creditCard+" card\r\n" + 
				"CCV:"+ccv);
	}
	

}
======================
Main

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);   //Initializing Scanner
		
		System.out.println("Enter the Booking details");    
		String details= sc.nextLine();
		
		String a[]= details.split(",");   //Splitting details
		
		TicketBooking t= new TicketBooking(a[0],a[1],Integer.parseInt(a[2])); //Calling constructor
		
		System.out.println("Payment mode\r\n" + "1.Cash payment\r\n" + "2.Wallet payment\r\n" + 
				"3.Credit card payment");
		int n= sc.nextInt();      //Selecting method of payment
		double amount;
		
		switch(n)
		{
		case 1:System.out.println("Enter the amount");
		       amount= sc.nextDouble();
		       System.out.println("Stage event:"+t.getStageEvent());
		       System.out.println("Customer:"+t.getCustomer());
		       System.out.println("Number of seats:"+t.getNoOfSeats());
		       t.makePayment(amount);
		       break;
		case 2:System.out.println("Enter the amount");
	           amount= sc.nextDouble();
	           System.out.println("Enter the wallet number");
	           String wallnum= sc.next();
	           System.out.println("Stage event:"+t.getStageEvent());
		       System.out.println("Customer:"+t.getCustomer());
		       System.out.println("Number of seats:"+t.getNoOfSeats());
		       t.makePayment(wallnum, amount);
		       break;
	    case 3 :System.out.println("Enter card holder name");
               String name= sc.next();
               System.out.println("Enter the amount");
               amount= sc.nextInt();
               System.out.println("Enter the credit card type");
               String cname= sc.next();
               System.out.println("Enter the CCV number");
               String cnum= sc.next();
               System.out.println("Stage event:"+t.getStageEvent());
               System.out.println("Customer:"+t.getCustomer());
               System.out.println("Number of seats:"+t.getNoOfSeats());
               System.out.println("Holder name:"+name);
               t.makePayment(cname, cnum, name, amount);
               break;   
        default:System.out.println("Invalid choice");
                break;
		}
		

	}

}
