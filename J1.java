//1.Check whether a number is positive or negative.
import java.util.*;
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a Number");
		int a = sc.nextInt();
		if(a == 0){
			System.out.println("Number is ZERO");
		}else if(a <= 0){
			System.out.println("Number is NEGATIVE");
		}else{
			System.out.println("Number is POSITIVE");
		}
		
	}
}*/

//2.Check whether a number is even or odd.

/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a Number");
		int a = sc.nextInt();
		if(a % 2 == 0){
			System.out.println("Number is EVEN");
		}else{
			System.out.println("Number is ODD");
		}
	}
}
*/

//3.Check whether three numbers are equal.
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a  1St Number");
		int a = sc.nextInt();
		System.out.println("Entre a  2nd Number");
		int b = sc.nextInt();
		System.out.println("Entre a  3rd Number");
		int c = sc.nextInt();
		if(a == b && b == c){
			System.out.println("Number is equal");
		}else{
			System.out.println("Number is not equal");
		}
	}
}
*/

//5.Check whether input is positive and even.
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a Number");
		int a = sc.nextInt();
		
		if( a >= 0 && a % 2 == 0){
			System.out.println("Number is Positive And Even");
		}else{
			System.out.println("Number is not Positive or Even");
		}
	}
}
*/

//6.Check whether input is negative and odd.
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a Number");
		int a = sc.nextInt();
		
		if( a <= 0 && a % 2 != 0){
			System.out.println("Number is Negative and Odd");
		}else{
			System.out.println("Number is not Negative or Odd");
		}
	}
}*/

//// 7.Check whether number is divisible by 2, 3, or 5.
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a Number");
		int a = sc.nextInt();
		
		if( a % 2 == 0  && a % 3 == 0 && a % 5 == 0){
			System.out.println("Number is Divisible by 2,3 and 5");
		}else{
			System.out.println("Number is not divisible by 2,3 and 5");
		}
	}
}*/

//9.Check whether a character is special symbol.
/*public class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTRE A SPEACIAL CHARACTOR");
		
		char ch = sc.next().charAt(0);
		if((ch >= 'A' && ch <= 'Z')||
		   (ch >= 'a' && ch <= 'z')||
		   (ch >= '0' && ch <= '9')){
			   
			   System.out.println("Not special a symbol");
		   }else{
			   System.out.println("Special a symbol");
		   }
	}
}*/

// 10.Check whether a string is empty.
/*public class J1{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a String : ");
		String str  =sc.nextLine();
		
		if(str.isEmpty()){
			System.out.println("String is Empty :");
		}else{
			System.out.println("String is not Empty :");
		}
		
	}
}*/

//11.Check whether a password is valid.
/*class J1{
	public static void main(String[] args){
		String str1 = "Bhushan307";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre youre password");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)){
			System.out.println("Password is same");
		}else{
			System.out.println("Password is incorrect");
		}
		
	}
	
}
*/

//12. Swap two variable with using third variable
/*class J1{
	public  static void main (String [] args){
		int a = 10;
		int b = 20;
		
		int temp = a ;
		a = b ;
		b = temp;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}
*/

//13. Swap two variable without using 3rd variable
/*class J1{
	public static void main (String [] args){
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A = "+a);
		System.out.println("B = "+b);
	}
}
*/

//14.	Write a Java program to calculate simple interest using variables.
/*class J1{
	public static void main(String[] args){
 		double P =  45000.00;
		double R =  10.00;
		double T =  2.5;
		double SI = (P*R*T) / 100 ;
		System.out.println("Simple Interest :- "+SI);
	}
}*/

// 15.Write a program to find the Square  and Cube of the number 
/*class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		
		int num_square  = num*num;
		int num_cube    = num*num*num;
		
		System.out.println("Square of num is "+ num +" = "+num_square);
		System.out.println("Cube of num is "+ num +" = "+num_cube);
	}
}*/


// 16. Write a program get 5 subject mark and give the average percentage 
/*class J1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a mark Marathi ");
		int Mrt  = sc.nextInt();
		System.out.println("Enter a mark Hindi ");
		int Hnd  = sc.nextInt();
		System.out.println("Enter a mark English ");
		int Eng = sc.nextInt();
		System.out.println("Enter a mark Math ");
		int Math  = sc.nextInt();
		System.out.println("Enter a mark Science ");
		int Sci  = sc.nextInt();
		
		int percentage = (Mrt + Hnd + Eng + Math + Sci)/5;
		
		System.out.println("The percentage is :"+ percentage + "%");
	}
}
*/

