package com.DayTwo;

import java.util.Arrays;

public class DivisibleByThree {
	
	public static void main(String[]args)
	{
		int []arr =new int[10];
		int indx =0;
		for(int i =1;i<=30;i++)		
		{
			if(i%3==0)
			{
				arr[indx++]=i;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
