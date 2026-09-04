public class Tri extends Shape
{
    private double b;
    private double h;
    public Tri(double b,double h)
    {
        super("Triangle");
        this.b=b;
        this.h=h;
    }
    public double getArea()
    {
        return 0.5*b*h;
    }
}