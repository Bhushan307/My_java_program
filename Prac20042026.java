import java.util.*;

/*public class Prac20042026{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x= sc.nextInt();
		if(x%2 ==0){
			System.out.println("The number is even");
			}else{
				System.out.println("The number is odd");
		}
	}
}*/

/*public class Prac20042026{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x= sc.nextInt();
		if(x == 0){
			System.out.println("The number is Zero");
			}else if(x>0){
				System.out.println("The number is Positive");
			}else{
				System.out.println("The number is Negative");
			}
	}
}*/


/*public class Prac20042026{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		if(x<y){
			System.out.println("Y is a Greater ");
			}else{
				System.out.println("X is Greater");
		}
	}
}*/

/*public class Prac20042026{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		if(y<x & z<x ){
			System.out.println("X is a Greater ");
			}else if(z<y){
				System.out.println("Y is Greater");
		}else{
			System.out.println("Z is Greater ");
		}
	}
}*/


/*public class Prac20042026{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Number ");
		double x= sc.nextDouble();
		System.out.println("Enter a Operator");
		char operator=sc.next().charAt(0);
		System.out.println("Enter a Second Number");
		double y= sc.nextDouble();
		double result;
		switch(operator){
			case '+':
			result=x+y;
			System.out.println("Addition = "+ result);
			break;
			
			case '-':
			result=x-y;
			System.out.println("Subsraction = "+ result);
			break;
			
			case '*':
			result=x*y;
			System.out.println("Multiplication = "+ result);
			break;
			
			case '/':
                if (y == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                } else {
                    result = x / y;
                    System.out.println(result);
                }
                break;

            default:
                System.out.println("Error: Invalid operator!");
		}
	}
}*/


/*public class Prac20042026{
	public static void main(String args[]){
		for(int i =1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

/* 3. Left-Aligned Triangle
public class Prac20042026{
	public static void main(String args[]){
		for(int i =1; i<=5; i++){
			for(int j=5; j>=i; j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

/* 4. Pyramid Pattern (Very Important ⭐)
public class Prac20042026{
	public static void main(String args[]){
		for(int i =1; i<=5; i++){
			for(int j=4; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


/* 5. Inverted Pyramid
public class Prac20042026{
	public static void main(String args[]){
		for(int i =1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int k=11; k>=(2*i+1); k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


/*6. Diamond Pattern (Most Asked ⭐⭐)
public class Prac20042026{
	public static void main(String args[]){
		for(int i =1; i<=5; i++){
			for(int j=4; j>=i; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}
			for(int k=9; k>=(2*i+1); k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

/* 7. Number Triangle
public class Prac20042026{
	public static void main(String[] args){
		int num=5;
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+",");
			}
			System.out.println();
		}
	}
}   */

/*8. Floyd’s Triangle 
public class Prac20042026{
	public static void main(String[] args){
		int num=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}*/


/* 9. 0-1 Triangle 

public class Prac20042026{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				if((i+j)% 2==0){
					System.out.print("1 ");
				}else{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
*/

/* 10. Pascal’s Triangle (🔥 Interview Favorite)

public class Prac20042026{
	public static void main(String[] args){
		for(int i=0; i<=5; i++){
			int num=1;
			for(int j=0; j<=i; j++){
				System.out.print(num +" ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}*/

/* 11. Hollow Square
public class Prac20042026{
	public static void main(String[] args){
		for(int i = 1; i<=5; i++){
			for(int j=1; j<=5; j++){
				if(i == 1 || i == 5 || j==1 || j==5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/


/* 12. Butterfly Pattern*/
public class Prac20042026{
	public static void main(String[] args){
		int n=5;
		for(int i = 1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			for(int k=1; k<=2*(n - i); k++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}