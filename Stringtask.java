import java.util.*;

/*
1.Print a String 

public class Stringtask{
	public static void main (String [] args){
		String name = "Tony Stark";
		
		for(int i =0; i<=name.length()-1; i++){
			System.out.print(name.charAt(i));
		}
		System.out.println();
		
	}
}
*/

/*
2.Print a Reverse String 

public class Stringtask{
	public static void main (String [] args){
		String name = "Tony Stark";
		
		for(int i =name.length()-1; i>=0; i--){
			System.out.print(name.charAt(i));
		}
		System.out.println();	
	}
}
*/

/* Check a String is Palindrome or not 
public class Stringtask{
	
	public static boolean isPalindrome(String str){
		int n =str.length();
		for(int i=0;i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(n-1-i)){
				//not a palindrome
				return false;
			}
		}	
		return true;
	}
	public static void main (String [] args){
		 String str="noon";
		 System.out.println(isPalindrome(str));
	}
}
*/

/* Comapare a string 6

public class Stringtask{
	public static void main(String[] args){
		String s1 = "Tony";
		String s2 = "Tony";
		
		String s3 = new String("Tony");
		
		if(s1 == s2){
			System.out.println("STring are equal");
		}else{
			System.out.println("String are not equal");
		}
		
		if(s1 == s3){
			System.out.println("String are equal");
		}else{
			System.out.println("String are not equal");
		}
		if(s1.equals(s3)){
			System.out.println("String are equal");
		}else{
			System.out.println("String are not equal");
		}
	}
}*/

/* SUBSTRING

public class Stringtask{
	
	
	public static String substring(String str, int si , int ei){
		String substr= "";
		for(int i = si; i<ei; i++){
			substr += str.charAt(i);
		}
		return substr;
	}
	public static void main(String [] args){
		String str = "Hello World";
		System.out.println(str.substring(0,5));// present in java
		System.out.println(substring(str,0,5));
		
	}
}
*/

/* For a given set of string , print the largest string 
   lexicographically
class Stringtask{
	public static void main(String[] args){
		String fruits [] = {"apple","mango","banana"};
		String largest = fruits[0]; 
		for(int i=1; i<fruits.length; i++){
			if(largest.compareTo(fruits[i]) < 0){
				largest = fruits[i];
			}
			
		}
		System.out.println(largest);
	}
}
*/

/* Count vowels form each word in a string ;


public class Stringtask{
	public static void main(String[] args){
		String str= "I love Cricket";
		int  count=0;
		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
		}
		System.out.println("vowels " + count + " present");
	}
}

public class Stringtask{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :-");
		String str = sc.nextLine();
		int  count=0;
		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
               ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
		}
		System.out.println("vowels " + count + " present");
	}
}
*/

/* Reverse a string withount changing posintion 
 

class Stringtask{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String rev = sc.nextLine();
		
		for(int i=rev.length()-1; i>=0; i--){
			System.out.print(rev.charAt(i));
		}
	}
}
*/

/* find and print digit from given string 
class Stringtask{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9'){
				 System.out.print(ch);
			 }
		}
		System.out.println();
	}
}
*/
/*
find and print speacial charactor

class Stringtask{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		for(int i=0;i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(!(ch >='0' && ch <='9' ||
			     ch >='a' && ch <='z' ||
			     ch >='A' && ch <='Z')){
				 System.out.print(ch);
			 }
		}
		System.out.println();
	}
}
*/


/*find and print duplicate charactor from 

*/

class Stringtask{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		int count = 1;
		
		for(int i=0;i<str.length(); i++){
			for(int j=i+1;j<str.length();j++){

				if(str.charAt(i) == str.charAt(j)){
					System.out.print(str.charAt(i));
				}
			}
		}
		System.out.println();
	}
}






