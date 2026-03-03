//pattern
/*public class pattern{
	public static void main(String[] args){
		for(int line=1;line<=4;line++){
			for(int star=1;star<=line;star++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
/*public class pattern{
	public static void main(String[] args){
		for(int line=1;line<=4;line++){
			for(int star=4;star>=line;star--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/


/*public class pattern{
	public static void main(String [] args){
		for(int line=1; line <=4; line++){
			for(int star=1; star<=line; star++){
				System.out.print("*");
			}
			System.out.println();	
		}for(int line =1; line<=4;line++ ){
			for(int star=1;star<=(4-line+1);star++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

//Pyramid


/*public class pattern{
	public static void main(String [] args){
		for(int i=1; i<=4; i++){
			for(int j=3; j>=i ; j--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++ ){  
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/

//down pyramind
/*public class pattern{
	public static void main(String[] args){
		for(int i=4; i>=1; i--){
			for(int j=3; j>=i ; j--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++ ){  
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/


//full pyramids
/*public class pattern{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			for(int j=3; j>=i; j--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}	
		for(int i=3; i>=1; i--){
			for(int j=3;j>=i; j--){
				System.out.print(" ");
			}for(int j=1;j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}*/
	
/*public class pattern{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			for(int j=3; j>=i; j--){
				System.out.print(" ");
			}for(int k=1; k<=i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/

/*public class pattern{
	public static void main(String[] args){
		for(int i=1; i<=4; i++){
			for(int j=1; j<=i; j++){
				System.out.print(" ");
			}for(int k=4; k>=i; k--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/

//number pattern
/*class pattern{
	public static void main(String[] args){
		for(int line=1; line<=4;line++){
			for(int num=1; num<=line;num++){
				System.out.print(num);
			}System.out.println();
		}
	}
}*/


/*class pattern{
	public static void main(String[] args){
		char ch='a';
		for(int line=1; line<=4;line++){
			for(char c=1;c<=line;c++){
				System.out.print(ch);	
			}
			System.out.println();
		}
	}
}*/


//Alphabet  (a,ab,abc,abcd)in pyramind
/*public class pattern{
	public static void main(String [] args){
		for(int i=1; i<=4; i++){
			for(int j=4; j>=i ; j--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++ ){  
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
	}
}*/

/*public class pattern{
	public static void main(String[] bhushan){
		char ch='a';
		for(int i=1; i<=5; i++){
			for(char j=1;j<=i;j++){
			System.out.print(ch);
			
			}ch++;
			System.out.println();
		}
	}
}*/

//Hollow Square
/*public class pattern{
	public static  void main(String [] args){
		int row,col;
		for( row=1;row<=5;row++){
			for( col=1; col<=5;col++){
				if(row==1 || row==5 || col==1 || col==5){
					System.out.print("* ");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}*/


/*public class pattern{
	public static void main(String[] bhushan){
		for(int i=1; i<=4; i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}for(int i=1; i<=3; i++){
			for(int j=3;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}	
	}
} */

public class pattern {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(col - 1);
                }
            }
            System.out.println();
        }
    }
}



