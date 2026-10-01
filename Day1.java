/*import java.util.*;
class Day1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		int sum =0;
		
		for(int i=0;i<arr.length;i++){
			sum =  sum + arr[i];	
		}
		System.out.println(sum);
	}
}*/
/*import java.util.*;
class  Day1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0 ; i<size;i++){
			arr[i] = sc.nextInt();
		}
		int even  = 0;
		for(int i= 0 ; i<arr.length; i++){
			if(arr[i] % 2 == 0){
				even++;
			}
		}
		System.out.println("Even number is "+even);
	}
}*/

/*import java.util.*;
class Day1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int arr[] = new int [size];
			
			for(int i=0;i<size;i++){
				arr[i] = sc.nextInt();
			}
			int max= arr[0];
			int sec_max = arr[0];
			
			for(int i=0; i<arr.length;i++){
				if(arr[i]> max){
					sec_max = max;
					max = arr[i];
				}
				if(arr[i] > sec_max && arr[i] != max){
					sec_max = arr[i];
				}
			}
			System.out.println("Maximum number "+max);
			System.out.println("Second maximum  number "+sec_max);	
	}
}*/

/*import java.util.*;
class Day1{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 int arr[] = new int[size];
		 
		 for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		 }
		 
		 int target = 2;
		 int count = 0;
		 for(int i=0;i<arr.length;i++){
			if(arr[i] == target){
				count++;
			}
		 }
		 System.out.println("frequency is "+count);	 
	}
}
*/
/*import java.util.*;
class Day1{
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] =  new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		int arr[] = {2,5,9,3,9,4,7,5};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
				System.out.println(arr[i]);
				}
			}
		}
	}
}*/
/*

class Day1{
	public static void main(String[] args){
		int arr[] = {1,2,3,4,5,7,8};
		int n=8;
		int expected = n*(n+1)/2;
		int actual = 0;
		
		for(int i=0;i<arr.length;i++){
			actual += arr[i];
		}
			int missing = expected - actual;
			System.out.println(missing);
	}
}*/

/*class Day1{
	public static void main(String []args){
	int arr[] = {1,2,3,4,5,6,7,8,9};
	int start = 0;
	int end =arr.length-1;
	
	while(start < end){
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		
		start++;
		end--;
	}
	for(int i=0; i<arr.length;i++){
		System.out.print(arr[i]+",");
	}
	
	}
}*/

/*class Day1{
	public static void main(String[] args){
		int arr[] =  {10,20,30,40,50,60};
		int target = 40;
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]==target){
				System.out.println("Number is found on the "+ i);
			}

		}
	}
}*/


/*
class Day1{
	public static void main(String[] args){
		int arr[] = {10,20,30,40,50,60,70,};
		int target = 60;
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			
			int mid = (start + end )/ 2;
			
			if(arr[mid] ==  target){
				System.out.println("Element is found on "+ mid);
				break;
			}else if(arr[mid]<target){
				start = mid +1;
			}else{
				end = mid-1;
			}
		}
	}
}*/


/*class Day1{
	public static void main(String [] args){
		int arr[] = {5,3,8,1,2};
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
	}
}*/

/*import java.util.*;
class Day1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int arr[] = new int [size];
			
			for(int i=0;i<size;i++){
				arr[i] = sc.nextInt();
			}
			int min= arr[0];
			int sec_min = arr[0];
			
			for(int i=0; i<arr.length;i++){
				if(arr[i]< min){
					sec_min = min;
					min = arr[i];
				}else if(arr[i] < sec_min && arr[i] != min){
					sec_min = arr[i];
				}
			}
			System.out.println("Minimum number "+min);
			System.out.println("Second minimum  number "+sec_min);	
	}
}*/

