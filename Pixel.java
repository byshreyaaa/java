public class Pixel extends Point 
{
    private int colorCode;

    public Pixel(int x,int y,int colorCode)
    {
        super(x,y);
        this.colorCode=colorCode;
    }
    public void display()
    {
        super.display();
        System.out.println("Color Code:"+colorCode);
    }
}

