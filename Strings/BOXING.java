package ValueOf;

public class BOXING 
{
	public static void main(String[] args) 
	{
		//Byte
		byte a = 65;
		Byte a1 = new Byte(a);   //Explicit
		Byte a2 =a;              //Implicit
		System.out.println("Wrapper Class Byte Object Type a1  : "+a1);
		System.out.println("Wrapper Class Byte Object Type a21  :"+a2);
		System.out.println("-----------------------------------------------------");
		
		
		//Short
		short s = 72;
		Short s1 = new Short(s);  //Explicit
		Short s2 =s;              //Implicit
	    System.out.println("Wrapper Class Short Object Type s1 :  "+s1);
		System.out.println("Wrapper Class Short Object Type s2  : "+s2);
		System.out.println("-----------------------------------------------------");
		
		//Integer
		int  i = 92;
		Integer i1 = new Integer(i);//Explicit
		Integer i2 =i;              //Implicit
		System.out.println("Wrapper Class Integer Object Type i1 "+i1);
		System.out.println("Wrapper Class Integer Object Type i2 "+i2);
		System.out.println("-----------------------------------------------------");
		
		//Long
		long l = 950L;
		Long l1 = new Long(l);
		Long l2 =l;
		System.out.println("Wrapper Class Long Object Type l1 "+l1);
		System.out.println("Wrapper Class Long Object Type l2 "+l2);
		System.out.println("-----------------------------------------------------");
		
		//Float
		float f = 9.3F;
		Float f1 = new Float(f);
		Float f2 = f;
		System.out.println("Wrapper Class Float Object Type f1 "+f1);
		System.out.println( "Wrapper Class Float Object Type f2 "+f2);
		System.out.println("-----------------------------------------------------");
		
		//Double
		double d = 7.2;
		Double d1 = new Double(d);
		Double d2 = d;
		System.out.println("Wrapper Class Double Object Type d1 "+d1);
		System.out.println( "Wrapper Class Double Object Type d2 "+d2);
		System.out.println("-----------------------------------------------------");
		
		
		//Boolean
		boolean b = true;
		Boolean b1 = new Boolean(b);
		Boolean b2 = b;
		System.out.println("Wrapper Class Boolean Object Tyoe b1 : "+b1);
		System.out.println("Wrapper Class Boolean Object Tyoe b2 : "+b2);
		System.out.println("-----------------------------------------------------");
		
		//Character
		char ch = 'S';
		Character c1 = new Character(ch);
		Character c2 =ch;
		System.out.println("Wrapper Class Character Object Tyoe c1 : "+c1);
		System.out.println("Wrapper Class Character Object Tyoe c2 : "+c2);
		
		
		
		
	}
}
}
