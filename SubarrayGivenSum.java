import java.util.Scanner;

public class SubarrayGivenSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
    int n = sc.nextInt();

   int[] arr = new int[n];

    System.out.println("Enter positive array elements:");
    for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
   }
 
   System.out.print("Enetr required sum :");
   int target = sc.nextInt();

   Boolean found = false;
   for(int i=0; i<n; i++){
   int sum =0;

  for(int j = i ; j<n; j++){
   sum += arr[j];

  if(sum == target){
   System.out.println("Subarray found from index " + i +"to" + j);
  found = true;
   break;
}

  if(sum > target){
   break;
  }
  }
   if(found){
    break;
  }
}

  if(!found){
   System.out.println("Subarray cannot found ");
}
}
}