//17.	Write a Java program to demonstrate local, instance, and static variables.
/*
class J1{
	
	int a = 10;
	
	static int b = 30;
	
	public void show(){
		int c =  50;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public  static void main(String [] args){
		J1 obj = new J1();
		obj.show();
	}

	
}*/
/*class J1{
	public static void main(String[] args){
		int arr[] = {5,10,5,20,8,15};
	int max=arr[0];
	int sec_max=arr[0]; 
		for(int i = 0 ; i<arr.length;i++){
			if(arr[i] > max){
				sec_max = max;
				max = arr[i];
			}
			if(arr[i] > sec_max && arr[i] != max){
				sec_max = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(sec_max);
	}
}*/

/*class J1{
	public static void main(String[] args){
		int arr[] = {2,3,2,5,3,2,4};
		
		int visited[] = new int[arr.length];
		
		for(int i=0; i<arr.length;i++){
			
			if(visited[i] == 1){
				continue;
			}
			int count = 0;
			
			for(int j=0;j<arr.length;j++){
				
				if(arr[i] == arr[j]){ 
					count++;
					visited[j] = 1;
				}
			}
			System.out.println(arr[i]+"->"+count);
		}
	}
}*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {1, 2,3, 4, 5,7,8};
		int N = arr.length + 1;
		int actualSum = 0;
		int expectedSum = N * (N + 1) /2;
		
		for(int i=0; i<arr.length; i++){
			actualSum = actualSum + arr[i];
		}
		int missingNum = expectedSum - actualSum;
		
		System.out.println("Missing number is "+missingNum);
	}
}*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {0, 1, 0, 3, 12};
		int index = 0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] != 0){
				arr[index] = arr[i];
				index++;
			}
		}
		for(int i = index; i<arr.length; i++){
			arr[i] = 0;
		}
		for(int i = 0;i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
	}
}*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {1, 2, 2, 3, 4, 4, 5};

		for(int i=0; i<arr.length;i++){
			
			boolean duplicate = false;
			
			for(int j=0;j<i;j++){
				
				if(arr[i] == arr[j]){
					duplicate = true;
				}
			}
				if(duplicate == true){
				System.out.println("Duplicate Element is "+arr[i]+" ");
				}
		}
	}
}*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {12, 5, 8, 20, 3, 15};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i<arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
		
	}
}*/


/*class J1{
	public static void main(String[] args){
		int arr[] = {12, 5, 8, 7, 3, 10, 15, 20};
		int even = 0;
		int odd  = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] % 2 == 0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("EVEN NUMBER IS "+even);
		System.out.println("ODD NUMBER IS "+odd);
	}
}*/

/*class J1{
	public static void main(String[] args){
		int arr[] = {10, -5, 20, -8, 15, -3, 7};
		
		int positive_sum =0;
		int negative_sum =0;
		for(int i = 0;i<arr.length;i++){
			if(arr[i] > 0){
				positive_sum = positive_sum+arr[i];
			}else if(arr[i] < 0){
				negative_sum = negative_sum+arr[i];
			}	
		}System.out.println("positive_sum "+positive_sum);
		System.out.println("negative_sum "+negative_sum);
		
	}
}*/
/*class J1{
	public static void main(String [] args){
		int arr[] = {10,20,30,40,50,60};
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" , ");
		}	
	}
}*/

/*class J1{
	public static void main(String [] args){
		
		int arr[] = {10, 20, 30, 40, 50, 60};
		
		int left = 0 ;
		int right = arr.length-1;
		
		while(left < right){
			int temp  = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]+" ");
		}
	}
}*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {10 ,-5 ,20 ,-8 ,15 ,-3 ,7};
		int left = 0;
		
		for(int i = 0;i<arr.length;i++){
			if(arr[i]<0){
				int temp = arr[left];
				arr[left] = arr[i];
				arr[i] = temp;
				
				left++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
*/

/*class J1{
	public static void main(String [] args){
		int arr[] = {12,5, 8, 20, 3, 15};
		int smallest = arr[0];
		int sec_smallest = arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i] < smallest){
				sec_smallest = smallest;
				smallest = arr[i];
			}
			if(arr[i] < sec_smallest && smallest != arr[i]){
				sec_smallest= arr[i];
			}
		}
		System.out.println("Smallest number is "+ smallest);
		System.out.println("Second Smallest number is "+sec_smallest);
	}
}
*/
/*Class J1{
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
/*class J1{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
/*class J1{
	public static void main(String[] args){
		for(int i=1; i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}*/

/*class J1{
	public static void main(String[] args){
		for(int i=1; i<=5;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/


/*class J1{
	public static void main(String[] args){
		for(int i=1; i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			
			for(int j=2; j<=i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}*/


class J1{
	public static void main(String[] args){
		for(int i=1; i<=4;i++){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=3; i>=1;i--){
			for(int j=3;j>=i;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

































