//Binary Search

/*class Day9{
	public static void main(String[] args){
		int arr[] = {2, 5, 8, 12, 16, 20, 25};
		int target = 16;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			int mid  = (start + end)/2;
			if(arr[mid] == target){
				System.out.println(mid);
				break;
			}else if(arr[mid]<target){
				start  = mid+1 ;
			}else{
				end = mid-1;
			}
		}
	}
}*/

//Find the first and last occurrence

/*class Day9{
	public static void main(String [] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == target){
				System.out.println("First Occurence "+i+" ");
				break;
			}
		}
		for(int i =arr.length-1;i>=0;i--){
			if(arr[i] == target){
				System.out.println("Last Occurence "+i+" ");
				break;
			}
		}
	}
}*/


//Count occurrences of a target
/*class Day9{
	public static void main(String [] args){
		int arr[] = {1, 2, 5, 5, 5, 7, 9};
		int target = 5;
		int count=0;
		
		for(int i =0;i<arr.length;i++){
			if(arr[i]== target){
				count++;
			}
		}
		System.out.println(count);
	}
}
*/
//Find the missing number
/*class Day9{
	public static void main(String [] args){
		int arr[] = {1, 2, 4, 5, 6};
		
		int n = arr.length+1;
		int t_n = n*(n+1)/2;
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum += arr[i];
			
		}
		int m_n = t_n-sum;
		System.out.println("Missing Number is "+m_n);
		
		
	}
}*/

//Search in a rotated sorted array
/*class Day9{
	public static void main(String[] args){
		int arr[] = {4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] == target){
				System.out.println(i);
			}
		}
	}
}*/


//Binary Search se First Occurrence
/*class Day9{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		
		int start=0;
		int end = arr.length-1;
		int ans = -1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] == target){
				ans = mid;
				end = mid-1;					
			}else if(arr[mid] > target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println(ans);
	}
}*/
//Last Occurrence using Binary Search

/*class Day9{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;
		int start = 0;
		int end = arr.length-1;
		int ans=-1;
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] == target){
				ans = mid;
				start = mid+1;					
			}else if(arr[mid] < target){
				start = mid+1;
			}else{
				end = mid-1;
			}
		}
		System.out.println(ans);
		
	}
}*/

/*
class Day9{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 4, 5};
		int target = 4;
		int start =0;
		int end = arr.length-1;
		int first = -1;
		int last = 0;
		
		// First occurrence
    while (start <= end) {
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            first = mid;
            end = mid - 1;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    // Reset start and end for the second search
    start = 0;
    end = arr.length - 1;

    // Last occurrence
    while (start <= end) {
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            last = mid;
            start = mid + 1;
        } else if (arr[mid] < target) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
	 System.out.println("First Occurrence " + first);
    System.out.println("Last Occurrence " + last);
		
	}
}*/

//Count occurrences using Binary Search

class Day9{
	public static void main(String[] args){
		int arr[] = {1, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6};
		int target = 4;
		
		int start = 0;
		int end = arr.length-1;
		int count = 0;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid]== target){
				count=end - start + 1;
			}else if(arr[mid]>target){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		System.out.println("Count is "+count);
	}
}