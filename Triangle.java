
/**
 * Write a description of class Triangle here.
 *
 * @author (David Gyuricsko)
 * @version (12.01.2026)
 */
public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        super("Triangle");
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("All sides must be > 0");
        }
        // Triangle inequality check
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Invalid triangle sides");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    @Override
    public double area() {
        // Heron's formula
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}