/*class Day2{
	public static void main(String [] args){
		String str = "JYOTIYA";
		for(int i=0; i<str.length();i++){
			System.out.print(str.charAt(i));
		}
	}
}*/

/*class Day2{
	public static void main(String [] args){
		String str = "JYOTIYA";
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}
	}
}*/

/*class Day2{
	public static void main(String [] args){
		String str = "java";
		int start = 0;
		int end = str.length()-1;
		
		boolean palindrome = true;
		while(start <= end){
			if(str.charAt(start) != str.charAt(end)){
				palindrome = false;
				break;
			}
			start++;
			end--;
		}
		if(palindrome){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
		
	}
}*/

/*class Day2{
	public static void main (String [] args){
		String str ="banana";
		
		char target = 'a';
		int count = 0;
		
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) == target){
				count++;
			}
		}
		System.out.println("count is "+count);
		
	}
}*/

/*class Day2{
	public static void main (String [] args){
		String str ="programming";
		
		int count = 0;
		
		for(int i=0; i<str.length();i++){
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
				count++;
			}
		}
		System.out.println("count is "+count);
		
	}
}*/
import java.util.*;
/*class Day2{
	public static void main(String [] args){
		String str1 = "race";
		String str2 = "care";
		
		boolean anagram = true;
		
		if(str1.length() != str2.length()){
			anagram = false;
		}else{
			char arr1[] = str1.toCharArray(); 
			char arr2[] = str2.toCharArray(); 
		
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			
		
			if(!Arrays.equals(arr1,arr2)){
				anagram = false;
			}
		}
		
		if(anagram){
			System.out.println("Is a Anagram");
		}else{
			System.out.println("Is not a Anagram");
		}
	}
}

*/


/*
Wrong hainn complete karna baki hain 
class Day2{
	public static void main (String [] args){
		int arr[] = {0,5,0,2,0,8,7};
		
		int start =0;
		int end = arr.length-1;
		while(start <= end){
			if(arr[i] == 0){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start++;
				end++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}*/

/*class Day2{
	public static void main(String [] args){
		
		int arr[] = {0,5,0,2,0,8,7};
		int index = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
			arr[index] = arr[i];
			index++;
			}
		}
		for(int i=index;i<arr.length;i++){
			arr[i] = 0;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}*/


/*class Day2{
	public static void main(String [] args){
		int arr[] = {1,2,2,3,4,4,5};
		int index = 0;		
		for(int i=0;i<arr.length;i++){
			boolean duplicate = false;
			
			for(int j=0;j<i;j++){
				if(arr[i] == arr[j]){
					duplicate = true;
					break;
				}
			}
			if(!duplicate){
			arr[index] = arr[i];
			index++;
		}
		}
		for(int i=0;i<index;i++){
			System.out.println(arr[i]);
		}
	}
}*/
/*class Day2{
	public static void main (String [] args){
		String str = "aabbcde";
		
		for(int i=0;i<str.length();i++){
			int count = 0;

			for(int j = 0; j < str.length(); j++){

				if(str.charAt(i) == str.charAt(j)){
					count++;
				}
			}if(count == 1){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}*/

/*class Day2{
	public static void main(String[] args){
		int arr[] = {3, 5, 2, 8, 11};
		int target = 10;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == target){
					System.out.println(arr[i]+" "+arr[j]);
					break;
				}
				
			}
		}
	}
}

*/

class Day2{
	public static void main(String [] args){
		int arr[] = {2, -5, 7, -3, 8, -1, 4};
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			if(arr[start] < 0){
				start ++;
			}else if(arr[end] > 0){
				end--;
			}else{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;

				start++;
				end--;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}