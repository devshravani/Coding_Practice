import java.util.Scanner;
class EvenOdd {
    public static void Even(int a)
     {
        if(a%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        Even(a);
        sc.close();
    }
}
