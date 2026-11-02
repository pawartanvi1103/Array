import java.util.Scanner;
  public class TwoSumIndices{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr the size:");
   int n = sc.nextInt();
   int[] nums = new int[n];

   System.out.println("ENetr an array elemnt :");
   for(int i=0; i<n; i++){
    nums[i] = sc.nextInt();
}

   System.out.print("Enter target :");
   int target = sc.nextInt();

   for(int i=0; i<n; i++){
    for(int j= i + 1; j<n; j++){
     if(nums[i] + nums[j] == target){
      System.out.println("Indices: " + i + " , " + j);
      sc.close();
      return;
     }
     }
    }
    System.out.println("No pair found");
  }
  }