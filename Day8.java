
//Reverse Words in a String
/*class Day8{
	public static void main(String[] args){
		String str = "Java is easy";
		
		String words[] = str.split(" ");
		
		for(int i=words.length-1;i>=0;i--){
			System.out.print(words[i]+" ");
		}
	}
}
*/

//Find Duplicate Elements
/*class Day8{
	public static void main(String[] args){
		int arr[] = {2, 5, 3, 2, 7, 5, 9};
		
		boolean duplicate = false;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] == arr[j]){
					duplicate = true;
					System.out.println(arr[i]);
				}
			}
		}
	}
}*/

//Move Negative Numbers to One Side
/*class Day8{
	public static void main(String[] args){
		int arr[] = {2, -5, 7, -3, 8, -1, 4};
		
		int j = 0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i] < 0){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}*/

//Maximum Subarray Sum

/*class Day8{
	public static void main(String [] args){
		int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

		int max = 0;
		
		for(int i=0;i<arr.length;i++){
			int sum =0;
			
			for(int j=i;j<arr.length;j++){
				sum = sum+arr[j];
				if(sum > max){
					max = sum;
				}
			}
		}
		System.out.println(max);
		
	}
}
*/

//Frequency of Elements
/*class Day8{
	public static void main(String[] args){
		int arr[] = {2, 3, 2, 5, 3, 2, 7};
		
		for(int i=0;i<arr.length;i++){
			int count = 0;
			boolean duplicate = false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					duplicate = true;
					break;
				}
			}
			if(duplicate){
				continue;
			}
			for(int k =0;k<arr.length;k++){
				if(arr[i]==arr[k]){
					count++;
				}
			}
			System.out.println(arr[i]+" = "+count);
		}
	}
}
*/

interface Day8 {
    int add(int a, int b);
}

class Demo {
    public static void main(String[] args) {

        Day8 c = new Day8() {

            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };

        int result = c.add(10, 20);

        System.out.println(result);
    }
}