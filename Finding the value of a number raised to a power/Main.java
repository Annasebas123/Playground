import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner b = new Scanner(System.in);
      
      int base = b.nextInt();
      int exp = b.nextInt();
      int sum=1;
      for(int i=1;i<=exp;i++)
      {
        sum=sum*base;
      }
      System.out.println(sum);
    }
}
