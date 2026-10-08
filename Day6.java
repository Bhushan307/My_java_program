//Q1: Left Rotate Array by 1
/*class Day6{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};
		
		int first = arr[0];
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=first;
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}*/


//Find the maximum difference between two elements, where the larger element must come after the smaller element.
/*class Day6{
	public static void main(String[] args){
		int arr[] = {7, 1, 5, 3, 6, 4};
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] - arr[i] > max){
					max = arr[j]-arr[i];
				}
				
			}
		}
		
		System.out.println(max);
	}
}*/


//— Count Frequency of Each Element
/*class Day6{
	public static void main(String[] args){
		int arr[] = {2, 3, 2, 4, 3, 2, 5};
		
		for(int i=0;i<arr.length;i++){
			boolean duplicate = false;
			int count  = 0 ;
			for(int j=0;j<i;j++){
				if(arr[i] == arr[j]){
					duplicate = true;
					break;
				}
			}
			if(duplicate){
				continue;
			}
			for(int k=0;k<arr.length;k++){
				if(arr[i]== arr[k]){
					count++;
				}
			}
			System.out.println(arr[i]+" = "+count);
		}
		
	}
}*/

//Find Second Largest Element
/*class Day6{
	public static void main(String[] args){
		int arr[] = {10, 5, 20, 8, 15};
		int max = 0 ;
		int sec_max = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] > max){
				sec_max = max;
				max = arr[i];
				
			}else if(arr[i] > sec_max && arr[i] != max){
				sec_max = arr[i];
			}
		}
		System.out.println("Largest Element Is  "+max);
		System.out.println("Second Largest Element Is  "+sec_max);
	}
}
*/

//Remove Duplicates from Sorted Array
/*class Day6{
	public static void main(String [] args){
		int arr[] = {1, 1, 2, 2, 3, 4, 4, 5};
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] != arr[i+1]){
				System.out.print(arr[i]+" ");
			}
		}
	System.out.print(arr[arr.length-1]);
	}
}*/


//Find Missing Number
/*class Day6{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 5, 6};
		int n = arr.length+1;
		int t_n = n*(n+1)/2;
		int sum = 0;
		
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
		}
		int m_n = t_n - sum;
		System.out.println("Missing number is "+ m_n);
	}
}*/


// Check Palindrome
/*class Day6{
	public static void main(String[] args){
		String str  = "madam";
		boolean ispalindrome = true;
		
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i) !=str.charAt(str.length()-1-i)){
				ispalindrome = false;
			}
		}
		if(ispalindrome){
			System.out.println("String is palindrome");
		}else{
			System.out.println("String is not palindrome");
		}
	}
}*/

//Find the middle element.
/*class Day6{
	public static void main(String [] args){
		int arr[] = {1,2,3,4,5,6,7};
		
		int mid = arr.length/2;
		
		System.out.println(arr[mid]);
	}
}*/


//Count positive and Negative 
/*class Day6{
	public static void main(String [] args){
		int arr[] = {2, -5, 7, -3, 8, -1, 4};
		int positive = 0;
		int negative = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] > 0){
				positive++;
			}else{
				negative++;
			}
		}
		System.out.println("Positive num is "+positive);
		System.out.println("Negative num is "+negative);
	}
}*/


class Day6{
	public static void main(String [] args){
		int arr[] = {10, 5, 8, 7, 12, 3, 6};
		int even = 0;
		int odd = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 == 0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Even num is "+even);
		System.out.println("Odd num is "+odd);
	}
}