import java.util.Scanner;
  public class MergeTwoArray{
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   System.out.print("Enetr the size of first array :");
   int n = sc.nextInt();
   int[] arr1 = new int[n];

   System.out.println("Enetr the elemnt of first array :");
   for(int i=0; i<n; i++){
   arr1[i] = sc.nextInt();
  }

    System.out.print("Enetr the size of second array :");
   int m = sc.nextInt();
   int[] arr2 = new int[m];

   System.out.println("Enetr the elemnt of second array :");
   for(int i=0; i<n; i++){
   arr2[i] = sc.nextInt();
  }

  int[] merged = new int[n + m];

  for(int i=0; i<n; i++){
  merged[i] = arr1[i];
  }

  for(int i=0; i<m; i++){
  merged[n + i] = arr2[i];
  }

  System.out.println("Merged array:");
  for(int i=0; i<merged.length; i++){
  System.out.print(merged[i] + " ");

  }
  }
  }