import java.util.*;
//1.Print a square star pattern of size n.

/*public class taskn7{
	public static void main(String[] args){
		int n = 5;
		
		for(int row = 1; row<=n; row++){
			for(int col=1; col<=n; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//2.Print a right-angled triangle star pattern.
/*public class taskn7{
	public static void main(String[] args){
		int n = 5;
		
		for(int row = 1; row<=n; row++){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/


//3.Print an inverted right-angled triangle.

/*public class taskn7{
	public static void main(String[] args){
		
		for(int row = 1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//4.Print a left-aligned triangle pattern.
/*public class taskn7{
	public static void main(String[] args){
		
		for(int row = 1; row<=5; row++){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//5.Print a pyramid star pattern.
/*public class taskn7{
	public static void main(String[] args){

		
		for(int row = 1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print(" ");
			}for(int star=1; star<=row; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/


//6.Print an inverted pyramid pattern.
/*public class taskn7{
	public static void main(String[] args){

		
		for(int row = 1; row<=5; row++){
			for(int col=1; col<=row; col++){
				System.out.print(" ");
			}for(int star=5; star>=row; star--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
//7.Print a full diamond star pattern.
/*public class taskn7{
	public static void main(String[] args){

		
		for(int row = 1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print(" ");
			}for(int star=1; star<=row; star++){
				System.out.print("* ");
			}
			System.out.println();
		}for(int row=1;row<=4;row++){
			for(int col=1; col<=row; col++){
				System.out.print(" ");
			}for(int star=4; star >=row; star--){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}*/
//8.Print a half diamond pattern.
/*public class taskn7{
	public static void main(String[] args){

		
		for(int row = 1; row<=5; row++){
			for(int star=1; star<=row; star++){
				System.out.print("* ");
			}
			System.out.println();
		}for(int row=1;row<=4;row++){
			for(int star=4; star >=row; star--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
*/
//9.Print a hollow square pattern.
/*public class taskn7{
	public static void main(String[] args){
		for(int row=1; row<=5; row++){
			for(int col=1; col<=5; col++){
				if(row ==1 || col ==1 || row==5 || col == 5){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}*/

//10.Print a hollow right triangle.
/*public class taskn7{
	public static void main(String[] args){
		
		for(int row = 1; row<=4; row++){
			for(int col=1; col<=row; col++){
				if(col == row || row == 1 || row == 4 || col == 1){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}*/


//11.Print a hollow pyramid.
/*class taskn7{
	public static void main(String [] args){
		for(int row = 1; row <=4; row++){
			for(int col= 4; col>=row; col--){
				System.out.print(" ");
			}for(int star=1; star<=row; star++){
				if(row == star ||star == 1 || row == 4){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
				
			}System.out.println();
		}
	}
}*/
//12.Print a hollow diamond.
/*public class taskn7{
	public static void main(String[] args){

		
		for(int row = 1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print(" ");
			}for(int star=1; star<=row; star++){
				if(row == star || star ==1 ){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}for(int row=1;row<=4;row++){
			for(int col=1; col<=row; col++){
				System.out.print(" ");
			}for(int star=4; star >=row; star--){
				if(star == 4 || star == 1 ||  row == star){
					System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}*/
//13.Print a butterfly star pattern.
/*class taskn7{
	public static void main(String [] args){
		for(int line=1 ; line<=5; line++){
			for(int star=1; star<=line; star++){
				System.out.print("*");
			}for(int space = 4; space>=line ; space-- ){
				System.out.print("  ");
			}for(int star=1; star<=line; star++){
				System.out.print("*");
			}
			System.out.println();
		}for(int line =1; line<=4; line++){
			for(int star=4; star>=line; star--){
				System.out.print("*");
			}for(int space=1; space<=line; space++){
				System.out.print("  ");
			}for(int star=4; star>=line; star--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//14.Print a sandglass pattern.
/*class taskn7{
	public static void main(String[] args){
		for(int line=1; line<=5; line++){
			for(int space = 1; space<line ; space++){
				System.out.print(" ");
			}
			for(int star= 5; star>=line; star--){
				System.out.print("* ");
			}System.out.println();
		}for(int line=1; line<=5;line++){
			for(int space =5; space>line; space --){
				System.out.print(" ");
			}for(int star = 1;star<=line; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
//15.Print a Pascal triangle style star pattern.
/*class taskn7{
	public static void main(String [] args){
		for(int line=1; line<=10; line++){
			for(int space =9; space>=line ; space--){
				System.out.print(" ");
			}
			for(int star=1; star<=line; star++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}*/
//16.Print a star pattern with increasing numbers of stars per row (odd numbers only).
/*class taskn7{
	public static void main(String [] args){
		for(int row=1; row<=9; row+=2){
			for(int col=1; col<=row; col++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//17.Print a centered pyramid with spaces properly aligned.
/*class taskn7{
	public static void main(String [] args){
		for(int row=1; row<=10; row++){
			for(int space=9; space>=row; space--){
				System.out.print(" ");
			}for(int star=1; star<=row; star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
//18.Print a reverse mirrored triangle.
/*class taskn7{
	public static void main(String [] args){
		for(int row=1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//19.Print a zig-zag star pattern (3 rows format).
/*class taskn7{
	public static void main(String [] args){
		for(int row=1; row<=5; row++){
			for(int col=5; col>=row; col--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
//20.Print a plus (+) pattern using stars
class taskn7{
	public static void main(String [] args){
		for(int row=1; row<=5; row++){
			for(int space=4; space=row; space++){
				System.out.print(" ");
			}for(int star=1; star<=row;){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}