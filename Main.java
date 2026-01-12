
/**
 * Write a description of class Main here.
 *
 * @author (David Gyuricsko)
 * @version (12.01.2026)
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(3),
            new Rectangle(4, 6),
            new Triangle(3, 4, 5)
        };

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}