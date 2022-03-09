package pl.pasko;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Rectangle area = " + rectangle.getArea());
        System.out.println("Rectangle perimeter = " + rectangle.getPerimeter());

        Square square = new Square(2,3);
        System.out.println("Area of a square L:2, W:2 = " + square.getArea());
        System.out.println("Area of a square L:2, W:2 = " + square.getPerimeter());



    }
}
