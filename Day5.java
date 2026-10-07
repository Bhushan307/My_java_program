/*class Day5{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 5, 6};
		
		int n = arr.length+1;
		
		int tot_num = n*(n+1)/2;
		
		int missing_num  = 0;
		
		int sum = 0;
		
		
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		missing_num = tot_num - sum;
		System.out.println("missing number is "+missing_num);
	}
}*/

//INTERSECTION OF TWO ARRAYY;
/*class Day5{
	public static void main(String[] args){
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {3, 4, 5, 6, 7};
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i] == arr2[j]){
					System.out.print(arr2[j]+" ");
				}
			}
		}
	}
}*/


/*class Day5{
	public static void main(String[] args){
		int arr1[] = {1, 2, 2, 3, 4, 5};
		int arr2[] = {2, 2, 3, 5, 6};
		for(int i = 0; i < arr1.length; i++){
			boolean duplicate = false;
	
			for(int k = 0; k < i; k++){
				if(arr1[i] == arr1[k]){
				duplicate = true;
				break;
			}
		}
		if(duplicate){
			continue;
		}
		for(int j = 0; j < arr2.length; j++){
			if(arr1[i] == arr2[j]){
				System.out.print(arr1[i] + " ");
				break;
			}
		}
	}
	}
}*/


/*class Day5{
	public static void main(String[] args){
		int arr[] = {10, 20, 30, 40,60, 50};
		
		boolean isSorted = false;
		
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]<arr[i+1]){
				isSorted = true;
			}else{
				isSorted = false;
				break;
			}
		}
		if(isSorted){
			System.out.println("Array is Sorted");
		}else{
			System.out.println("Array is not Sorted");
		}
	}
}*/

/*class Day5{
	public static void main(String [] args){
		int arr[] = {2,3,1,2,3,1,2,3,2,3,2,2,2,2};
		int n = arr.length;
		for(int i=0;i<arr.length;i++){
			boolean allreadycheck = false;
			for(int j=0;j<i;j++){
				if(arr[i] == arr[j]){
					allreadycheck = true;
					break;
				}
			}
			if(allreadycheck){
				continue;
			}
			int count = 0;	
			for(int k=0;k<arr.length;k++){
				if(arr[i] == arr[k]){
					count++;
				}
			}
			if(count > n/2){
				System.out.println(arr[i]+" is a majority element");
			}
			
		}
	}
}*/

/*class Day5{
	public static void main(String [] args){
		int arr[] = {0, 5, 0, 2, 8, 0, 7};
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end){
			if(arr[start] == 0){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/

/*class Day5{
	public static void main(String [] args){
		 int arr[] = {0, 5, 0, 2, 8, 0, 7};
		 
		 int j=0;
		 
		 for(int i=0;i<arr.length;i++){
			 if(arr[i] != 0){
				 
				 int temp = arr[i];
				 arr[i] = arr[j];
				 arr[j] = temp;
				 
				 j++;
			 }
		 }
		 for(int i =0; i<arr.length;i++){
			 System.out.print(arr[i]+" ");
		 }
	}
}*/

//Find first repeating element
/*class Day5{
	public static void main(String[] args){
		int arr[] = {5, 3, 4, 3, 5, 6};
		
		boolean found = false;
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i] == arr[j]){
					System.out.println("First Repeating Element is "+ arr[i]);
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		}
	}
}*/


//Find first non repeating element
/*class Day5{
	public static void main(String[] args){
		int arr[] = {4, 5, 1, 2, 1, 4, 5};
		
		boolean found = false;
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
			for(int j=0;j<arr.length;j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.println("First non repeating element is "+arr[i]);
				break;
			}
		}
		
	}
}*/

//Find Duplicate Element
/*class Day5{
	public static void main(String [] args){
		int arr[] = {1, 3, 4, 2, 2};
		
		boolean duplicate = false;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					duplicate = true;
				}
			}
			if(duplicate){
				System.out.println("Duplicate Element is "+arr[i]);
				break;
			}
		}
	}
}*/

//Rotate Array by 1 Position
class Day5{
	public static void main(String [] args){
		int arr[] = {1, 2, 3, 4, 5};
		
		int last = arr[arr.length-1];
		
		for(int i = arr.length-1;i>0;i--){
			arr[i] = arr[i-1];
		}
		arr[0] = last;
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
	}
}