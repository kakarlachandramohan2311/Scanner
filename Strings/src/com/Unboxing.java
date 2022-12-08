package com;

public class Unboxing 
{
	public static void main(String[] args) 
	{
		        //Byte
				byte a = 65; 
				Byte a1=a;              //Implicit Boxing
				byte b1 =a1.byteValue();//Explicit UNboxing
				byte b2= a1;            //Implicit UNboxing
				System.out.println("Primitive data type b1 : "+b1);
				System.out.println("Primitive data type b2 : "+b2);
				System.out.println("-----------------------------------------");
				
				
				//Short
				short s = 72;
				Short s1 =s;              //Implicit Boxing
				short s2 = s1.shortValue(); //Explicit UNboxing
				short s3 = s1;              //Implicit UNboxing
			    System.out.println("Primitive data type s2:  "+s2);
				System.out.println("Primitive data type s3 : "+s3);
				System.out.println("-----------------------------------------------------");
				
				//Integer
				int  i = 92;
				Integer i1 =i;              //Implicit Boxing
				int i2 = i1.intValue();     //Explicit UNboxing
				int i3 = i1;                //Implicit UNboxing
				System.out.println("Primitive data type i2 "+i2);
				System.out.println("Primitive data type i3 "+i3);
				System.out.println("-----------------------------------------------------");
				
				//Long
				long l = 950L;
				Long l1 =l;  //Implicit boxing
				long l2 = l1.longValue(); //Explicit UNboxing
				long l3 =l1;              //Implicit UNboxing 
				System.out.println("primitive data type l2 : "+l2);
				System.out.println("Primitive data type l3 : "+l3);
				System.out.println("-----------------------------------------------------");
				
				//Float
				float f = 9.3F;
				Float f1 = f;                 //Implicit boxing
				float f2 =f1.floatValue();    //Explicit UNboxing
				float f3 =f1;                 //Implicit UNboxing 
				System.out.println("Primitive data type f2 : "+f2);
				System.out.println( "Primitive data type f3 : "+f3);
				System.out.println("-----------------------------------------------------");
				
				//Double
				double d = 7.2;
				Double d1 = d;                   //Implicit boxing
				double d2 = d1.doubleValue();    //Explicit UNboxing
				double d3 =d1;                   //Implicit UNboxing 
				System.out.println("Primitive data type d2 : "+d2);
				System.out.println("Primitive data type d3 : "+d3);
				System.out.println("-----------------------------------------------------");
				
				
				//Boolean
				boolean o = true;
				Boolean o1 = o;                //Implicit boxing
				boolean o2 = o1.booleanValue(); //Explicit UNboxing
				boolean o3=o1;                   //Implicit UNboxing 
				System.out.println("Primitive data type o2 : "+o2);
				System.out.println("primitive data typr o3 : "+o3);
				System.out.println("-----------------------------------------------------");
				
				//Character
				char ch = 'S';
				Character c1 =ch;              //Implicit boxing
				char c2 = c1.charValue();       //Explicit UNboxing
				char c3 = c1;                    //Implicit UNboxing 
				System.out.println("Primitive data type c2 : "+c1);
				System.out.println("Primitive data type c3 : "+c2);
				
				
				
	}
}
}
