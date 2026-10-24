//Question 1: Two Sum in a Sorted Array
//using two pointer method
/*class Day17{
	public static void main(String[] args){
		int arr[] = {1, 2, 4, 6, 8, 9};
		int target = 10;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == target){
					System.out.println(i+" "+j);
					break;	
				}
			}
		}
	}
}*/

/*class Day17{
	public static void main(String[] args){
		int arr[] = {1, 2, 4, 6, 8, 7};
		int target = 10;
		
		int start = 0 ;
		int end = arr.length-1;
		
		while(start < end){
			int sum  =  arr[start]+arr[end];
			if(sum == target){
				System.out.print(start+" "+end);
				break;
			}else if(sum < target){
				start++;
			}else{
				end--;
			}
			
		}
	}
}*/

//Question 2: Minimum Size Subarray Sum
/*class Day17{
	public static void main(String[] args){
		int arr[] = {2, 3, 1, 2, 4, 3};
		int target = 7;
		int start = 0;
		int sum = 0;
		int minLength = Integer.MAX_VALUE;
		
		for(int end=0;end<arr.length;end++){
			sum  = sum +arr[end];
			
			while(sum >= target){
				int length = end - start +1;
				minLength = Math.min(minLength, length);
				
				sum = sum - arr[start];
				start++;
			}
		}
		if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
	}
}*/

//Question 3: First Negative Number in Every Window of Size K
/*class Day17{
	public static void main(String[] args){
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;
		
		for (int i = 0; i <= arr.length - k; i++) {
            int found = 0;

            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    System.out.print(arr[j] + " ");
                    found = 1;
                    break;
                }
            }

            if (found == 0) {
                System.out.print("0 ");
            }
        }
		
	}
}*/

//Question 4: Longest Subarray With Sum K
/*class Day17{
	public static void main(String[] args){
		int arr[] = {1, 2, 1, 1, 1, 3, 2};
		int k = 5;
		int sum = 0;
		int maxLength = 0;
		int start = 0;
		
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
			
			while(sum > k){  
				sum = sum - arr[start];
				start++;
			}
			if(sum == k){
				int length = i- start+1;
				maxLength = Math.max(maxLength,length);
			}
		}
		System.out.println(maxLength);
	}
}*/

//Question 5: Sort Array of 0s, 1s and 2s
/*class Day17{
	public static void main(String[] args){
		int arr[] = {2, 0, 1, 2, 1, 0};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
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
//Question 6: Container With Most Water.
/*class Day17{
	public static void main(String [] args){
		int arr[] = {1,8,6,2,5,4,8,3,7};
		int left = 0 ;
		int right = arr.length-1;
		int maxWater = 0;
		
		while(left < right){
			int height = Math.min(arr[left],arr[right]);
			int width = right - left;
			int water = height * width;
			
			maxWater = Math.max(maxWater,water);
			
			if(arr[left] < arr[right]){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(maxWater);
	}
}*/

//Question 7: Trapping Rain Water.
/*class Day17{
	public static void main(String[] args){
		int arr[] = {4, 2, 0, 3, 2, 5};
		
		int left= 0;
		int right =arr.length-1;
		
		int leftMax = 0;
		int rightMax = 0;
		int water = 0;
		
		while(left < right){
			if(arr[left]<arr[right]){
				if(arr[left] >= leftMax){
					leftMax = arr[left];
				}else{
					water = water + leftMax-arr[left];
				}
				left++;
			}else{
				if(arr[right] >= rightMax){
					rightMax = arr[right];
				}else{
					water = water + rightMax-arr[right];
				}
				right--;
			}
		}
		System.out.println(water);
	}
}*/

//Question 8: Remove Duplicates from a Sorted Array
/*class Day17{
	public static void main(String[] args){
		int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
		
		int j = 0;
		for(int i=1;i<arr.length;i++){
			if(arr[i] != arr[j]){
				j++;
				arr[j] = arr[i];
			}
		}
		
		System.out.println("Unique elements: " + (j + 1));
		
		for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
	}
}*/

//Question 9: Move Zeroes
/*class Day17{
	public static void main (String[] args){
		int arr[] = {0, 1, 0, 3, 12};
		
		int j =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/

//Question 10: Pair With Given Difference.
class Day17{
	public static void main(String[] args){
		int arr[] = {1, 2, 4, 6, 8, 10};
		int target = 4;
		int found = 0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]-arr[i] == target){
					System.out.println(arr[i]+" "+arr[j]);
					found = 1;
					break;
				}
			}
			if(found == 1){
				break;
			}
		}
	}
}