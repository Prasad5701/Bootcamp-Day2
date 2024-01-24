package com.DayTwo;
import java.util.*;
public class DayOfWeek {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		if(num<=7)
		{
			for(int i=1;i<=num;i++)
			{
				//System.out.print(i + " Sunday");
				switch(i)
				{
				case 1:
					System.out.println(1+ " : Sunday");
					break;
				case 2:
					System.out.println(2+ " : Monday");
					break;
				case 3:
					System.out.println(3+ " : Tuesday");
					break;
				case 4:
					System.out.println(4+ " : Wednesday");
					break;
				case 5:
					System.out.println(5+ " : Thusday");
					break;
				case 6:
					System.out.println(6+ " : Friday");
					break;
				case 7:
					System.out.println(7+ " : Saturday");
					break;
				}
			}
			
		}
		else 
		{
			System.out.println("Please Enter Number from 1 to 7");
		}
	}

}
