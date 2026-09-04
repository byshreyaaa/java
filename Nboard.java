public class Nboard
{
    private static int n=3;
    private static int count;
    private static Nboard arr[]=new Nboard[n];

    private static int index=0;

    private int data;

    private Nboard(int data)
    {
        this.data=data;
    }
    public String toString()
    {
        return "Data:"+data;    
    }
    public static Nboard createobj(int data)
    {
        if(count<n)
        {
            arr[count]=new Nboard(data);
            return arr[count++];
        }
        else
        {
            int ret=index;
            index=(index+1)%n;
            return arr[ret];
        }
    }
}