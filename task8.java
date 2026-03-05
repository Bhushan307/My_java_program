/*1.What are access modifiers in Java?

ANS:- Access modifiers are keywords in Java that control 
the visibility (access level) of classes, variables, methods,
and constructors.
                      OR
-Access modifiers decide who can use your data and from where.
					  

2.Name all the access modifiers in Java.
ANS:- There is a four type of access modifiers in java 
     a.Private
	 b.Default
	 c.Protected
	 d.Public

3.What is the default access modifier in Java?
ANS:- Default access allows members (variables, methods, classes
constructors)to be accessed only within the same package.
-If you don’t write public, private, or protected,Java automatically 
gives default access.


4.What is the difference between public and private access modifier?
ANS:-            Feature	            		 PUBLIC	    	 PRIVATE
			Access inside same class			  Yes			   Yes
			Access inside same package			  Yes			   No
			Access outside package				  Yes			   No
			Access in child class				  Yes			   No
			Security Level						  Low			   High

5.What is protected access modifier?
ANS:- Protected members can be accessed within the same package and outside
the package only through inheritance.
The protected access modifier allows members to be:
-Accessible within the same class
-Accessible within the same package
-Accessible in child classes (even in different packages)

6.What is the scope of default access modifier?
ANS:-Default access is package-level access.
-Within the same class
-Within the same package
-Not accessible outside the package

7.Which access modifier provides the highest restriction?
ANS:-PRIVATE 
   -Because it is accessible only inside the same class.
   
   
8.Which access modifier provides the lowest restriction?
ANS:-public
    -Because it is accessible from anywhere.
	
	
9.Can we access private variables outside the class?
ANS:-No
    -Private variables cannot be accessed outside the class directly.
    (We can access them using public getter/setter methods.)
	
	
10.Can we access protected members outside the package?
ANS:-Yes, but only through inheritance.
     Not directly without extending the class.
	 
	 
11.What is package-level access?
ANS:-Package-level access (also called default access) allows members
to be accessed only within the same package.
    -No keyword is written for default access.


12.Can a class be declared as private?
ANS:-A top-level class cannot be declared as private.
    -But an inner class (class inside another class) can be private.

13.Which access modifier is used for maximum accessibility?
ANS:- Public


14.What is the accessibility order from most restrictive to least restrictive?
ANS:-  private → default → protected → public


15.Why are access modifiers important?
ANS:-To provide security
    -To achieve encapsulation
    -To control access to data
    -To protect sensitive variables and methods

*/
//16.Write a program demonstrating private variable and public getter method.
public class task8 {
	
    public int rollno=11;
	public  String name="BHUSHAN";
	public  int age=22;
	
	public int get_rollnumber() {
		return rollno;
	}
	
	public String get_name() {
		return name;
	}
	public int get_age() {
		return age;
	}
	
	
	public static void main(String[] args) {
			
		task8 s1 = new task8();
			System.out.println("Student  Roll No :"+s1.get_rollnumber());
			System.out.println("Student name :"+s1.get_name());
			System.out.println("Student age :"+s1.get_age());
	}
}

/*17.Write a class with public variable and access it from another class.
ANS:-


18.Create a class with default access modifier and access it within same package.
ANS:-


19.Demonstrate private method and call it inside same class.
ANS:-


20.Create a protected variable and access it using inheritance.
ANS:-


21.Write a class with all four access modifiers.
ANS:-


22.Show example of private constructor.
ANS:-


23.Write program to restrict access using private modifier.
ANS:-


24.Create class and access public method from another class.
ANS:-


25.Demonstrate default access modifier with example.
ANS:-


26.Create two packages and demonstrate protected access modifier.
ANS:-


27.Show that private members cannot be accessed outside class.
ANS:-


28.Demonstrate public class and private variable.
ANS:-


29.Write program showing protected method accessed in subclass.
ANS:-


30.Create class with private variable and modify using setter method.
ANS:-


31.Demonstrate access modifiers with inheritance.
ANS:-


32.Show default access modifier cannot be accessed outside package.
ANS:-


33.Create multiple classes and test accessibility of methods.
ANS:-


34.Demonstrate public vs protected using example.
ANS:-


35.Write program showing encapsulation using private modifier.
ANS:-
*/