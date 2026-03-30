public class OOPs{
	
	public static void main(String [] args){
		Pen p1 = new Pen(); // created pen object 
		p1.setColor("Blue");
		p1.setTip(5);
		Student s1 = new Student();
		p1.setColor("Blue");
		System.out.println(p1.getColor());
		//p1.setTip(10);
		System.out.println(p1.getTip());
		//BankAccount myAcc = new BankAccount();
		//myAcc.username = "bhushan_307x";
		//myAcc.setPassword("123456abcefg");
		
	}
}

	class Bank_Account{
		public String username;
		private String password;
		
		public void setPassword(String pwd){
			password =pwd;
		}
		
	}


	class Pen{
		String color;
		int tip;
		
		String getColor(){
			return this.color;
		}
		int getTip(){
			return this.
			tip;
		}
		
		
		void setColor(String newColor){
			color = newColor;
		}
		void setTip(int newTip){
			tip = newTip;
		}
	}
	
	class Student{
		String name;
		int age;
		float percentage;//cgpa
		
		void calcPercentage(int phy,int chem , int math){
			percentage = (phy + chem + math)/3;
		}
	}
	
	