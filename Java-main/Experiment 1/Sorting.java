import java.util.*;
class Sorting{

public static void main(String[] args){
  int[] arr = new int[20];
  Scanner scanner =new Scanner(System.in);
  System.out.println("Enter No. of array element");
  int n=scanner.nextInt();
  System.out.println("Enter array element");
  for(int i=0;i<n;i++){
        arr[i]=scanner.nextInt();
  }
  
  for (int i = 0; i < n - 1; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
              
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
		}
		}
		}
		
		System.out.println(" Array element");
		for(int i=0;i<n;i++){
         System.out.println(arr[i]);
  }

}
}