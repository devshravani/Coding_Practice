import java.util.Scanner;
public class palindromNo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
         while(temp > 0)
         {
            int digit = temp % 10;
            rev = (rev*10) + digit;
            temp = temp/10;
         }
         if(num==rev)
         {
            System.out.println("Palindrome number");
         }
         else
         {
            System.out.println("Not a palindrome number");
         }
     sc.close();
    }
}
