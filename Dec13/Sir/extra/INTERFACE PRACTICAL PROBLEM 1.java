import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
        System.out.println("Enter the string");
        String s= Sc.nextLine();
        int count=0;
        
        System.out.print("The processed string is ");
        char ac[] = s.toCharArray();
        for(int i = 0; i < ac.length; i++)
        {
           if(ac[i] == 'x')
           {
        	   count++;
        	   continue;
        	   
           }
           System.out.print(ac[i]);
        }
        while(count>0)
        {
        System.out.print('x');
        count--;
        }
	}}     
============================

public class Hdfc implements Notification {
 @Override
 public void notificationBySms() {
  System.out.println("Notification By SMS");
  
 }
 @Override
 public void notificationByEmail() {
  System.out.println("Notification By Mail");
  
 }
 @Override
 public void notificationByCourier() {
  System.out.println("Notification By Courier");
  
 }
}
=================================
public class Icici implements Notification{
 @Override
 public void notificationBySms() {
  System.out.println("Notification By SMS");
  
 }
 @Override
 public void notificationByEmail() {
  System.out.println("Notification By Mail");
  
 }
 @Override
 public void notificationByCourier() {
  
  System.out.println("Notification By Courier");
 }
}

===============================
interface Notification {
 void notificationBySms();
 void  notificationByEmail();
    void notificationByCourier();
}

============================
public class BankFactory {
 public void getIcici()
 {
  System.out.print("ICICI - ");
  
 }
 public void getHdfc()
 {
  System.out.print("HDFC - ");
  
 }
}
