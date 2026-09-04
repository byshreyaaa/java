public class Calculator
{
    private int a;
    private int b;

    public Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public int getA()
    {
        return a;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public int getB()
    {
        return b;
    }
    public void setB(int B)
    {
        this.b=b;
    }
    public static int add (Calculator c1, Calculator c2)
    {
        return c1.a+c2.a;
    }
    public static int subtract(Calculator c1,Calculator c2)
    {
        return c1.a-c2.a;
    }
    public static int multiply(Calculator c1,Calculator c2)
    {
        return c1.a*c2.a;
    }
    public static int divide(Calculator c1,Calculator c2)
    {
        return c1.a/c2.a;
    }
}
