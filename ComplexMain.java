public class ComplexMain {
    public static void main(String[] args) {

        Complex c1 = new Complex(2, 7);
        Complex c2 = new Complex(5, 9);

        Complex c3 = Complex.add(c1, c2);
        Complex c4 = Complex.subtract(c1, c2);
        Complex c5 = Complex.multiply(c1, c2);
        Complex c6 = Complex.divide(c1, c2);

        System.out.println("Addition = " + c3);
        System.out.println("Subtraction = " + c4);
        System.out.println("Multiplication = " + c5);
        System.out.println("Division = " + c6);
    }
}