import java.util.Scanner;
  public class SelectionSortFindSmallEle{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enter array size :");
   int n = sc.nextInt();
   int[] arr = new int[n];

   System.out.println("Enter array elemnt :");
   for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
  }

   int min =0; 
   for(int j=1; j<n; j++){
    if(arr[j] < arr[min]){
    min = j;
  }
}

  System.out.println("Smallest elemnt =" + arr[min]);
}
}