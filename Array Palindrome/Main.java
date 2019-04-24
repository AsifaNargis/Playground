import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
      int a[] = new int[n];
      for(int i = 0; i<n; i++)
      {
        a[i] = in.nextInt();
      }
      int is_palindrom = 1;
      int front_idx = 0;
      int end_idx = n-1;
      while(front_idx <= end_idx)
      {
        if(a[front_idx] != a[end_idx])
        {
          is_palindrom = 0;
        }
        front_idx++;
        end_idx--;
      }
      if(is_palindrom == 1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}


