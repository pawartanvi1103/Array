import java.util.Scanner;
 class MissingEleArray {
   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   
   System.out.print("Enetr the size of an array :");
   int n = sc.nextInt();
   int[] arr = new int[n];
   
   System.out.print("Enter the element of an array :");
   for(int i =0 ; i <arr.length; i++){
   arr[i] = sc.nextInt();
  }
  
    System.out.print("Missing element is :");
    for(int num =1; num<=n; num++){
    boolean found = false;
  
    for(int i=0; i<arr.length; i++){
     if(arr[i] == num){
     found=true;
     break;
    }
   }
    if(!found){
      System.out.print(num + " ");

            }
        }
    }
}



