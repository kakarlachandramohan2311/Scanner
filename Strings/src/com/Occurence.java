package com;
import java.util.Scanner;
public class Occurence 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int [] freq = new int[s.length()];
		char a[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			freq[i]=1;
				for(int j=i+1;j<=s.length()-1;j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						freq[i]++;
						a[j]='0';
					}
		 		}
		}
		System.out.println("Characters and their coresponding Occurence");
		for(int i=0;i<=s.length()-1;i++)
		{
			if(a[i] !=' '&&a[i] !='0')
			{
				System.out.println(a[i]+"_"+freq[i]);
			}
		}
	}
}