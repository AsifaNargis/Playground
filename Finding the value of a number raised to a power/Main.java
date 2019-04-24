import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
       int res = 1;
        while(exponent > 0)
        {
          res = res * base;
          exponent--;
        }
        System.out.println(res);
    }
}