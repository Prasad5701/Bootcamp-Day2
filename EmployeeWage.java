package com.DayTwo;

public class EmployeeWage {
	static final int isFullTime =1;
	static final int isPartTime=2;
	static final int empRatePerHour =125;
	static final int numWorkingDays=30;
	static final int maxHoursInMonth=100;
	
	public static void main(String []args)
	{
		int empHrs=0,empWage=0,totalEmpWage=0,totalEmpHrs=0,totalWorkingDays=0;
		
		while(totalEmpHrs<maxHoursInMonth || totalWorkingDays<numWorkingDays)
		{
			totalWorkingDays ++;
			double empCheck=Math.floor(Math.random()*10)%3;
			System.out.print("Employee Attendance Check "+ empCheck);
			switch((int)empCheck)
			{
			case isFullTime:
				empHrs=8;
				break;
			case isPartTime:
				empHrs=8;
				break;
			default:
				empHrs=0;
				break;
			}
			
			totalEmpHrs =totalEmpHrs + empHrs;
			empWage =empHrs*empRatePerHour;
			System.out.println("Employee Wage is "+empWage);
			totalEmpWage=totalEmpWage + empWage;
			
		}
		System.out.println("Total Emplyoee Wage" + totalEmpWage);
	}

}
