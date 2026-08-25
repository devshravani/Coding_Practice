import java.util.Scanner;
public class NthFibbonacci {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth value to find fibbonacci number: ");
        int n=sc.nextInt();
        if(n<=0 || n==1)
        {
            System.out.println("Enter positive number, Greater than 1 ");
        }
        else
        {
            int prev=0;
            int curr=1;
            int result=0;
            for(int i=2;i<=n;i++)
            {
                result = prev + curr;
                prev=curr;
                curr=result;
            }
            System.out.println("The "+n+ "th fibbonacci number is: "+result);
        }
    
        sc.close();
    }
}
