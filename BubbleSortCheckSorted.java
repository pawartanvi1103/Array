import java.util.Scanner;
  public class BubbleSortCheckSorted{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enter array size:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter array element :");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

  Boolean sorted = true;
  for(int i=0; i<n-1; i++){
   if(arr[i] > arr[i+1]){
   sorted = false;
   break;
}
}


if(sorted){
System.out.println("Array is already sorted");
}else{
  System.out.println("Not sorted");
}
}
}
  