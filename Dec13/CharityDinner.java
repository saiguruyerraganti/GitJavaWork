package Basicelementsofjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharityDinner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Define or declare variables or arrays if the input was given in the problem
		String ticketArray[]={"PINK","GREEN","RED","ORANGE"};
		int ticketCostArray[]=new int[4];
		int numberOfTicketsArray[][]=new int[4][];
		
		//create input stream reader object
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//accept ticket cost for each colored ticket
		int counter=0;
		//accept ticketCost for each colored ticket
		while(counter<4)
		{
			ticketCostArray[counter]=Integer.parseInt(br.readLine());
			counter++;
		}
		//accept amount to be raised by selling tickets
		int amountTobeRaised=Integer.parseInt(br.readLine());
		int amountCollected=0;	
		//store number of tickets as per ticket color
		for(int i=0;i<4;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				//for-each ticket
				for(String ticketColor : ticketArray)
				{
				for(int not=0;not<max(ticketCostArray);not++)
				{
					if(not==0)
					{
						numberOfTicketsArray[i][j]=0;
					}
					else
					{
						amountCollected=(not*ticketCostArray[not]);
					
					
						if(amountCollected/amountTobeRaised==1)
						{
							numberOfTicketsArray[i][j]=1;
						}//end of if block
					}//else block
					}
				}
			}
		}
		
		
		
		

	}
	public static int  max(int array[])
	{  int maxElement=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i+1]>array[i])
				maxElement=array[i+1];
				
		}
		return maxElement;
	}

}
