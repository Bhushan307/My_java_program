//1.	Write a program to display all primitive data types in Java.
/*public class task{
	public static void main(String[] args){
		byte a = 63;
		short b=32000;
		int c=10000000;
		long d=1234567890;
		float e=3.14f;
		double f =3.1464767;
		char g='b';
		boolean h = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
}
*/
//2.	Write a program to add an integer and a float data type.
/*public class task{
	public static void main(String[] args){
		int a=10;
		float b=3.14f;
		
		float add=a+b;
		System.out.println(add);
	}
}*/

//3.	Write a program to demonstrate implicit type casting.
/*public class task {
    public static void main(String[] args) {
        int i = 10;
        float f = i;

        System.out.println(f);
    }
}*/


//4.	Write a program to demonstrate explicit type casting.
/*public class task{
	public static void main(String[] args){
		float f = 5.6f;
        int i = (int) f;
        System.out.println(i);
		
	}*/

//5.	Write a program to display ASCII value of a character.
/*public class task {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch;

        System.out.println(ch);
        System.out.println(ascii);
    }
}*/

//6.	Write a program to demonstrate boolean data type.
/*public class task{
	public static void main(String[] args){
		boolean nikhil = false;
		boolean singh  = true;
		
		System.out.println(nikhil);
		System.out.println(singh);
	}
}*/
//7.	Write a program to show overflow in byte data type.
/*public class task{
	public static void main(String [] args){
		byte b = 127;
		 ++b;
		System.out.println(b);
	}
}*/
//8.	Write a program to display default values of data types.
/*public class task{
	byte b;
	short s;
	int i;
	float f;
	double d;
	long l;
	char c;
	boolean bl;
	String str;
	public static void main (String[] args){
		task obj = new task();
		System.out.println("byte :  " +  obj.b);
		System.out.println("short : " +  obj.s);
		System.out.println("int : " +    obj.i);
		System.out.println("float : " +  obj.f);
		System.out.println("long :" +   obj.l);
		System.out.println("char : " +   obj.c);
		System.out.println("boolean : "+ obj.bl);
		System.out.println("String : " + obj.str);
		
		
	}
}*/
//9. Write a program to demonstrate char and int relationship.
/*public class task{
	public static void main(String[] args){
		char a = 'b';
		int c = a;
		System.out.println(c);
	}
}*/


//10. Write a program to differentiate primitive and non-primitive data types.
public class task{
	public static void main(String[] args){
		//Primitive
		byte a = 63;
		short b=32000;
		int c=10000000;
		long d=1234567890;
		float e=3.14f;
		double f =3.1464767;
		char g='b';
		boolean h = false;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	//Non-Primitive
	int arr[]={1,2,3,4,5,6,7,8,9,0};
	String str=("Hello Skillio");
	
	System.out.println(arr[4] +","+ str);
	
	
	}
}