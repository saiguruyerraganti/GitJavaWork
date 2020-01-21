import java.util.HashMap;
import java.util.Scanner;

public class Main {        

    public static void main(String[] args) {       
	
		Scanner sc= new Scanner(System.in);  
		
		HashMap<String,Integer> hm= new HashMap<>();   
		String choice="";        
		do
		{
			System.out.println("Enter the user name");     
			String ur_name= sc.nextLine();
			System.out.println("Enter Complaints - seperated by \"|\" symbol.");
			String ur_comp= sc.nextLine();
			String []complaints= ur_comp.split("\\|");  
			User ur= new User(ur_name, complaints.length);    
			hm.put(ur_name, complaints.length);   
			
			System.out.println("Do you want to add another user (yes/no)");
			choice= sc.nextLine();
		}while(choice.equalsIgnoreCase("yes"));   
		
		
		do
		{
		System.out.println("Enter the user name to search");
		String name= sc.nextLine();
		if(hm.containsKey(name))
		{
			System.out.println("User name : "+name+"\r\n" + "Complaint Count : "+hm.get(name));
		}
		else
		{
			System.out.println("No user found with the name "+name);     
		}
		System.out.println("Do you want to search another user (yes/no)");
		choice = sc.nextLine();
		}while(choice.equalsIgnoreCase("yes"));

	}

}
==============================

class User
{
    private String name;
	private int complaintCount;
	
	public User(String name, int complaintCount) {
		super();
		this.name = name;
		this.complaintCount = complaintCount;
	}
	
}

