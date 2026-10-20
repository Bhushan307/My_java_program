//Day 14 — Question 1/5: Sort 0s, 1s and 2s
/*class Day14{
	public static void main(String [] args){
		int arr[] = {2, 0, 1, 2, 1, 0};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}
}
*/

//Question 2: Find the Equilibrium Index
/*class Day14{
	public static void main(String[] args){
		int arr[] = {1, 3, 5, 2, 2};
		
		for(int i=0;i<arr.length;i++){
			int left_sum = 0;
			int right_sum = 0;
			
			for(int j=0;j<i;j++){
				left_sum = left_sum + arr[j];
			}
			for(int j=i+1;j<arr.length;j++){
				right_sum = right_sum + arr[j];
			}
			if(left_sum == right_sum){
				System.out.print(i);
			}
		}
	}
}*/


//Question 3: Find the Leaders in an Array
/*public class Day14{
	public static void main(String [] args){
		int arr[] = {16, 17, 4, 3, 5, 2};
		int max  = arr[arr.length-1];
		System.out.print(max+" ");
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i] > max){
				max = arr[i];
				System.out.print(max+" ");
			}
		}
	}
}*/


//Question 4: Find the Longest Increasing Subarray
/*class Day14{
	public static void main (String[] args){
		int arr[] = {1, 2, 3, 2, 4, 5, 6, 1};
		
		int currentLength = 1;
		int maxLength = 1 ;
		
		for(int i=1;i<arr.length;i++){
			if(arr[i] > arr[i-1]){
				currentLength++;
			}else{
				currentLength = 1;
			}
			
			if(currentLength > maxLength){
				maxLength = currentLength;
			}
		}
		System.out.println("Longest increasing subarray length: " + maxLength);
	}
}*/

//Question 5: Find the Pair with Given Sum
class Day14{
	public static void main(String[] args){
		int arr[] = {2, 7, 11, 15, 3, 6};
		int target = 9;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == target){
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}
}