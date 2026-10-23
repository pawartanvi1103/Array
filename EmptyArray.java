import java.util.Scanner;
 public class EmptyArray{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr the size of an array:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.print("Enter the element of an array :");
  for(int i=0; i<arr.length; i++){
  arr[i] =  sc.nextInt();
}

 if (arr.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array is not empty");
        }
    }
}