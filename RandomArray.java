package com.DayTwo;

import java.util.*;

public class RandomArray {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber : ");
		int num =sc.nextInt();
		enterThreeTimes(num);
		
		
	}
	static int count =1;
	public static void enterThreeTimes(int num)
	{
		
		if(count==4)
		{
			System.out.println("Enter Wrong Input please Enter between 1 to 10");
		
		}

		else if(num>=1 && num<=10)
		{
			double []arr =new double[num];
		
			for(int i=0;i<num;i++) {
				arr[i]=Math.floor(Math.random()*10)% 500;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}
		else
		{
			count ++;
			//System.out.println(count);
			enterThreeTimes1(num);	
			
			
		}
		
	}
	public static void enterThreeTimes1(int num) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a NUmber : ");
		int num1 =sc.nextInt();
		num=num1;
		enterThreeTimes(num);
		
		
	}

}






