import java.util.*;
/*class Arrinfo{
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int size  = sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<size; i++){
			arr[i]= sc.nextInt();
		}
		
		for(int i=0;i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/


/*class Arrinfo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		String names[] = new String[size];
		
		for(int i=0;i<size; i++){
			names[i] = sc.next();
		}
		
		for(int i=0;i<names.length;i++){
			System.out.println("name " + (i+1) + " is : " + names[i]);
		}
	}
}*/

/*class Arrinfo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0;i<size; i++){
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("max num is : "+max);
		System.out.println("min num is : "+min);
	}
}*/

/*class Arrinfo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int numbers[] = new int[size];
		
		
		for(int i=0;i<size;i++){
			numbers[i] = sc.nextInt();
		}
		
		boolean isAscending  = true;
		
		for(int i=0; i<numbers.length-1;i++){
			if(numbers[i] > numbers[i+1]){
				isAscending = false;
			}
		}
		
		if(isAscending){
			System.out.println("The array is sorted in ascending order");
		}else{
			System.out.println("The array is not sorted in ascending order");
		}
	}
}*/


//2 D ARRAY //
/*class Arrinfo{
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }




       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
                   System.out.print(numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}
*/

public class Arrinfo {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }


       int x = sc.nextInt();


       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
   }
}
