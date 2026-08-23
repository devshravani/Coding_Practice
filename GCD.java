import java.util.Scanner;
public class GCD {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println("Common Factors: "+i);
                gcd=i;
            }
        }
        System.out.println("The GCD of "+a+" and "+b+" is: "+gcd);
       sc.close();
    }
}
