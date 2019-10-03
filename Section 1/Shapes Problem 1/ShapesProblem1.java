import java.util.Scanner;

public class ShapesProblem1 {

    public ShapesProblem1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 for triangle, 2 for square, 3 for circle: ");
        int pick = scan.nextInt();
        if (pick == 1) {
            System.out.println("Please enter triangle base and height: ");
            double base = scan.nextDouble();
            double height = scan.nextDouble();
            double area = Triangle(base, height);
            System.out.println("Triangle area = " + area);
        } else if (pick == 2) {
            System.out.println("Please enter length of the square side: ");
            double length = scan.nextDouble();
            double area = Square(length);
            System.out.println("Square area = " + area);
        } else {
            System.out.println("Please enter radius of the circle: ");
            double radius = scan.nextDouble();
            double area = Circle(radius);
            System.out.println("Circle area = " + area);
        }
    }

    public static double Triangle(double b, double h) {
        double area = 0.5 * b * h;
        return area;
    }

    public static double Square(double l) {
        double area = l * l;
        return area;
    }

    public static double Circle(double r) {
        double area = Math.PI * r * r;
        return area;
    }
}
