`				DAY1



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int N= sc.nextInt();
		
		int f0=1;
		int f2=8;
		System.out.print(f0);
		
		for(int i=0;i<N-1;i++)
		{
			f0=f0+f2;
			System.out.print(" "+f0);
			if(i%2!=0)
			{
				f2=f2+8;
			}
		}
	}
}