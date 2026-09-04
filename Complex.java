public class Complex {
    private float a;
    private float b;

    
    public Complex(float a, float b) {
        this.a = a;
        this.b = b;
    }

    
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.a + c2.a, c1.b + c2.b);
    }

    
    public static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.a - c2.a, c1.b - c2.b);
    }

    
    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex(
            c1.a * c2.a - c1.b * c2.b,
            c1.a * c2.b + c1.b * c2.a
        );
    }

    
    public static Complex divide(Complex c1, Complex c2) {
        return new Complex(
            (c1.a * c2.a + c1.b * c2.b) / (c2.a * c2.a + c2.b * c2.b),
            (c1.b * c2.a - c1.a * c2.b) / (c2.a * c2.a + c2.b * c2.b)
        );
    }

    
    public String toString() {
        return this.a + " + i" + this.b;
    }
}