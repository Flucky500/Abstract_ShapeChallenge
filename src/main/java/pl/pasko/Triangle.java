package pl.pasko;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if ((sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA)) {
            System.out.println("This is not a triangle");
            this.sideA = 0;
            this.sideB = 0;
            this.sideC = 0;
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    @Override
    double getArea() {
        double area;
        double p = ((sideA + sideB + sideC) / 2);
        area = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));

        return area;
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }
}


