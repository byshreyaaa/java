public class NModel
{
    private int numRow;
    private int numCol;
    private static int n=3;
    private static int count;
    private static NModel arr[]=new NModel[n];

    private static int index=0;

    private NModel(int numRow,int numCol)
    {
        this.numRow=numRow;
        this.numCol=numCol;
    }
    public String toString()
    {
        return "Board:"+numRow+"X"+numCol;
    }
    public static NModel createobj(int numRow,int numCol)
    {
        if(count<n)
        {
            arr[count]=new NModel(numRow,numCol);
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
