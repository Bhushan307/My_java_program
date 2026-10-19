//Day 13 — Question 
//Product of Array Except Self
/*class Day13{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4};
		
		for(int i=0;i<arr.length;i++){
			int product = 1;
			for(int j=0;j<arr.length;j++){
				if(i == j){
					continue;	
				}
				product = product * arr[j];
			}
			System.out.print(product+" ");
		}
	}
}*/

//Question 2: Rotate Array by K Positions
/*import java.util.*;
class Day13{
	public static void main(String [] args){
		int arr[] = {1, 2, 3, 4, 5};	
		int k = 2;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=arr.length-k;i<arr.length;i++){
			list.add(arr[i]);
		}
		for(int i=0;i<arr.length-k;i++){
			list.add(arr[i]);
		}
		System.out.println(list);
		
	}
}*/

//Question 3: Find the Maximum Difference
/*class Day13{
	public static void main(String[] args){
		int arr[] = {2, 7, 1, 8, 3, 10};
		int max_diff = -1;
		for(int i=0;i<arr.length;i++){
			int diff = 0;
			for(int j=i+1;j<arr.length;j++){
				diff = arr[j]-arr[i];
				if(diff > max_diff){
					max_diff = diff;
				}
			}
		}
		System.out.println(max_diff);
	}
}*/

//Count substring sum with k
/*class Day13{
	public static void main(String[] args){
		int arr[] = {1, 2, 3};
		int k = 3;
		int count = 0;
		
		for(int i=0;i<arr.length;i++){
			int sum =0;
			for(int j=i;j<arr.length;j++){
				sum = sum+arr[j];
				if(sum == k){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
*/
//Question 5: Find the Duplicate Number
class Day13{
	public static void main(String [] args){
		int arr[] = {1, 3, 4, 2, 3};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					System.out.print("Duplicate element is "+arr[j]);
					break;
				}
			}
		}
	}
}