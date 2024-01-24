package com.DayTwo;
import java.util.Scanner;
public class GradingSystem {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Marks : ");
		double marks = sc.nextDouble();
		
		if(marks>=90 &&marks<=100)
		{
			System.out.println("A Grade");
		}
		else if(marks>=80 )
		{
			System.out.println("B Grade");
		}
		else if(marks>=70 )
		{
			System.out.println("C Grade");
		}
		else if(marks>=60 )
		{
			System.out.println("D Grade");
		}
		else if(marks>=0 &&marks<60)
		{
			System.out.println("F Grade");
			
		}
		
	}
}
