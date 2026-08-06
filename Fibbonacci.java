public class Fibbonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=a+b;
        for(int i=0;i<=10;i++)
        {
        System.out.println(c+"");
         c=a+b;
        a=b;
        b=c;
        }
    }
}
