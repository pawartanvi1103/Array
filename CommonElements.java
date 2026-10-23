import java.util.Scanner;
  public class CommonElements{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of anelement:");
  int n = sc.nextInt();
  int[] arr1 = new int[n];
  int[] arr2 = new int[n];

  System.out.print("Enether the element of an array 1:");
  for(int i =0; i<arr1.length; i++){
   arr1[i] = sc.nextInt();
}

 System.out.print("Enether the element of an array 2:");
  for(int i =0; i<arr1.length; i++){
   arr2[i] = sc.nextInt();
}
   System.out.print("Common elemnt");
  for(int i=0; i<arr1.length; i++){
    for(int j =0; j<arr2.length; j++){
     if(arr1[i] == arr2[j]){
       System.out.print(arr1[i] + " ");
       break;
     }
}
}
}
}