import java.util.Scanner;
 public class PairSum{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

    System.out.println("Enter array elements:");
     for (int i = 0; i < n; i++) {
     arr[i] = sc.nextInt();
   }

   System.out.print("Enetr the target sum:");
   int target = sc.nextInt();
   Boolean found = false;

   for(int i =0; i<n; i++){
      for(int j=i+1; j<n; j++){
       if(arr[i] + arr[j] == target){
       System.out.println(arr[i] + " + " + arr[j] + " = " + target);
      found = true;
}
}
}
  if(!found){
    System.out.print("No pair found ");
  }
}
}

