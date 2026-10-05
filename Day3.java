//Q1 — Reverse an Array
/*public class Day3 {
	public static void main(String [] args){
		int arr[] = {10, 20, 30, 40, 50};
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
		}
	}
}*/

/*public class Day3{
	public static void main(String [] args){
		int arr[] = {1, 2, 3, 4, 5};
		
		int last = arr[arr.length-1];
		for(int i = arr.length - 1; i > 0; i--){
			arr[i] = arr[i - 1];
		}
		arr[0] = last;
		
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}*/

/*class Day3{
	public static void main(String[] args){
		int arr[] = {12, 5, 8, 20, 3, 15};
		int min = arr[0];
		int sec_min = arr[0];
		
		for(int i=0;i<arr.length;i++){
				if(arr[i]<min){
					sec_min = min;
					min = arr[i];
				}else if(arr[i]<sec_min && arr[i] != min){
					sec_min = arr[i];
				}
		}
		System.out.println(sec_min);
	}
}*/

/*class Day3 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 2, 5, 3, 2};
        for(int i = 0; i < arr.length; i++) {
         
            boolean duplicate = false;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
     
            if(duplicate) {
                continue;
            }
   
            int count = 0;
            for(int j = 0; j < arr.length; j++) {

                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println(arr[i] + " = " + count + " times");
        }
    }
}
*/

class Day3 {
    public static void main(String[] args) {

        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum = 0;
        int max = 0;

        for(int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum sum = " + max);
    }
}