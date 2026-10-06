/*class Day4{
	public static void main (String [] args){
		String str = "Java is a programming language";
		int count = 1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == ' '){
				count++;
			}
		}
		System.out.println("Count of word is "+ count);
	}
}*/

/*class Day4{
	public static void main (String [] args){
		String str = "Java is very easy";
		
		System.out.println(str.replace(" ",""));
	}
}*/


/*class Day4{
	public static void main (String [] args){
		String str = "Java is very easy";
		
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ' '){
			System.out.print(str.charAt(i));
			}
		}
	}
}*/

/*class Day4{
	public static void main(String [] args){
		String str = "programming";
		boolean duplicate = false;
		
		for(int i=0; i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i) == str.charAt(j)){
					System.out.println(str.charAt(i));
					break;
					
				}
			}
		}
	}
}*/

/*class Day4{
	public static void main(String [] args){
		int arr[] = {10, 20, 30, 40, 50, 60, 70};
		int target = 50;
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			if(arr[mid] == target){
				System.out.println("Element found at index "+ mid);
				break;
			}else if(arr[mid] < target){
				start = mid+1;
			}else{
				end = mid-1;
			}
			
		}
	}
}*/


class Day4{
	public static void main(String[] args){
		int arr[] = {5, 10, 5, 20, 8, 15};
		int max = arr[0];
		int sec_max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				sec_max = max;
				max=arr[i];
			}else if(arr[i] > sec_max && arr[i] != max){
				sec_max= arr[i];
			}
		}
		System.out.println("Second maximun num is  "+ sec_max );
	}
}