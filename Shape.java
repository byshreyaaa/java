public abstract class Shape
{
    private String shapeName;
    public Shape(String shapename)
    {
        this.shapeName=shapeName;
    }
    public String getShapeName()
    {
        return shapeName;
    }
    public abstract double getArea();
}
