//Day 15 — Question 1/5: Move All Negative Numbers to the Beginning
/*class Day15{
	public static void main(String [] args){
		int arr[] = {1, -2, 3, -4, 5, -6};
		
		int start  = 0;
		int end  = arr.length-1;
		
		while(start < end){
			if(arr[start] < 0){
				start++;
			}else if(arr[end] >= 0){
				end--;
			}else{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/

/*class Day15{
	public static void main(String[] args){
		int arr[] = {1, -2, 3, -4, 5, -6};
		int j = 0 ;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/


//Q2/5: Move All Zeros to the End
/*class Day15{
	public static void main(String[] args){
		int arr[] = {0, 1, 0, 3, 12};
		int j = 0 ;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] !=0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/

//Q3/5 — Find the Missing Number
/*class Day15{
	public static void main(String[] args){
		
		int arr[] = {1, 2, 3, 5, 6};
		
		int n = arr.length+1;
		int t_s = n*(n+1)/2;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		int m_n = t_s - sum;
		System.out.println("Missing Number is  "+ m_n);
	}
}

*/

//Q4/5 — Second Largest Element
/*class Day15{
	public static void main(String [] args){
		int arr[] = {12, 35, 1, 10, 34, 1};
		int max = -1;
		int sec_max = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				max = sec_max;
				max = arr[i];
			}
			if(arr[i] > sec_max && arr[i] != max){
				sec_max = arr[i];
			}
		}
		System.out.println("Max Element is "+max);
		System.out.println("Second Max Element is "+sec_max);
	}
}*/

//Q5/5 — Check Palindrome String
/*class Day15{
	public static void main(String[] args){
		String s = "madam";
		
		boolean isPalindrome  = true;
		
		int start = 0;
		int end  = s.length()-1;
		while(start < end){
			if(s.charAt(start) != s.charAt(end)){
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		if(isPalindrome){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
	}
}*/

//Q6/10: Count Vowels and Consonants
/*class Day15{
	public static void main(String [] args){
		String s = "programming";
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
				vowels++;
			}else{
				consonants++;
			}
		}
		System.out.println("The count of vowels is "+ vowels);
		System.out.println("The count of consonants is "+ consonants);
	}
}*/

//Day 15 — Q7/10: Reverse Each Word in a String
/*class Day15{
	public static void main(String [] args){
		String s = "Java is easy";
		//avaJ si ysae
		String arr[] = s.split(" ");
		
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i].length()-1;j>=0;j--){
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}*/

//Q8/10 — Count Frequency of a Character
/*class Day15{
	public static void main(String [] args){
		String s = "programming";
		char target = 'g';
		int count = 0;
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == 'g'){
				count++;
			}
		}
		System.out.print(count);
		
	}
}*/

//Q9/10 — Remove Spaces from a String
/*class Day15{
	public static void main(String[] args){
		String s = "Java is very easy";
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) == ' '){
				continue;
			}
			System.out.print(s.charAt(i));
		}
	}
}
*/

//  Q10 - check Anagram
import java.util.*;
class Day15{
	public static void main (String[] args){
		String s1 = "listen";
		String s2 = "silent";
		
		boolean	isAnagram = true;
		if(s1.length() != s2.length()){
			isAnagram = false;
		}else{
			char arr1[] = s1.toCharArray();
			char arr2[] = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			if(!Arrays.equals(arr1,arr2)){
				isAnagram = false;
			}
		
		}
		if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
	}
}
