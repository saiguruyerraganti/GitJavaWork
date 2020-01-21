
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);           //Initializing Scanner
		
		try                                            //Try method start
		{
		System.out.println("Enter an integer input");   //Get an integer input from console
		int n= sc.nextInt();
		
		System.out.println("Entered value is "+n);
		}
		catch(InputMismatchException e)               //Catch method to catch errors
		{
		     System.out.println("java.util.InputMismatchException");
		}
	}

}
