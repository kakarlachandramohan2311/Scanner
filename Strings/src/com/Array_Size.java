package com;
import java.util.Scanner;
public class Array_Size
{
   public static void main(String [] arg)
   {
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter an Array size");
	int size=scan.nextInt();
	int [] a= new int [size];
	System.out.println("if you want Change Array size press 1 or to continue press 2");
	int change=scan.nextInt();
	if(change==1)
	{
		System.out.println("Enter an array size "); 
	  int e=scan.nextInt();
	  int []array=new int[e];
	  for(int i=0;i<=array.length-1;i++)
	  {
		  System.out.println("Enter a value in index : "+i);
			array[i]=scan.nextInt();
	  }
	  System.out.println("Changed array size "); 
	  for(int i=0;i<=array.length-1;i++)
		  
		{
			System.out.print(array[i]+" ");
		}
	  
	}
	else if(change==2)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter a value in index : "+i);
			a[i]=scan.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
   }
}
