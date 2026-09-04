 public class Ntone
 {
    private static int n=3;
    private static int count;
    private static Ntone arr[]=new Ntone[n];

    private static int index=0;

    private int data;

    private Ntone(int data)
    {
        this.data=data;
    }
    public String toString()
    {
        return "Data:"+data;
    }
    public static Ntone createobj(int data)
    {
        if(count<n)
        {
            arr[count]=new Ntone(data);
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
