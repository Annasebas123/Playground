import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
         Scanner b = new Scanner(System.in);
      int option=b.nextInt();
      double PI=3.1399999999999999;
      switch(option)
      {
          case 1:
          
             int side=b.nextInt();
            int area_sq=side*side;
            System.out.println(area_sq);
            break;
          
      case 2:
      
       int l=b.nextInt(); 
          int breadth=b.nextInt();
       int area_rect=l*breadth;
        System.out.println(area_rect);
        break;
      
      case 3:
      
        int base=b.nextInt();
         int h=b.nextInt();
        int area_tri=(base*h)/2;
        System.out.println(area_tri);
        break;
      
      case 4:
      
        int radius=b.nextInt();
        double area_cri=radius*radius*PI;
        System.out.println(area_cri);
        break;
      
    }
    }
}