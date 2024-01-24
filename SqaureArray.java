package com.DayTwo;

import java.util.*;

public class SqaureArray {
	public static void main(String[]args)
	{
		int []arr =new int[10];
		int indx =0;
		for(int i =1;i<=10;i++)		
		{
			arr[indx++]=i*i;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
