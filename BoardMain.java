public class BoardMain
{
    public static void main(String[]args)
    {
        Board b1=Board.createobj(8,8);
        System.out.println(b1);
        Board b2=Board.createobj(6,6);
        System.out.println(b2);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }

}
    

