import java.io.*;
import java.text.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        // fill the code
         HashSet<String> h = new HashSet<String>();
     
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of words:");
      int n=sc.nextInt();
     
      for(int i=0;i<n;i++)
      {
          h.add(sc.next());
      }
     
       System.out.println("Unique set of words:");
      List<String> list = new ArrayList<String>(h);
        Collections.sort(list);
       
       for(String s:list)
       {
          System.out.println(s);
       }
     
       
       
    }
}