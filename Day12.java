//Question 1/10: Missing Number
/*class Day12{
	public static void main (String[] args){
		int arr[] = {1, 2, 4, 5, 6};
		
		int n= arr.length+1;
		int t_n = n*(n+1)/2;
		int sum = 0 ;
		
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		int m_n = t_n - sum;
		System.out.println(m_n);
	}
}
*/
//Question 2/10: Count Frequency of Each Element
/*class Day12 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 4, 3, 2, 5};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyCounted = false;

            // Check whether this element appeared earlier
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            // Count frequency
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
} 


//Question 3/10 — Second Largest Element
class Day12{
	public static void main(String[] args){
		int arr[] = {12, 35, 1, 10, 34, 1};
		int max = arr[0];
		int sec_max= arr[1];
		
		for(int i =0;i<arr.length;i++){
			if(arr[i] > max){
				sec_max = max;
				max = arr[i];
			}
			if(arr[i]> sec_max && arr[i] != max){
				sec_max = arr[i];
			}
		}
		System.out.println("Second Largest Element is "+ sec_max);
	}
}*/
//Question 4/10: Move All Zeros to the End
/*class Day12{
	public static void main(String[] args){
		int arr[] = {0, 1, 0, 3, 12};
		int j = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
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

//Question 5 — Find the Leaders in an Array
class Day12{
	public static void main(String[] args){
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		int max  = arr[arr.length-1];
		
		System.out.println("Leader element is " + max);
		
		for(int i=arr.length-2;i>=0;i--){
			if(max < arr[i]){
				max = arr[i];
			System.out.println("Leader element is "+max);
			}
		}
		
		
	}
}

//Rearrange Positive and negative numbers
class Day12{
	public static void main(String[] args){
		int arr[] = {1, 2, -3, -4, 5, -6};
		
		int pos[] = new int[3];
		int neg[] = new int[3];
		
		int p=0;
		int n=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				pos[p]=arr[i];
				p++;
			}else{
				neg[n]=arr[i];
				n++;
			}
		}
		 int j = 0;
		 for(int i = 0; i < pos.length; i++){
			 arr[j]=pos[i];
			 j++;
			 
			 
			 arr[j]=neg[i];
			 j++;
		 }
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
	}
}
*/
//Question 7/10: Longest Consecutive Sequence
/*import java.util.HashSet;
class Day12{
	public static void main(String[] args){
		int arr[] = {100, 4, 200, 1, 3, 2};
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		int maxLength = 0;
		
		// Step 2: Check consecutive sequences
		for (int num : set){
            // Start counting only if previous number is absent
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                if (count > maxLength) {
                    maxLength = count;
                }
			
			}
		}
		System.out.println("Longest consecutive sequence length: " + maxLength);
	}
}


//Check Strings are anagram or not
import java.util.*;
class Day12{
	public static void main(String[] args){
		String s1 = "listen";
		String s2 = "silent";
		
		if (s1.length() != s2.length()) {
            System.out.println("Invalid Anagram");
            return;
        }
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s1.length();i++){
			char ch = s1.charAt(i);
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for (int i = 0; i < s2.length(); i++) {
			char ch = s2.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) - 1);
		}
		boolean isAnagram = true;
		
		for (int value : map.values()) {
            if (value != 0) {
                isAnagram = false;
                break;
            }
        }

		 if (isAnagram) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Invalid Anagram");
        }
	}
}
*/

//First Non Repeating Charactor
/*import java.util.*;
class Day12{
	public static void main(String [] args){
		String s = "aabbcdde";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			 map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                break;
            }
        }
		
	}
}
*/

//Longest Common Prefix
class Day12{
	public static void main(String [] args){
		String arr[] = {"flower", "flow", "flight"};
		String prefix = arr[0];
		
		for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
		System.out.println("Longest Common Prefix: " + prefix);
		
	}
}