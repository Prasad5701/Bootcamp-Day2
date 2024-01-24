package com.DayTwo;
import java.util.*;
public class NumberTable {
	
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber : ");
		int num =sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num +" * "+i+" = "+ num*i);
		}
	}

}
