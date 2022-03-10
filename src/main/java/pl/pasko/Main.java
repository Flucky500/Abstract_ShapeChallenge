package pl.pasko;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println("******************");

        Square square = new Square(2);
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());
        System.out.println("******************");

        Circle circle = new Circle(5);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println("******************");

        Triangle triangle = new Triangle(2,2,2,1);
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter = " + triangle.getPerimeter());
        System.out.println("******************");










    }
}
