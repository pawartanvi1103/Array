import java.util.Scanner;

  public class SelectionSortFindSecondSmallEleUseScanner{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter array size :");
   int n = sc.nextInt();
   int[] arr = new int[n];

   System.out.println("Enter array elemnt :");
   for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
  }
  
   for(int i=0; i<n-1; i++){
   int min = i;  
   for(int j=i+1; j<n; j++){
   if(arr[j] < arr[min]){
   min = j;
   }
}

  int temp = arr[i];
  arr[i] = arr[min];
  arr[min] = temp;
}

  Boolean found = false;

  for(int i=1; i<n; i++){
   if(arr[i] != arr[0]){
   System.out.print("Second Smallest = " + arr[i]);
   found = true;
   break;
   }
   }

   if(!found){
    System.out.println("Second can not exit");
}
  }
 }