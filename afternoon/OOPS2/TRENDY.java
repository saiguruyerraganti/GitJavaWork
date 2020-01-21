

				TRENDY


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int dig=0;
		int a0,a1,a2;
		int f0=num;
		
		while(num>0)
		{
			num=num/10;
			dig++;
		}
		if(dig==3)
		{
				   a1=f0%10;
				   f0=f0/10;
				   a2=f0%10;
			   if(a2%3==0)
			   {
				   System.out.println("Trendy Number");
			   }
			   else
			   {
				   System.out.println("Not a Trendy Number");
			   }
		  
		}
		else
		{
			System.out.println("Not a Trendy Number");
		}
	}

}

