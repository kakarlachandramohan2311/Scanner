package com;

public class Reverse_String {

	public static void main(String[] args) 
	{
		String s="java developer in wipro";
		String s1 []=s.split(" ");
		String s2=s1[3];
		String s3= "";
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3=s3+s2.charAt(i);
		}
          System.out.println(s3);
	}
}
