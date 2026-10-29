import java.util.Scanner;

public class TopThreeValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
           
        }
    
       for(int i=0; i<arr.length; i++){
         for(int j = i + 1; j<arr.length; j++){
         if(arr[i] < arr[j]){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
       }
      }
      }
 
       System.out.println("Top three values:");
       for(int i =0; i<3 && i<arr.length; i++){
        System.out.print(arr[i] + " ");
     }
    }
   
}






