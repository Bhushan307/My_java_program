import java.util.*;

/*class funcinfo{
	public static void printMyName(String name){
		System.out.println(name);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		printMyName(name);
	}
}*/

/*class funcinfo{
	public static int calculateSum(int a,int b){
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = calculateSum(a ,b);
		System.out.println(sum);
	}
}*/


/*class funcinfo{
	public static int calculateproduct(int a,int b){
		return a*b;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(calculateproduct(a,b));
	}
}*/

class funcinfo{
	public static void printFactorial(int n){
		int factorial =1;
		
		
		for(int i=n;i>=1;i--){
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printFactorial(n);

	}
}