import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int list[] = new int[len];
        for(int index = 0;index < len; index++)
        {
            list[index] = sc.nextInt();   
        }
        first_half_bubble_sort(len,list);
      }    
    public static void first_half_bubble_sort(int len,int list[])
    {
      int half_size = len/2;
      for (int idx1 = 0; idx1 <= half_size-2; idx1++) 
        {
        for (int idx2 = 0; idx2 <= half_size-2-idx1; idx2++)
        {
          if(list[idx2] > list[idx2 + 1])
          {
            int temp = list[idx2 +1];
            list[idx2 + 1] = list[idx2];
            list[idx2] = temp;
          }
        }
      }
      for(int i = 0; i < len; i++)
      {
        System.out.print(list[i] + " ");
      }
    }
}