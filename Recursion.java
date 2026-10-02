/*public class Recursion{
	
	public static void printNumb(int n){
		if(n==0){
			return;
		}
		System.out.println(n);
		printNumb(n-1);
	}
	public static void main (String args[]){
		int n = 5;
		printNumb(n); //n=5
	}
}*/

/*public class Recursion{
	
	public static void printNumb(int n){
		if(n==6){
			return;
		}
		System.out.println(n);
		printNumb(n+1);
	}
	public static void main (String args[]){
		int n = 1;
		printNumb(n); //n=1
	}
}*/



//print sum of first n natual number
/*class Recursion{
	public static void printSum(int i,int n, int sum){
		if(i==n){
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		printSum(i+1,n,sum);
	}
	public static void main(String [] args){
		
		printSum(1,5,0);
	}
}*/
//Print Factorial Of a Number n-1

/*class Recursion{
	public static int calfactorial(int n){
		if(n==1 || n == 0){
			return 1;
		}	
		int fact_nm1 = calfactorial(n-1);
		int fact_n = n*fact_nm1;
		return fact_n;
		
	}
	public static void main(String [] args){
		int n = 5;
		int ans = calfactorial(n);
		System.out.println(ans);
	}
}*/
//print the fibonacci series till nth tern

/*class Recursion{
	public static void printFibo(int a, int b,int n){
		if(n==0){
			return;
		}
		int c = a+b;
		System.out.println(c);
		printFibo(b,c,n-1);
	}
	public static void main(String [] args){
		int a =0;
		int b =1;
		System.out.println(a);
		System.out.println(b);
		int n=7;
		printFibo(a,b,n-2);
	}
}*/

//Print x^n (Stack height = n)
/*class Recursion{
	public static int calcPower(int x,int n){
		
		if(n == 0){
			return 1;
		}if(x == 0){
			return 0;
		}
		
		int xPownm1 = calcPower(x , n-1);
		int xPown = x * xPownm1;
		return xPown;
		
		
	}
	public static void main(String [] args){
		int x = 2, n =5;
		int ans = calcPower(x,n);
		System.out.println(ans);
	}
}*/
//Print x^n (Stack height = logn)
/*class Recursion{
	public static int calcPower(int x,int n){
		
		if(n == 0){
			return 1;
		}if(x == 0){
			return 0;
		}
		
		//if n is even 
		if(n%2 == 0){
			return calcPower(x,n/2) * calcPower(x, n/2);
		}else{
			return calcPower(x,n/2)*calcPower(x, n/2)*x;
		}
		
	}
	public static void main(String [] args){
		int x = 2, n =5;
		int ans = calcPower(x,n);
		System.out.println(ans);
	}
}
*/

//TOWER OF HONOI
/*public class Recursion{
	public static void towerOfHanoi(int n,String src, String helper, String dest){
		if(n==1){
			System.out.println("transfer disk "+n+" from "+src+" to "+dest);
			return;
		}
		towerOfHanoi(n-1, src,dest,helper);
		System.out.println("transfer disk "+n+" from "+src+" to "+dest);
		towerOfHanoi(n-1,helper,src,dest);
	}
	
	
	public static void main(String args[]){
		int n =4;
		towerOfHanoi(n,"S","H","D");
	}
}
*/

//Print s string in reverse
/*class Recursion{
	public static void printRev(String str, int idx){
		if(idx == 0){
			System.out.println(str.charAt(idx));
			return;
		} 
		
		System.out.print(str.charAt(idx));
		printRev(str, idx-1);
	}
	
	
	public static void main(String args[]){
		String str  = "abcd";
		printRev(str,str.length()-1);
	}
}
*/

/*public class Recursion{
	public static int first = -1;
	public static int last = -1;
	
	public static void findOccurance(String str, int idx, char element){
		char currChar = str.charAt(idx);
		if(idx == str.length()-1){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		if(currChar == element){
			if(first == -1){
				first = idx;
			}else{
				last = idx;
			}
		}
		findOccurance(str,idx+1,element);
	}
	public static void main(String args[]){
		String str = "abaacdaefaah";
		findOccurance(str, 0, 'a');
	}
	
}
*/

/*public  class Recursion{
	
	public static boolean isSorted(int arr[], int idx){
		if(idx == arr.length-1){
			return true;
		}
		if(arr[idx]< arr[idx+1]){
			//array is sorted
			return isSorted(arr,idx+1);
		}else{
			return false;
		}
	}
	public static void main(String [] args){
		int arr[] = {1,2,3,4,5};
		System.out.println(isSorted(arr,0));
		
	}
}*/


/// Move All 'x' to the end of the string
/*class Recursion{
	
	public static void moveAllX(String str, int idx, int count, String newString){
		if(idx == str.length()){
			for(int i=0; i<count; i++){
				newString += 'x';
			}
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(currChar == 'x'){
			count++;
			moveAllX(str, idx+1,count,newString);
		}else{
			newString += currChar;
			moveAllX(str, idx+1, count, newString);
		}
	}
	public static void main(String [] args){
		String str = "axbcxxd";
		moveAllX(str,0,0,"");
	}
}*/


