						ODISCORE
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		
		int n=Sc.nextInt();
		
		if(n>0)
		{
			String a[]= new String[n];
			String b[]= new String[n];
			int count=0;
			int big=0;
			for(int i=0;i<n;i++)
			{
				a[i]= Sc.next();
				b[i]=Sc.next();
				if(Integer.parseInt(b[i])<0)
				{
					System.out.println("Invalid Input");
					big++;
					break;
				}
			   if(b[i].equals("183"))
					{
						System.out.println(a[i]);
						count++;
						}
					}
			if(count==0 && big==0)
				{
					System.out.println("None");
				}
					}
		else
		{
			System.out.println("Invalid Input");
		}
	}
		
}

