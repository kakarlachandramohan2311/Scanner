package com;

import java.util.Scanner;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to find its factorial");
		int n = scan.nextInt();
		int fact=scan.nextInt();
		for (int a=1;a<=n ; a++)
		{
			if (n%a==0)
			{
				fact=fact*a;
			}
		}
		System.out.println(fact);
	}
}
