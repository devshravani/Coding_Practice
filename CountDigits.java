import java.util.Scanner;
class Count
{
    public  int countNumbers(int num)

 {
  int count=0;
  while(num>0)
   {
     count++;
    num=num/10;
   }
  return count;
 }
}
public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        Count c=new Count();
        
        System.out.println("Count of the digits is "+c.countNumbers(num));
        sc.close();

    }
}