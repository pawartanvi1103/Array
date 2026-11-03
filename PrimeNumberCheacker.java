import java.util.Scanner;
  public class PrimeNumberCheacker{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);

  System.out.print("Enetr a number:");
  int n = sc.nextInt();

  Boolean prime = true;
  if(n <= 1){
   prime = false;
  }
   else{
      for(int i =2; i <= n/i; i++){
      if(n % i == 0){
      prime = false;
      break;
}
}
}

  if(prime){
    System.out.println("Prime number");
   }else{
     System.out.println("Not prime");
  }
}
}