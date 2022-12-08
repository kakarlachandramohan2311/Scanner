package com;
import java.util.Scanner;
public class AnagramString 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String a= scan.next();
		System.out.println("Enter a Second String");
		String b= scan.next();
		char[] c=a.toCharArray();
		char [] d= b.toCharArray();
		boolean g=false;
		if(a.length()==b.length())
		{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<d.length;j++)
			{
				if(c[i]==d[j])
				{
					g=true;
				}
			}
		}
		}
		if(false)
		{
			System.out.println("Given String is a Anagram");
		}
		else
		{
			System.out.println("Given String is Not a Anagram");
		}
	}
	}