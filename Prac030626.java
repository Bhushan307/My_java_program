
//No Argumnet constructor

/*public class Prac030626{
	
	Prac030626(){
			System.out.println("Constructor is called");
		}
	public static void main(String[] args){
		Prac030626 cst = new Prac030626();
		}
	}
*/


//Parameterized Constructor;
/*public class Prac030626{
	
	 Prac030626( int id , String name,String address ){
			System.out.println(id+" ,"+name+" ,"+address);
		}
	public static void main(String[] args){
		Prac030626 cst = new Prac030626(101,"Bhushan","Nagpur");
		}
}*/


 
/*public class Prac030626{
	void a(){
		System.out.println("Inside a class");
	}
	public static void main(String[] args){
		Prac030626 obj = new Prac030626();
		obj.a();
	}
}
*/

/*public class Prac030626{
	int x=89;
	public static void main(String[] args){
		Prac030626 obj = new Prac030626();
		System.out.println(obj.x);
	}
}*/

/*public class Prac030626{
	static int x=89;
	public static void main(String[] args){
		System.out.println(x);
	}
}*/



/*public class Prac030626{
	public static void main(String[] args){
		int x=190;
		System.out.println(x);
	}
}*/

/*public class Prac030626{
	{
		System.out.println("I am a Instance Block");
	}
	public static void main(String[] args){
		Prac030626 obj = new Prac030626();
		Prac030626 obj2 = new Prac030626();
		Prac030626 obj3= new Prac030626();
		Prac030626 obj4 = new Prac030626();
		Prac030626 obj5 = new Prac030626();
	}
}*/

/*public class Prac030626{
	static{
		System.out.println("I am a Static Block");
	}
	public static void main(String[] args){
		System.out.println("Main method");
	}
}*/


/*public class Prac030626{
	static{
		System.out.println("I am a Static Block");
	}
	
	public static void main(String[] args){
		{
		System.out.println("I am a instance Block");
	}
		System.out.println("Main method");
	}
}*/

/*class Prac030626{
	public static void main(String [] args){
		for(int i=0; i<=4; i++){
			for(int j=0; j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}*/


/*class Prac030626{
	public static void main(String [] args){
		for(int i = 0; i<=5; i++){
			for(int j=0; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/


/*class Prac030626{
	public static void main(String [] args){
		for(int i = 0; i<=5; i++){
			for(int j=5; j>=i; j--){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
*/

/*class Prac030626{
	public static void main(String [] args){
		int num=1;
		for(int i = 1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}*/
/*class Prac030626{
	public static void main(String [] args){
		for(int i=1;i<=10;i++){
			for(int j=10;j>=i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


/*class Prac030626{
	public static void main(String [] args){
		for(int i=1; i<=4; i++){
			for(int j=4; j>=i; j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}*/


/*class Prac030626{
	public static void main(String [] args){
		
		for(int i=1; i<=4; i++){
			for(char ch='A'; ch<'A'+i; ch++){
				System.out.print(ch);
				
			}
			System.out.println();
		}
	}
}*/

/*class Prac030626{
	public static void main(String [] args){
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				
				if(i==1 || i==4 || j==1 || j==4){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}
}
*/

class Prac030626{
	public static void main(String [] args){
		int n =5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1; i--){
			for(int j=1;j<=5-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}












































