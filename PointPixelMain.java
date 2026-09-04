import java.util.Scanner;
public class PointPixelMain
{
    public static void main(String[]args)
    {
        Point p1=new Point(2,3);
        p1.display();
        p1=new Pixel(20,30,40);
        p1.display();
        Scanner sc=new Scanner(System.in);
        Point p=null;
        int ch=0;
        System.out.println("for point press 1,for pixel press 2:");
        ch=sc.nextInt();
        if(ch==1)
        {
            p=new Point(2,3);

        }
        else
        {
            p=new Pixel(20,30,100);
        }
        p.display();
    }
}