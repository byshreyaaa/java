public class Board
{
    private int numRow;
    private int numCol;
    public static Board obj=null;
    private Board(int numRow,int numCol)
    {
        this.numRow=numRow;
        this.numCol=numCol;
    }
    public static Board createobj(int numRow,int numCol)
    {
        if(obj==null)
        {
            obj=new Board(numRow,numCol);

        }
        else
        {
            obj.numRow=numRow;
            obj.numCol=numCol;
        }
        return obj;
    }
    public String toString()
    {
        String st1=" ";
        st1="numRow:"+this.numRow;
        st1=st1+"\nnumCol:"+this.numCol;
        return st1;
    }
    
}
