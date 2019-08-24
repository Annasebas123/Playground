import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner c = new Scanner(System.in);
      String a=c.nextLine();
      String b=c.nextLine();
      int s=c.nextInt();
      String d=a.replace(a,b);
      String arr[]=b.split(" ",s);
      for(String string : arr)
      {
        System.out.println(string);
      }
    }
}