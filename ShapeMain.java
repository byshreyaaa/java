import java.util.Scanner;
public class ShapeMain
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int ch=0;
        Shape s=null;
        System.out.println ("[1]Circle, [2]Triangle:");
        ch=sc.nextInt();

        if(ch==1)
        {
            s=new Circle(7);
        }
        else if(ch==2)
        {
            s=new Tri(2,3);
        }
         else
        {
            System.out.println("Invalid choice");
        }
       System.out.println("Area Type:"+s.getShapeName()+"Area:"+s.getArea());
    }
}