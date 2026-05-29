import java.util.*;

import java.util.LinkedList;

import  java.util.Vector;


/*public class List{
	public static void main (String[] artgs){
		ArrayList<String> list = new ArrayList<>();
		list.add("JAVA");
		list.add("PYTHON");
		list.add("SQL");
		list.add("C++");
		
		list.remove(1);
		list.set(0, "HTML");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("Java"));
		
		
	}
}

*/

/*public class List{
	public static void main (String[] artgs){
		ArrayList<String> Students= new ArrayList<>();
		
		Students.add("Rahul");
        Students.add("Amit");
        Students.add("Vijay");
        Students.add("Amit");
		
		
		System.out.println(Students);
		System.out.println(Students.size());
		System.out.println(Students.get(1));
		
		
		System.out.println("Current Student List:");
		for(String Studtents: Students){
			//System.out.println("-"+Students);
		}System.out.println("-"+Students);
	}
}
*/




/*public class List{
	public static void main (String[] artgs){
		LinkedList<String> BugQueue  = new LinkedList<>();
		
		BugQueue.add("Fix Login Bug");
		BugQueue.add("DB Backup");
		BugQueue.add("Code Review");
		BugQueue.add(1, "Urgent Hotfix");
		
		
		System.out.println(BugQueue);
		System.out.println(BugQueue.size());
		
		System.out.println(reversed());
		
		
	}
}*/


public class List{
	public static void main (String[] artgs){
		Vector<String> list = new Vector<>();
		list.add("JAVA");
		list.add("PYTHON");
		list.add("SQL");
		list.add("C++");
		
	
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.contains("SQL"));
		
		
	}
}