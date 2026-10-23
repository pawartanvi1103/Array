import java.util.Scanner;
 public class  SecondLargestElement{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enetr the size of an array :");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enetr the element of an array:");
  for(int i =0; i<arr.length; i++){
  arr[i] = sc.nextInt();
 }

  int largest = Integer.MIN_VALUE;
  int second = Integer.MIN_VALUE;

  for(int i=0; i<arr.length; i++){
   if(arr[i] > largest){
    second = largest;
     largest = arr[i];
  }
   else if(arr[i] > second && arr[i] != largest){
   second = arr[i];
  }
  }
    if(second == Integer.MIN_VALUE){
     System.out.println("Not found");
   }else{
     System.out.println("Second largest = " + second);
}
}
}