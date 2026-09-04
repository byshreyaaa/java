public class TriangleMain{
    public static void main(String[]args)
    {
        Triangle t=new Triangle(2,3);
        System.out.println("the area is:"+t.calculateArea());
        Triangle t1=new Triangle(2,3,4);
        System.out.println("the perimeter is:"+t1.calculatePerimeter());
    }
}
