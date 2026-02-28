import java.util.*;
//1.Check whether a number lies in a given range.
/*public class task6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int min=1000;
		int max=9999;
		if(num>min & num<max){
			System.out.println("Number in a given range");
		}else{
			System.out.println("Number is not a given range");
		}
	}
}*/
//2.Check whether two numbers are equal.
/*class task6{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number 1 value");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2 value");
		int num2=sc.nextInt();
		if(num1==num2){
			System.out.println("Numnber is equal");
		}else{
			System.out.println("Number is not equal");
		}	
	}
}*/
//3.Check whether three numbers are equal.
/*class task6{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number 1 value");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2 value");
		int num2=sc.nextInt();
		System.out.println("Enter a number 3 value");
		int num3=sc.nextInt();
		
		if(num1==num2){
			System.out.println("Numnber 1 and 2 are equal");
		}else if(num2 == num3){
			System.out.println("Number are equal ");
		}else if(num1 == num3){
			System.out.println("Number 1 and 3 are not equal");
		}else{
			System.out.println("Number are not equal");
		}
	}	
}

*/
//4.Check whether any two numbers are equal.
/*class task6{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number 1 value");
		int num1=sc.nextInt();
		System.out.println("Enter a number 2 value");
		int num2=sc.nextInt();
		if(num1==num2){
			System.out.println("Numnber is equal");
		}else{
			System.out.println("Number is not equal");
		}	
	}
*/


// 5.Check whether input is positive and even.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
	if(num % 2 == 0 & num >= 0){
		System.out.println("Number is positive and even");
	}else{
		System.out.println("Number is positive or even");
	}
	}
}*/


//6.Check whether input is negative and odd.

/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
	if(num % 2 != 0 & num < 0){
		System.out.println("Number is Negative and odd");
	}else {
		System.out.println("Number is negative  or odd");
	}
	}
}*/

// 7.Check whether number is divisible by 2, 3, or 5.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =sc.nextInt();
		
		if(num % 2== 0 && num % 3== 0 && num % 5==0 ){
			System.out.println("Number is divisible by 2, 3 & 5");
		}else{
			System.out.println("Number is not divisible by 2, 3 & 5");
		}
	}
}*/

// 8.Check whether number is divisible by 4 or 6.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num =sc.nextInt();
		
		if(num % 4== 0 && num % 6== 0){
			System.out.println("Number is divisible by 4 & 6");
		}else{
			System.out.println("Number is not divisible by 4 & 6");
		}
	}
}*/

//9.Check whether a character is special symbol.
/*public class task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z') || 
            (ch >= '0' && ch <= '9')) {

            System.out.println("Not a special symbol");
        } else {
            System.out.println("It is a special symbol");
        }
    }
}*/


// 10.Check whether a string is empty.
/*public class task6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}*/

//11.Check whether a password is valid.
/*public class task6{
    public static void main(String[] args) {
	String pass="Skillio*1902";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter youre password");
		String clientpass=sc.nextLine();
		
		if(pass.equals(clientpass)){
			System.out.println("Password is vallid");
		}else{
			System.out.println("Password is not valid");
		}	
    }
}*/
//12.Validate username and password.
/*public class task6{
    public static void main(String[] args) {
	String username = "Bhushan_99x";
	String pass="Skillio*1902";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre Username");
		String clientusername=sc.nextLine();
		
		System.out.println("Enter youre password");
		String clientpass=sc.nextLine();
		
		if( username.equals(clientusername) && pass.equals(clientpass)){
			System.out.println(" Uername & Password is vallid");
		}else{
			System.out.println(" Username & Password is not valid");
		}	
    }
}*/

//13.Check eligibility for admission.
/*public class task6{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Youre Age");
		int age =sc.nextInt();
		
		if(age <= 6){
			System.out.println("Eligibility for admission 1  class");
		}else if(age <=10){
			System.out.println("Eligibility for admission 5th class");
		}else if(age <= 13){
			System.out.println("Eligibility for admission 8th class");
		}else if(age <=15){
			System.out.println("Eligibility for admission 11nth class");
		}else if(age <=17){
			System.out.println("Eligibility for admission degree or diploma");
		}else{
			System.out.println("Not eligibility for admission ");
		}	
    }
}
*/

//14.Check eligibility for loan.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre income");
		
		int income=sc.nextInt();
		if(income <=100000){
			System.out.println("Eligibility for loan");
		}else{
			System.out.println(" Not eligibility for loan");
		}
	}
}*/
//15.Check eligibility for promotion.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many year of expreriance you have ");
		int exp=sc.nextInt();
		System.out.println("Enter performance rating");
		int pfrmnce=sc.nextInt();
		if(exp >= 3 & pfrmnce >= 4 ){
			System.out.println("Eligibile for Promotion");
		}else{
			System.out.println(" Not eligibile for Promotion");
		}
	}
}*/
// 16.Check whether employee is permanent or temporary.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" How many year of expreriance you have ");
		int exp=sc.nextInt();
		
		if(exp > 2){
			System.out.println("Employee is permanent ");
		}else{
			System.out.println("Employee is not permanent ");
		}
	}
}*/
//17.Check whether product is in stock.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int stock =50
		
		if(stock > 0){
			System.out.println("Product is in stock");
		}else{
			System.out.println("Product is not in stock");
		}
	}
}*/
//18.Check whether age is in teenage range.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre Age");
		int age=sc.nextInt();
		
		if (age >= 13 && age <= 19){
			System.out.println("Age in teenage range");
			} else{
				 System.out.println("Age not in teenage range");
			}
	}
}*/

//19.Check whether a person is senior citizen.
/*public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre Age");
		int age=sc.nextInt();
		
		if (age >= 60){
			System.out.println("Senior citizen");
			}else{
				System.out.println("Not a senior citigen")
			}
	}
}*/
//20.Check whether temperature is hot, cold, or normal.
public class task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter youre Age");
		int temp=sc.nextInt();
		
		if (temp <= 15){
			System.out.println("Temperature is Cold");
			} else if(temp > 15 && temp <= 30){
				 System.out.println(" Temperature is Normal");
			}else{
				System.out.println("Temperature is Hot");
			}
	}
}