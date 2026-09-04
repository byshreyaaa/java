public class Triangle
{
    private float base;
    private float height;
    private float side1;
    private float side2;
    private float side3;
    public Triangle(float base,float height)
    {
        this.base=base;
        this.height=height;
    }
    public float getbase()
    {
        return this.base;
    }
    public void setbase(float base)
    {
        this.base=base;
    }
    public float getheight()
    {
        return this.height;
    }
    public void setheight(float height)
    {
        this.height=height;
    }
    public Triangle(float side1,float side2,float side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public float getside1()
    {
        return this.side1;
    }
    public void setside1(float side1)
    {
        this.side1=side1;

    }
    public float getside2()
    {
        return this.side2;
    }
    public void setside2(float side2)
    {
        this.side2=side2;
    }
    public float getside3()
    {
        return this.side3;
    }
    public void setside3(float side3)
    {
        this.side3=side3;
    }
     public float calculateArea()
    {
        return 0.5f*this.base*this.height;
    }
    public float calculatePerimeter()
    {
        return this.side1+this.side2+this.side3;
    }
}

