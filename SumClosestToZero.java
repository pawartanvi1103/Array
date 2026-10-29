import java.util.Scanner;

public class SumClosestToZero {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size: ");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter array elements:");
   for (int i = 0; i < n; i++) {
   arr[i] = sc.nextInt();
 }

  if(n < 2){
   System.out.println("At least two elemnt are required ");
   sc.close();
   return;
  }

  int first = arr[0];
  int second = arr[1];
  int closestSum = arr[0] + arr[1];

  for(int i=0; i<n; i++){
    for(int j= i + 1; j<n; j++){
    int sum = arr[i] + arr[j];

  if(Math.abs(sum) < Math.abs(closestSum)){
  closestSum = sum;
  first = arr[i];
  second = arr[j];
  }
  }
 }

  System.out.println("Elements: " + first + " and " + second);
   System.out.println("Sum:" + closestSum);
  }
}


