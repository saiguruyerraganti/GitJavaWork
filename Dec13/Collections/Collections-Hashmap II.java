import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		int n=Integer.parseInt(sc.nextLine());                 
		
		for(int i=0;i<n;i++)
		{
			int key= Integer.parseInt(sc.nextLine());   
			int value= Integer.parseInt(sc.nextLine());     
			hm.put(key, value);
		}
		
		Set keys= hm.keySet();          
		
		for (Object object : keys) {
			int i=(int)object;
			if(hm.get(i)>75)
			{
				System.out.println(i);
	         
	         }
			
		}
	}

}