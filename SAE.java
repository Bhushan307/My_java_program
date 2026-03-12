/*public class SAE{
	public static void main(String[] args){
		int [] arr ={11,23,45,67,89,98,99,75};
		int key = 67;
		
		for(int i=0; i<arr.length; i++){
			if( key == arr[i]){
				System.out.println("Key is find :-"+ arr[i]);
			}
		}System.out.println();
	}
}*/

public class SAE{
    // Instance variables
    String name;
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }


public class Main {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.name = "Bhushan";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Nikhil";
        s2.marks = 85;

        s1.display();
        s2.display();
    }
}
}