import java.util.Scanner;
 public class DynamicSlindingWindow{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter array elemnt:");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

 System.out.println("Enter target :");
 int target = sc.nextInt();

 int sum = 0;
 int left = 0;
 int minlength = Integer.MAX_VALUE;

//expand
 for(int right = 0; right < n; right++){
 sum = sum + arr[right];

  //shrink

 while(sum >= target){
 int length = right - left + 1;
 if(length < minlength){
 minlength = length;
}

sum = sum - arr[left];
left++;
}
}

System.out.println("Minimum length : " + minlength);
}
}
  



 





