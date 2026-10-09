/*class Day7{
	public static void main(String [] args){
		int arr[] = {10,20,30,40,50};
		
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print(first);
		
	}
}*/

//Maximum Difference
/*class Day7{
	public static void main(String[] args){
		int arr[] = {2, 3, 10, 6, 4, 8, 1};
		
		int maxdiff = 0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				
				int diff = arr[j] - arr[i];
				
				if(diff > maxdiff){
					maxdiff = diff;
				}
			}
		}
		System.out.println("Maximum Diffrence is "+maxdiff);
	}
}*/

//MOVE ALL ZERO TO END
/*class Day7{
	public static void main(String[] args){
		int arr[] = {0, 5, 0, 2, 0, 8, 7};
		
		int j=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] != 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				j++;
			}
			
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}*/


//Print first non duplicate String
/*class Day7{
	public static void main(String[] args){
		String str = "aabbcde";
		
		
		
		for(int i=0;i<str.length();i++){
			
			int count = 0;
			
			for(int j=0;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					count++;
				}
			}
			if(count == 1){
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}*/

//TWO SUM 
class Day7{
	public static void main(String[] args){
		int arr[] = {5,5, 2, 8, 11,3,7};
		int target = 10;
		boolean found = false;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] + arr[j] == target){
					System.out.println(arr[i]+" "+arr[j]);
					found = true;
					break;
				}
			}
			if(found){
				break;
			}
		
		}
	}
}