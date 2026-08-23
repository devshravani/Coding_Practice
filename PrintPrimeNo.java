import java.util.Scanner;
public class PrintPrimeNo {
    public static boolean inPrime(int num)
    {
     if(num<=1)
     {
        return false;
     }
     else
     {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return false;
               
            }
        }
     }
     return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st range");
        int a=sc.nextInt();
        System.out.println("Enter 2nd range");
        int b=sc.nextInt();
       System.out.println("Prime numbers between " +a+ " and "+b);
       for(int i=a;i<=b;i++)
       {
        if(inPrime(i))
        {
            System.out.println(i);
        }
       }
       sc.close();
    }
}
