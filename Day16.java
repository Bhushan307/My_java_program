//Question 1: Count Subarrays With Sum K
/*class Day16{
	public static void main(String[] args){
		int arr[] = {1, 2, 1, 2, 1};
		int k = 3;
		int count =0;
		for(int i=0;i<arr.length;i++){
			int sum = 0;
			for(int j=i;j<arr.length;j++){
				sum = sum + arr[j];
				if(sum == k){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}*/

/*import java.util.HashMap;

class Day16 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 1};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            int need = prefixSum - k;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println(count);
    }
}*/

//Q.2-Two Sum using HashMap
/*import java.util.HashMap;
class Day16{
	public static void main(String[] args){
		int arr[] = {2, 7, 11, 15};
		int target = 9;
		
		HashMap <Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			int need = target-arr[i];
			
			if(map.containsKey(need)){
				System.out.print(map.get(need)+" "+i);
				break;
			}
			map.put(arr[i], i);   
		}
		
	}
	
}
*/

//Day 1 — Question 3: Longest Substring Without Repeating Characters
/*import java.util.HashSet;
class Day16{
	public static void main(String[] args){
		String s = "abcabcbb";
		
		HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;
		
		for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }
		
	    System.out.println(max);

	}
} */

//Question 4: Longest Consecutive Sequence
import java.util.*;

/*class Day16{
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int max = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        System.out.println(max);
    }
}*/

//Question 5: Subarray Sum Equals K (Brute Force se Optimized)
/*class Day16{
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxSum = sum;

        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}*/


//Question 6: Best Time to Buy and Sell Stock
/*class Day16{
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }

        System.out.println(maxProfit);
    }
}*/

//Question 7: Maximum Subarray Sum (Kadane’s Algorithm)
/*class Day16{
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}*/
//Longest Substring Without Repeating Characters
/*class Day16{
	public static void main(String [] args){
		String s = "abcabcbb";
		
		HashSet<Character> set = new HashSet<>();
		
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		
		System.out.println(set.size());
	}
}*/

//Day 1 — Question 8: Majority Element
import java.util.HashMap;
class Day16{
	public static void main(String[] args){
		int arr[] = {2, 2, 1, 1, 1, 2, 2};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int num: arr){
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(int num:map.keySet()){
			if(map.get(num)>arr.length/2){
				System.out.println(num);
				break;
			}
		}
		
	}
}