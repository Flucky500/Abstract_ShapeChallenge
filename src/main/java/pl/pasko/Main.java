package pl.pasko;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Retangle perimeter = " + rectangle.getPerimeter());
        System.out.println("******************");

        Square square = new Square(2);
        System.out.println("Square area = " + square.getArea());
        System.out.println("Square perimeter = " + square.getPerimeter());
        System.out.println("******************");

        Circle circle = new Circle(5);
        System.out.println("Circle area = " + circle.getArea());
        System.out.println("Circle perimeter = " + circle.getPerimeter());
        System.out.println("******************");

        Triangle triangle = new Triangle(2,2,2);
        System.out.println("Triangle area = " + triangle.getArea());
        System.out.println("Triangle perimeter = " + triangle.getPerimeter());
        System.out.println("******************");










    }
}
