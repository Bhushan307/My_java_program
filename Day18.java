//ARRAYS
//Q1.Kadane's Algorithm — Maximum Subarray Sum
/*class Day18{
	public static void main(String [] args){
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int target=6;
		
		int currentSum = arr[0];
		int maxSum = arr[0];
		
		for(int i=0;i<arr.length;i++){
	
			currentSum = Math.max(arr[i],currentSum+arr[i]);
			if(currentSum < 0){
				currentSum = 0;
			}
			
			maxSum = Math.max(maxSum,currentSum);
		}
		System.out.println("Maximum Subarray Sum: "+maxSum);
	}
}*/

//Q2.Rotate an Array by K Positions
/*import java.util.*;
class Day18{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7};
		int k=3;
		
		ArrayList<Integer>list = new ArrayList<>();
		
		for(int i=arr.length-k;i<arr.length;i++){
			list.add(arr[i]);
		}
		for(int i=0;i<arr.length-k;i++){
			list.add(arr[i]);
		}
		System.out.println(list);
	}
}*/

//Q3.Dutch National Flag — Sort 0s 1s 2s
/*class Day18{
	public static void main(String[] args){
		int arr[]={0,1,2,0,1,2};
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/

//Q4. Minimum Jumps to Reach End

/*class Day18 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};

        int jumps = 0;
        int currentReach = 0;
        int nextReach = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            nextReach = Math.max(nextReach, i + arr[i]);

            if (i == currentReach) {
                jumps++;
                currentReach = nextReach;
            }
        }

        System.out.println("Minimum jumps: " + jumps);
    }
}

dry run 
i    arr[i]   nextReach  jumps   currentReach
0      2         2         1        2
1      3         4         1        2
2      1         4         2        4
3      1         4         2        4
4      4         8         2        4
*/

//Q.5 Check if String is Palindrome
/*class Day18{
	public static void main(String[] args){
		String s ="racecar";
		
		boolean ispalindrome = false;
		
		for(int i=0;i<s.length();i++){
			for(int j=s.length()-1;j>=0;j--){
				if(s.charAt(i) == s.charAt(j)){
					ispalindrome = true;
				}
			}
		}
		if(ispalindrome){
			System.out.println("String is Palindrome");
		}else{
			System.out.println("String is not Palindrome");
		}
	}
}
*/
//Q6.Check Anagram
/*import java.util.*;
class Day18{
	public static void main(String[] args){
		String s1 = "silent";
		String s2 = "listen";
		
		boolean isAnagram = true;
		
		if(s1.length() != s2.length()){
			isAnagram = false;
		}else{
			char arr1[] = s1.toCharArray();
			char arr2[] = s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int i=0;i<arr1.length;i++){
				if(arr1[i] != arr2[i]){
					isAnagram = false;
					break;
				}
			}
			
			if(isAnagram){
				System.out.println("Strings are Anagram");
			}else{
				System.out.println("Strings are not Anagram");
			}
			
		}
	}
}*/

//Q7. Longest Palindromic Substring
/*class Day18{
	public static void main(String[] args){
		String s = "babad";
		String longest = "";
		
		
		for(int i=0;i<s.length();i++){
			for(int j=i;j<s.length();j++){
				
				String sub = s.substring(i,j+1);
				boolean ispalindrome = true;
				
				for(int k=0;k<sub.length()/2;k++){
					if(sub.charAt(k) != sub.charAt(sub.length()-1-k)){
						ispalindrome  = false;
						break;
					}
				}
				if(ispalindrome && sub.length() > longest.length()){
					longest = sub;
				}
			}
		}
		System.out.print(longest);
	}
}*/

//Q9. Longest Substring Without Repeating Characters
/*import java.util.*;
class Day18{
	public static void main(String[] args){
		String s = "abcabcbb";
		
		HashSet<Character> set = new HashSet<>();
		
		int left =0;
		int max = 0;
		
		for(int right=0;right<s.length();right++){
			
			while(set.contains(s.charAt(right))){
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			
			max = Math.max(max,right-left+1);
		}
		 System.out.println(max);
	}
}*/

//Q10.Bubble sort
class Day18{
	public static void main (String [] args){
		int arr[] = {10,70,40,30,20,50,80};
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}