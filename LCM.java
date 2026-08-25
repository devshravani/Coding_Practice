import java.util.Scanner;
public class LCM
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        int lcm=(a>b) ? a:b;

        while(true)
          {
           if(lcm % a==0 && lcm % b==0)
        {
            break;
        }
        lcm++;
    }
        System.out.println("The LCM of "+a+ " and "+b+ " is: " +lcm);
      sc.close();

    }
}