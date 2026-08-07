import java.util.Scanner;
public class PrimeNumbers
{

    public static boolean isPrime(int num) {
      boolean isPrime =true;
      if(num<=1)
      {
        return false;
      }
      else{
    
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
            isPrime = false;
            break;
        }

      }
    }
    return isPrime;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter any number");
    int num=sc.nextInt();
     if(isPrime(num))
     {
        System.out.println("The number is Prime");
     }
     else
     {
        System.out.println("The number is not Prime");
     }
   sc.close();
}
}