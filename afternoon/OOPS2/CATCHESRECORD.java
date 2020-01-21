						CATCHESRECORD

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
		Scanner Sc= new Scanner(System.in);
		
		int N= Sc.nextInt();
		
		int temp;
		int count=0;
		if(N>0)
		{
		int a[]= new int[N];
		for(int i=0;i<N;i++)
		{
			a[i]=Sc.nextInt();
			if(a[i]<0)
			{
				System.out.println("Invalid Input");
				count++;
				break;
				
			}
		}
		if(count==0)
		{
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			temp= a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    			
	    		}
	    	}
		}
		
		for(int i=0;i<N;i++)
		{
			System.out.println(a[i]);
		}
		}
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
