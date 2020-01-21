	
VISACard 

public class VISACard {
    
	private String holderName;
	private String ccv;
	
	public VISACard() {            //Default Constructor
		super();
	}

	/**
	 * @param holderName
	 * @param ccv
	 */
	public VISACard(String holderName, String ccv) {       //Parameterized Constructor
		super();
		this.holderName = holderName;
		this.ccv = ccv;
	}
	
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCcv() {
		return this.ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public static double computeRewardPoints(String purchaseType, Double amount)
	{
		//System.out.println(amount);
		return amount*0.01;
	}

}
=============
 Main

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);     //Initializing scanner
		
		char ch;
		do {
			
		System.out.println("Enter the holder name");
		String name= sc.next();
		
		System.out.println("Enter the CCV number");
		String ccv= sc.next();
		
		System.out.println("Enter the bill amount");
		double amount= sc.nextDouble();
		
		System.out.println("Mention the type of spending");
		String type= sc.next();
		
		System.out.println("Choose card type\r\n" + "1.VISA card\r\n" + "2.HP VISA card");
		int n= sc.nextInt();
		
		switch(n)
		{
		case 1:VISACard v= new VISACard(name,ccv);
		       double points=v.computeRewardPoints(type, amount);
		       System.out.println("Holder name:"+name);
		       System.out.println("CCV:"+ccv);
		       System.out.println("Reward points:"+points);
		       break;
		case 2:HPVISACard v1= new HPVISACard(name,ccv);
	           double points2=v1.computeRewardPoints(type, amount);
	           System.out.println("Holder name:"+name);
	           System.out.println("CCV:"+ccv);
	           System.out.println("Reward points:"+points2);
	           break;
	    default:System.out.println("Invalid Choice");
	            break;
		}
		System.out.println("Do you want to continue?(Y/N)");
		String choice= sc.next();
		ch= choice.charAt(0);	
	}while(ch=='Y');
	}
}
========
 HPVISACard

public class HPVISACard extends VISACard{

    public HPVISACard() {                            //Calling default constructor from superclass
		super();
	}

	/**
	 * @param holderName
	 * @param ccv
	 */
	public HPVISACard(String holderName, String ccv) {  //Calling parameterized constructor from superclass
		super(holderName, ccv);
	}
	
	public double computeRewardPoints(String purchaseType, double amount)
	{
		double points;
		if(purchaseType.equals("Fuel"))
		{
			points= VISACard.computeRewardPoints(purchaseType, amount)+10;
		}
		else
			points= VISACard.computeRewardPoints(purchaseType, amount);
		return points;
	      
	}

}
