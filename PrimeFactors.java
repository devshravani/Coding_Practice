import java.util.Scanner;
public class PrimeFactors {
    public static void main(String[] args)
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter any number: ");
      int n=sc.nextInt();
      System.out.println("The prime Factors of "+n+ " are : ");
       int i=2;
       while(n>1)
       {
        if(n%i==0)
        {
            System.out.println(i+" ");
            n=n/i;
        }
        else
        {
            i++;
        }
    }
    System.out.println();
    sc.close();
  }
}