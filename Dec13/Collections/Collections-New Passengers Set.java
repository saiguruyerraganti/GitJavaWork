

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 ArrayList<String> al=new ArrayList<String>();
  
  Scanner sc=new Scanner(System.in);
  int num,num1,count;
  System.out.println("Enter the number of passengers in the list:");
  num=sc.nextInt();
  System.out.println("Enter the passengers names:");
  for(int i=0;i<num;i++)
        {
         al.add(sc.next());
        
        }
  System.out.println("Enter the number of passengers who have not arrived to the airport on time");
  num1=sc.nextInt();
  System.out.println("Enter the passenger who are not arrived airport on time:");
  for(int i=0;i<num1;i++)
        {
       al.add(sc.next());
        
        }
  
  System.out.println("New passengers list:");
 HashSet<String> hsUnique = new HashSet<String>(al);
       List<String> list = new ArrayList<String>(hsUnique);
       Collections.sort(list);
      for(String s :list)
      {
       
        count=Collections.frequency(al, s);
       if(count==1)
       {
      
       System.out.println(s);
       }
 }
 
 }
}