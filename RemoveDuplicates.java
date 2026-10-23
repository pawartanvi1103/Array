import java.util.Scanner;
  public class RemoveDuplicates{
   public static void main (String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr the size of an array :");
   int n= sc.nextInt();
   int[] arr = new int[n];

   System.out.print("Enetr the element of an array :");
   for(int i =0; i<arr.length; i++){
   arr[i] = sc.nextInt();
 }

  for(int i=0; i<arr.length; i++){
  Boolean duplicate = false;

  for(int j=0; j<i;  j++){
   if(arr[i] == arr[j]){
   duplicate = true;
   break;
  }
}

if(!duplicate){
   System.out.print(arr[i] + " ");
}
}
}
}