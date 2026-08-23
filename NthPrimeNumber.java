import java.util.Scanner;
public class NthPrimeNumber
{
    public static boolean isPrime(int num)
    {
      if(num <2)
      {
        return false;
      }
      for(int i=2;i<=num/2;i++)
      {
        if(num%i==0)
        {
            return false;
        }
      }
      return true;

    }
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int count=0;
      int number=1;
      while(count < n) 
      {
        number++;
        if(isPrime(number))
        {
            count++;
        }

      }
      System.out.println("The "+n+ "th prime number is "+number);
      sc.close();
    }

}