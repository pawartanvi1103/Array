import java.util.Scanner;
  public class TwoPointer{
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

   System.out.print("Enter array size :");
   int n = sc.nextInt();
   int[] arr = new int[n];

   System.out.println("Enter array elemnt :");
   for(int i=0; i<arr.length; i++){
   arr[i] = sc.nextInt();
   }

   System.out.println("Enter target :");
   int target = sc.nextInt();

   int left =0;
   int right = arr.length-1;

   while(left < right){
    int sum = arr[left] + arr[right];

   if(sum == target){
    System.out.println(arr[left] + "+" + arr[right]);
    left++;
    right--;
   }

   else if(sum < target){
       left++;
   }
   else{
       right--;
}
}
}
}








