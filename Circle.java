public class Circle extends Shape
{
    private double r;
    private static final double pi=3.14;
    public Circle(double r)
    {
        super("Circle");
        this.r=r;
    }
    public double getArea()
    {
        return pi*this.r*this.r;
    }
}
