//Second Largest Element
/*class Day11{
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


//Move Zero to end 
/*
class Day11{
	public static void main(String[] args){
		int arr[] = {0, 5, 0, 2, 0, 8, 7};
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
*/

//Two Sum using HashMap
/*import java.util.*;
class Day11{
	public static void main(String[] args){
		int arr[] = {2, 7, 11, 15};
        int target = 9;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			int need = target - arr[i];
			
			if(map.containsKey(need)){
				System.out.println(map.get(need) + " " + i);
				break;
			}
			map.put(arr[i], i);
		}
		
		
	}
}
*/

//Remove Duplicate from sorted array
/*class Day11{
	public static void main(String[] args){
		int arr[] = {1,1, 2, 2, 3, 4, 4, 5};
		
		int start = 0;
		int j = 0;
		
		while(j < arr.length){
			if(arr[start] != arr[j]){
				start++;
				arr[start] = arr[j];
			}
			j++;
		}
		for (int i = 0; i <= start; i++) {
            System.out.print(arr[i] + " ");
        }
		
	}
}
*/

//Find maxumum sum array of k size;
/*class Day11 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int cs = 0;

        for (int i = 0; i < k; i++) {
            cs += arr[i];
        }

        int ms = cs;

        for (int i = k; i < arr.length; i++) {
            cs = cs - arr[i - k] + arr[i];

            if (cs > ms) {
                ms = cs;
            }
        }

        System.out.println("Maximum Sum: " + ms);
    }
}
*/

//Best Time to Buy and Sell Stock 
/*class Day11{
	public static void main(String[] args){
		
		int arr[] = {7, 1, 5, 3, 6, 4};
		int buy = arr[0];
		int sell = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] < buy){
				buy = arr[i];
			}
		}
		System.out.println("Buy the stock in at price "+buy);
		for(int i=buy;i<arr.length;i++){
			if(arr[i]>sell){
				sell = arr[i];
			}
		}
		System.out.println("Sell the stock in at price "+sell);
		System.out.println("Maximum profit is "+ (sell - buy));
		
	}
}
*/
//Maximum Subarray Sum
/*class Day11{
	public static void main(String[] args){
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		
		for(int i=0;i<arr.length;i++){
			cs = cs +arr[i];
			if(cs < 0){
				cs =0;
			}
			
			ms = Math.max(cs,ms);
		}
		System.out.println("Maximum Subarray Sum "+ms);
		
	}
}

*/

//Majority Element
/*class Day11{
	public static void main(String[] args){
		int arr[] = {2, 2, 1, 1, 2, 2, 2};
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
			
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count > (arr.length-1)/2){
				System.out.print("Majority Element is "+arr[i]+" ");
				break;
			}
		}
		
	}
}
*/

//Merge two sorted array
/*import java.util.*;
class Day11{
	public static void main(String[] args){
		int a[] = {1, 3, 5, 7};
		int b[] = {2, 4, 6, 8};
		
		int arr[] = new int[ a.length + b.length];
		
		for(int i=0;i<a.length;i++){
			arr[i] = a[i];
		}
		for(int i=0;i<b.length;i++){
			arr[a.length+i] = b[i];
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
}


class Day11 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int b[] = {2, 4, 6, 8};

        int arr[] = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }

        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
*/
//Longest Substring Without Repeating Characters
import java.util.*;
class Day11{
	public static void main(String[] args){
		
		String s = "abcabcbb";
		
		HashSet<Character> set = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
		System.out.println("Unique characters: " + set);
        System.out.println("Unique count: " + set.size());
		
	}
}