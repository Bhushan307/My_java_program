//1.	Write a Java program to declare and initialize variables of all primitive data types and print their values.
/*public class tasknothree{
	public static void main (String[] args){
		
		byte a = 63;
		short b=32000;
		int c=10000000;
		long d=1234567890;
		float e=3.14f;
		double f =3.1464767;
		char g='b';
		boolean h = false;
		System.out.println(a +","+ b +" ,"+ c +","+ d +"," + e +","+ f +","+ g+","+ h);
	}
}*/

//2.	Write a Java program to add two integers using variables and display the result.
/*public class tasknothree{
	public static void main (String[] args){
		int a = 10;
		int b= 30;
		int c = a+b;
		System.out.println(c);
	}
}*/

//3.	Write a Java program to calculate the area of a rectangle using length and breadth variables.
/*public class tasknothree{
	public static void main(String[] args){
		
		double length =43.56;
		double breadth = 35.78;
		double aor= length * breadth;
		System.out.println("Area of Rectangle:-"+ aor);
	}
}*/


//4.	Write a Java program to swap two variables:
//o	a) Using a third variable
/*public class tasknothree{
	public static void main(String[] args){
		int a = 10;
		int b =20; 
		int c = a;
		 a = b;
		 c = b;
		System.out.println( " Value of  a is :-"+ a +" value of b is:-"+ b);	
	}
}*/

//o	b) Without using a third variable
/*public class tasknothree{
	public static void main(String[] args){
		
		int a=10;
		int b=20;
		a= a+b;
		b= a-b;
		a=a-b;		
		System.out.println(" Value of  a is :-"+ a +" value of b is:-"+ b);
	}
}*/


//5.	Write a Java program to calculate simple interest using variables.
/*public class tasknothree{
	public static void main(String[] args){
 		double P =  45000.00;
		double R =  11.50;
		double T =  2.5;
		double SI = (P*R*T) / 100 ;
		System.out.println("Simple Interest :- "+SI);
	}
}*/


//6.	Write a Java program to find the average of three numbers using variables.
/*public class tasknothree{
	public static void main(String[] args){
		float a=17;
		float b= 37;
		float c =71;
		float d = (a+b+c)/3;
		System.out.println(" Average of a three number is : "+d);
	}
}*/


//7.	Write a Java program to convert temperature from Celsius to Fahrenheit using variables.
/*public class tasknothree{
	public static void main(String[] args){
		float C=35;
		float F =  (C * 9/5)+32;
		System.out.println("Temperature in Fahrenheit is : "+F);
	}
}*/
//8.	Write a Java program to find the square and cube of a number using variables.
/*public class tasknothree{
	public static void main(String[] args){
		int a=5;
		int s = a*a;
		int c = a*a*a;
		System.out.println("The sqaure is :"+s +","+"The cube is :"+c);
	}
}*/
//9.	Write a Java program to calculate the perimeter of a circle using radius as a variable.
/*public class tasknothree{
	public static void main(String[] args){
		double radius=5;
		double phi =3.14;
		double poc = 2*phi*radius;
		System.out.println("Perimeter of Circle :"+poc);
	}
}*/
//10.	Write a Java program to store student details (roll number, name, marks) using variables and display them.
/*public class tasknothree{
	public static void main(String[] args){
		int rollno = 22111011;
		String name = "Bhuhan Chaudhari";
		int marks= 90;
		
		System.out.println("Roll N0 : "+rollno);
		System.out.println("Student Name : "+name);
		System.out.println("Marks : "+marks);
	}
}*/


//11.	Write a Java program to check whether a number is positive, negative, or zero using variables.
/*public class tasknothree{
	public static void main(String[] args){
		int  a = 0;
		if(a > 0){
			System.out.println("Number is Positive");
		}else if(a<0){
			System.out.println("Number is Negative");
		}else{
			System.out.println("Number is Zero");
		}
	}
}*/


//12.	Write a Java program to calculate the total and percentage of 5 subjects using variables.
/*public class tasknothree{
	public static void main(String[] args){
		int M=87, H= 86, E = 85 ,Math =100 ,S= 86;
		int T= M+H+E+Math+S;
		float P= T/5;
		
		System.out.println("Total Marks in 5 subject is : "+T);
		System.out.println("Percentage in 5 subject is : "+P);
		
		
	
		
	}
}*/


//13.	Write a Java program to demonstrate local, instance, and static variables.
/*public class tasknothree {

    int instanceVar = 10;

    static int staticVar = 20;

    public void show() {
        int localVar = 30;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        tasknothree obj = new tasknothree();
        obj.show();
    }
}*/


//14.	Write a Java program to convert days into years, weeks, and days using variables.
/*public class tasknothree{
	public static void main(String[] args){
		int days=1040;
		int year = days/365;
		int remaingdays = days%365;
		int week =remaingdays/7;
		int finaldays = remaingdays%7;
		
		System.out.println("Years :- "+year);
		System.out.println("Weeks :- "+week);
		System.out.println("Days :- "+finaldays);
		
	}
}*/
//15.	Write a Java program to calculate gross salary using basic salary and allowance variables
public class tasknothree{
	public static void main(String[] args){
		double basicSalary = 50000;
        double allowance = 10000;
        double grossSalary = basicSalary + allowance;
 
        System.out.println("Gross Salary :- " + grossSalary);
	}
}
