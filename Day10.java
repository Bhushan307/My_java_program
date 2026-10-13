//6.FInd first occurence with using binary search

/*class Day10{
	public static void main(String [] args){
		int arr[]= {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		
		int start = 0;
		int end = arr.length-1;
		int ans = -1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] == target){
				ans = mid;
				end = mid-1;
			}else if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println(ans);
	}
}*/

//7.Find last occurence with using binary search
/*class Day10{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		
		int start = 0;
		int end = arr.length-1;
		int ans = -1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] == target){
				ans = mid;
				start = mid+1;
			}else if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println(ans);
	}
}*/

//8.Count Target Occurrences
/*class Day10{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		int start = 0;
		int end = arr.length-1;
		int first = 0;
		int last = 0 ;
		//find first occurence
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid]==target){
				first = mid;
				end = mid-1;
			}else if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println("first occurence "+ first);
		//last occurence
		start = 0;
		end = arr.length - 1;
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid]==target){
				last = mid;
				start = mid+1;
			}else if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println("last occurence "+ last);
		
		int count  = last- first+1;
		System.out.println("count is "+count);
	}
}*/

//Find missing number using vinary search
/*class Day10{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 5, 6};
		
		int n = arr.length+1;
		
		int t_s = n*(n+1)/2;
		int sum = 0;
		
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		int m_n = t_s - sum ;
		System.out.println(m_n);
	}
}*/

//Search in Rotated Sorted Array
/*class Day10{
	public static void main(String[] args){
		int arr[] = {4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		int start  = 0;
		int end = arr.length-1;
		int ans = -1;
		while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            // Left half sorted hai
            if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // Right half sorted hai
            else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println(ans);
	}
}*/

//Two Sum in a Sorted Array
/*class Day10{
	public static void main(String[] args){
		int arr[] = {1, 2, 4, 6, 8, 9};
		int target = 10;
		
		
		for(int i = 1;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == target){
					System.out.println("Two sum of element is "+ arr[i]+" "+arr[j]);
				}
			}
		}
	}
}*/

//Two Sum in a Sorted Array binary search
/*class Day10{
	public static void main(String[] args){
		int arr[] = {1, 2, 4, 6, 8, 9};
		int target = 10;
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			int sum = arr[start]+arr[end];
			
			if(sum == target){
				System.out.println("Indices of two sum "+start+"  "+end);
				break;
			}else if(sum < target){
				start++;
			}else{
				end--;
			}
		}
	}
}*/

//Remove Duplicates from Sorted Array Binary search
/*class Day10{
	public static void main(String [] args){
		int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
		
		int start  = 0;
		int j = 1;
		
		while(j < arr.length){
			if(arr[start] != arr[j]){
				start++;
				arr[start] = arr[j];
			}
			j++;
		}
		for(int i = 0;i<= start;i++){
			System.out.println(arr[i]+" ");
		}
	}
}*/

//Move All Zeros to the End
/*public class Day10{
	public static void main(String [] args){
		int arr[] = {0, 5, 0, 2, 0, 8, 7};
		
		int start = 0;
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i] != 0){
				int temp = arr[start];
				arr[start] = arr[i];
				arr[i] = temp;
				
				start++;
			}
		}
		
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}*/

/*class Day10{
	public static void main(String [] args){
		
		int arr[] = {0, 5, 0, 2, 0, 8, 7};
		
		int start = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] != 0) {
                int temp = arr[start];
                arr[start] = arr[j];
                arr[j] = temp;

                start++;
            }
            j++;
        }
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}*/

//Q4. Separate Positive and Negative Numbers
/*class Day10{
	public static void main(String[] args){
		int arr[] = {2, -5, 7, -3, 8, -1, 4};
		
		int start = 0;
		int j = 0;
		
		while (j < arr.length) {
            if (arr[j] < 0) {
                int temp = arr[start];
                arr[start] = arr[j];
                arr[j] = temp;

                start++;
            }
            j++;
        }
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
		
		
	}
}*/

//Maximum Sum Subarray of Size K
/*class Day10{
	public static void main(String [] args){
		int arr[] = {2, 1, 5, 1, 3, 2};
		int t = 3;
		int sum = 0;
		
		for(int i=0;i<t;i++){
			sum =sum+arr[i];
		}
		int maxSum = sum;
		
		for (int i = t; i < arr.length; i++){
			sum = sum - arr[i - t] + arr[i];
			
			 if (sum > maxSum) {
			 maxSum = sum;
			}
		}
		System.out.println(maxSum);
	}
}*/

//Q6. First Negative Number in Every Window of Size K

/*
class Day10{
	public static void main(String[] args){
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		
		for(int i=0;i<arr.length-k;i++){
			boolean found  = false;
			
			for(int j=0;j<k;j++){
				if(arr[i+j]<0){
					System.out.print(arr[i+j]+" ");
					found = true;
					break;
				}
			}
			if(!found){
				System.out.println("0 ");
			}
		}
	}
}
*/

//Question 7: Best Time to Buy and Sell Stock
/*class Day10{
	public static void main(String [] args){
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
}*/

/*class Day10{
	public static void main(String[] args){
	int arr[] = {7, 1, 5, 3, 6, 4};
	int minPrice = arr[0];
	int maxProfit = 0;

	for (int i = 1; i < arr.length; i++) {
		if (arr[i] < minPrice) {
			minPrice = arr[i];
		} else if (arr[i] - minPrice > maxProfit) {
			maxProfit = arr[i] - minPrice;
		}
	}
	System.out.println(maxProfit);
	}
}*/

//Maximum Subarray Sum (Kadane’s Algorithm)
/*class Day10{
	public static void main(String[] args){
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		
		int ms = Integer.MIN_VALUE;
		int cs = 0;
		
		for(int i=0;i<arr.length;i++){
			cs = cs+arr[i];
			if(cs < 0){
				cs= 0;
			}
			ms = Math.max(cs,ms);
		}
		System.out.println("Maximum Subarray Sum "+ms);
	}
}*/

//if all number are zero then 
/*class Day10 {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int cs = arr[0];
        int ms = arr[0];

        for (int i = 1; i < arr.length; i++) {
            cs = Math.max(arr[i], cs + arr[i]);
            ms = Math.max(cs, ms);
        }

        System.out.println("Maximum Subarray Sum " + ms);
    }
}*/
//majority element
/*class Day10 {
    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 2, 2, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > arr.length / 2) {
                System.out.println("Majority Element: " + arr[i]);
                break;
            }
        }
    }
}*/

import java.util.*;
//Merge two sorted array
class Day10{
	public static void main(String [] args){
		int arr1[] = {1, 3, 5, 7};
		int arr2[] = {2, 4, 6, 8};
		
		int arr3[] = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length + i]= arr2[i];
		}
		
		
		Arrays.sort(arr3);
		
		System.out.print(Arrays.toString(arr3));
		
	}
}