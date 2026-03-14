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

/* Comapare a string 