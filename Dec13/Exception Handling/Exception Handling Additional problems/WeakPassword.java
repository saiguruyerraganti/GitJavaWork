 Main

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner(System.in);           //Initializing Scanner
		
		try                                           //Starting of try block
		{
			System.out.println("Enter the user details");         //Getting user details from console
			String details= sc.nextLine();
			
			String a[]= details.split(",");                      //Splitting user details
			
			User ob= new User(a[0],a[1],a[2],a[3]);            //Creating object to call constructor from user class and assigning data
			 
			UserBO ob2= new UserBO();                          //Creating object to call constructor from UserBO class
			
			ob2.validate(ob);                                  //Running validate ob method to check exception
			
			System.out.println(ob);                            //If there is no exception, print details
		}
		
		catch(WeakPasswordException e)                 //Starting of catch block
		{ 
			System.out.println("WeakPasswordException: "+e.message);        //Display message incase of exception
		}

	}

}
=================
User


public class User {

    private String name;                            //Initializing variables
	private String mobile;
	private String username;
	private String password;
	
	public User() {                         //Default Constructor
		super();
	}

	public User(String name, String mobile, String username, String password) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.username = username;            //Parameterized Constructor
		this.password = password;
	}

	public String getName() {                         //Creating getters and Setters
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {                                         //To string to display data
		
		return "Name:"+this.name+"\r\nMobile:"+this.mobile+"\r\nUsername:"+this.username+"\r\nPassword:"+this.password;
	}
	
	
	
	
	
	
}
=========================
UserBO

public class UserBO {
    
	public UserBO()                    //Creating a Default Constructor
	{
	}
	
	static void validate(User u) throws Exception          //Method to check exception
	{
		int numCount=0;
		String n= u.getPassword();
		for(int i=0;i<n.length();i++)                      //Numeric counter
		{
			if(n.charAt(i)>='0' && n.charAt(i)<='9')
			{
				numCount++;
			}
		}
		
		if(numCount==0)                                   //If there are no numerics in password, then throw an exception
		{
			throw new WeakPasswordException("Your password is weak");
		}
	}

}
==================
WeakPassword

public class WeakPasswordException extends Exception {
    
	String message;             //Message variable declaration

	public WeakPasswordException(String message) {            //Constructor for message variable
		super();
		this.message = message;
	}	

}

