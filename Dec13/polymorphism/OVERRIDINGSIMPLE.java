			OVER RIDING SIMPLE

stage event:
public class StageEvent extends Event {
    
	private int noOfShows;
	private int noOfSeatsPerShow;
	
	public StageEvent() {
		super();
	}

	public StageEvent(String name, String details, String ownerName,int noOfShows,int noOfSeatsPerShow) {
		//super(name, details, ownerName);
		this.noOfShows= noOfShows;
		this.noOfSeatsPerShow= noOfSeatsPerShow;
	}
	
	public double projectedRevenue(int noOfShows,int noOfSeatsPerShows)
	{
		return 50*noOfShows*noOfSeatsPerShows;
		
	}
	

}

---------------
Exhibition

public class Exhibition extends Event {
    
	private int noOfStalls;

	public Exhibition() {
		super();
	}

	public Exhibition(String name, String details, String ownerName,int noOfStalls) {
		super(name, details, ownerName);
		this.noOfStalls= noOfStalls;
	}
	
	public double projectedRevenue(int noOfStalls)
	{
		return noOfStalls*10000;
		
	}
}
-------------
Event

public class Event {
    
	protected String name;
	protected String details;
	protected String ownerName;
	
	public Event() {
		super();
	}

	public Event(String name, String details, String ownerName) {
		super();
		this.name = name;
		this.details = details;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}	
	
	public double projectedRevenue()
	{
		return 0.0;
		
	}

}
==========
Main

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
		
		InputStreamReader input= new InputStreamReader(System.in);// Initializing reader
		BufferedReader br= new BufferedReader(input);
		
		System.out.println("Enter the name of the event:");     //Entering details
		String name= br.readLine();
		
		System.out.println("Enter the detail of the event:");
		String detail=br.readLine();
		
		System.out.println("Enter the owner name of the event:");
		String owner=br.readLine();
		
		System.out.println("Enter the type of the event:\r\n" + "1.Exhibition\r\n" + 
				"2.StageEvent");
		int n= Integer.parseInt(br.readLine());
		
		int x,y,z;
		
		switch(n)
		{
		case 1: System.out.println("Enter the number of stalls:");
		        x=Integer.parseInt(br.readLine());
		        Exhibition ob= new Exhibition(name,detail,owner,x);
		        System.out.println("The projected revenue of the event is "+ob.projectedRevenue(x));
		        break;
		case 2: System.out.println("Enter the number of shows:");
		        x=Integer.parseInt(br.readLine());
		        System.out.println("Enter the number of seats per show:");
		        y= Integer.parseInt(br.readLine());
		        StageEvent obj= new StageEvent(name,detail,owner,x,y);
		        System.out.println("The projected revenue of the event is "+obj.projectedRevenue(x,y));
		        break;
		default:System.out.println("Invalid case");
		        break;
		}
		
		

	}

}
