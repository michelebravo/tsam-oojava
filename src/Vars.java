
public class Vars {
	
	public static void main(String[] args){
		System.out.println("Vars");
		
		// int
		
		int i1;
		int i2=15;
		
		i1=10;
		
		System.out.println("**int**");
		System.out.println("i1:");
		System.out.println(i1);
		System.out.println("i2:");
		System.out.println(i2);
		
		//boolean
		
		boolean b1=true;
		boolean b2=false;
		
		System.out.println("**boolean**");
		System.out.println("b1:");
		System.out.println(b1);
		System.out.println("b2:");
		System.out.println(b2);
		
		//double
		
		double d1=1; //convert int to double
		double d2=3.5;
		
		System.out.println("**double**");
		System.out.println("d1:");
		System.out.println(d1);
		System.out.println("d2:");
		System.out.println(d2);
		
		
		//char
		
		char c1='a';
		char c2='0';
		char c3=' ';
		//char c4='ab' //errore
		char c5=70; //70 � il carattere F in ASCII (Unicode 16)
		
		System.out.println("**char**");
		System.out.println("c1:");
		System.out.println(c1);
		System.out.println("c2:");
		System.out.println(c2);
		System.out.println("c3:");
		System.out.println(c3);
		System.out.println("c5:");
		System.out.println(c5);
		
		
		//byte
		
		byte byte1=0;
		byte byte2=127;
		//byte byte3=128 cannot convert int to byte (-128 - 127)
		
		System.out.println("**byte**");
		System.out.println("byte1:");
		System.out.println(byte1);
		System.out.println("byte2:");
		System.out.println(byte2);
		
		
		//short
		
		short s1=0;
		short s2=32767;
		//short short3=32768 cannot convert int to short (-32768 - 32767)
		
		System.out.println("**short**");
		System.out.println("s1:");
		System.out.println(s1);
		System.out.println("s2:");
		System.out.println(s2);
		
		
		//long
		
		long l1=21;
		long l2=3000000000L;
		
		System.out.println("**long**");
		System.out.println("l1:");
		System.out.println(l1);
		System.out.println("l2:");
		System.out.println(l2);
		
		//float
		
		float f1=23;
		float f2=2.3F;
		
		System.out.println("**float**");
		System.out.println("f1:");
		System.out.println(f1);
		System.out.println("f2:");
		System.out.println(f2);
		
		//String
		
		String str1="";
		String str2="Hello";
		String str3=null;
		String str4="5";
		//String str5='5';
		//String str6=5
		
		System.out.println("**String**");
		System.out.println("str1:");
		System.out.println(str1);
		System.out.println("str2:");
		System.out.println(str2);
		System.out.println("str3:");
		System.out.println(str3);
		System.out.println("str4:");
		System.out.println(str4);
		
	}

}
