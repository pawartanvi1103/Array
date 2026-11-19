import java.util.Scanner;
  public class SelctionSortDecending{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int[] arr = {10 , 50 , 20 , 40 , 30};
   
   for(int i=0; i<arr.length; i++){
   int max = i;

   for(int j= i+1; j<arr.length; j++){
   if(arr[j] > arr[max]){
   max = j;
  }
}

  int temp = arr[i];
  arr[i] = arr[max];
  arr[max] = temp;
}

  for(int x : arr){
   System.out.print(x + " ");
}
}
}