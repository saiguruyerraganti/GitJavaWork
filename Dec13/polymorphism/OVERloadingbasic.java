 Main

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
		
		InputStreamReader input= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(input);//Initializing scanner
		
		System.out.println("Enter the name of the stall:"); //Getting details
		String sname= br.readLine();
		
		System.out.println("Enter the detail of the stall:");
		String sdetail= br.readLine();
		
		System.out.println("Enter the owner name of the stall:");
		String sowner= br.readLine();
		
		System.out.println("Enter the type of the stall:");
		String stype= br.readLine();
		
		System.out.println("Enter the size of the stall in square feet:");
		int size=Integer.parseInt(br.readLine());
		
		Stall p= new Stall(sname,sdetail,sowner);
		
		System.out.println("Does the hall have TV?(y/n)");
		String sh= br.readLine();
		char ch= sh.charAt(0);
		
		if(ch=='y')
		{
			System.out.println("Enter the number of TV:");
			int ntv= Integer.parseInt(br.readLine());
			System.out.println("The cost of the stall is "+p.computeCost(stype,size,ntv));
		}
		else
		{
			System.out.println("The cost of the stall is "+p.computeCost(stype,size));
		}
	}

}
=============

Stall

public class Stall {

    protected String name;
	protected String detail;
	protected String ownerName;
	
	public Stall() {
		super();
	}

	public Stall(String name, String detail, String ownerName) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownerName = ownerName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double computeCost(String stallType, int squareFeet)
	{
		int a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return a*squareFeet;
	}
	
	public double computeCost(String stallType,int squareFeet,int numberOfTV)
	{
		double a;
		switch (stallType)
		{
		case "Platinum": a=200;
		                 break;
		case "Diamond": a=150;
		                 break;
		default: a=100;
		         break;
		}
		
		return ((a*squareFeet)+(numberOfTV*10000));
	}
	
}