//REMOVE DUPLICATE 

/*public class Recursion{
	public static boolean [] map = new boolean[26];
	
	public static void removeDuplicate(String str, int idx, String newString){
		if(idx == str.length()){
			System.out.println(newString);
			return;
		}
		char currChar = str.charAt(idx);
		if(map[currChar - 'a']){
			removeDuplicate(str,idx+1,newString);
		}else{
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicate(str, idx+1, newString);
		}
	}
	public static void main(String [] args){
		String str ="abbccda";
		removeDuplicate(str , 0, "");
	}
}*/


//SUBSEQUENCES 
/*class Recursion{
	public static void subsequences(String str, int idx, String newString){
		if(idx == str.length()){
			System.err.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		
		//to be 
		subsequences(str, idx+1, newString+currChar);
		
		//or not to be
		subsequences(str, idx+1, newString);
	}
	public static void main(String args[]){
		String str = "abc";
		subsequences(str, 0, "");
	}
}*/


/*import java.util.*;
class Recursion{
	public static void subsequences(String str, int idx, String newString, HashSet<String>set){
		if(idx == str.length()){
			if(set.contains(newString)){
				return;
			}else{
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currChar = str.charAt(idx);
		
		//to be 
		subsequences(str, idx+1, newString+currChar,set);
		
		//or not to be 
		subsequences(str, idx+1, newString,set);
		
	}
	public static void main(String [] args){
		String str ="aaa";
		HashSet<String> set = new HashSet<>();
		subsequences(str,0,"",set);
	}
	
}
*/

/*import java.util.HashSet;
class Recursion2 {
	public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};
	
	public static void printKeypadCombination(String number, int idx, String res) {
		if(idx == number.length()) {
			System.out.println(res);
			return;
		}
		for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
			char curr = keypad[number.charAt(idx)-'0'].charAt(i);
			printKeypadCombination(number, idx+1, res+curr);
		}
	}
	public static void main(String args[]) {
		String number = "23";
		printKeypadCombination(number, 0, "");
		}

}
*/

//Print all permutation of a string
/*class Recursion{
	public static void printPerm(String str, String permutation){
		if(str.length() == 0){
			System.out.println(permutation);
			return;
		}
		for(int i=0;i<str.length();i++){
			char currChar = str.charAt(i);
			//"abc"-> "ab"
			String newStr = str.substring(0,i)+str.substring(i+1);
			printPerm(newStr,permutation+currChar);
		}
	}
	public static void main (String[] args){
		String str = "abc";
		printPerm(str,"");
	}
}
*/
/*class Recursion{
	public static int countPaths(int i ,int j, int n , int m){
		if(i == n || j == m){
			return 0;
		}
		if(i == n-1 && j == m-1){
			return 1;
		}
		//move downwards
		int downPaths = countPaths(i+1,j,n,m);
		
		//move right
		int rightPaths = countPaths(i,j+1,n,m);
		
		return downPaths + rightPaths;
	}
	public static void main (String[] args){
		int n=3, m=3;
		int totalPaths = countPaths(0, 0, n , m);
		System.out.println(totalPaths);
	}
}

*/

/*class Recursion {
	public static int placeTiles(int n , int m){
		if(n == m ){
			return 2;
		}
		if(n < m){
			return 1;
		}
		//vertically
		int vertPlacements = placeTiles(n-m ,m);
		
		//horizontally
		int horPlacements = placeTiles(n-1,m);
		
		return vertPlacements + horPlacements;
	}
	public static void main (String[] args){
		int n=4, m= 2;
		System.out.println(placeTiles(n,m));
	}
*/
/*
class Recursion {
	public static int callGuests(int n){
		if(n <= 1){
			return 1;
		}
		
		int ways1 = callGuests(n-1);
		
		int ways2 = (n-1)*callGuests(n-2);
		
		return ways1 + ways2;
	}
	public static void main (String[] args){
		int n=3;
		System.out.println(callGuests(n));
	}
}

*/
import java.util.ArrayList;
class Recursion {
	public static void printSubset(ArrayList<Integer>subset){
		for(int  i =-0;i<subset.size();i++){
			System.out.print(subset.get(i)+" ");
		}
		System.out.println();
	}
	
	public static void findSubset(int n, ArrayList<Integer>subset){
		if(n == 0){
			printSubset(subset);
			return;
		}
		//add hoga
		
		subset.add(n);
		findSubset(n-1, subset);
		
		//add nahi hoga
		subset.remove(subset.size()-1);
		findSubset(n-1, subset);
		
		
	}
	public static void main (String[] args){
	int n =3;
	ArrayList <Integer> subset = new ArrayList<>();
	findSubset(n, subset);
	}
}