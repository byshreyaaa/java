public class CalculatorMain
{
    public static void main(String[]args)
    {
        Calculator c1=new Calculator(20,10);
        Calculator c2=new Calculator(10,5);

        System.out.println("Addition="+Calculator.add(c1,c2));
        System.out.println("Subtraction="+Calculator.subtract(c1,c2));
        System.out.println("Multiplication="+Calculator.multiply(c1,c2));
        System.out.println("Division="+Calculator.divide(c1,c2));

    }
}
