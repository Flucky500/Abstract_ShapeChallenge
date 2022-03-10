package pl.pasko;

public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double heightA;

    @Override
    double getArea() {
        return ((sideA * heightA)/2);
    }

    @Override
    double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getHeightA() {
        if (heightA == 2 * getArea() / sideA) {
            return heightA;
        } else {
            System.out.println("Invalid height value. This is not a triangle");
            return -1;
        }
    }

    public Triangle(double sideA, double sideB, double sideC, double heightA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.heightA = heightA;

        if ((sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) || heightA <= 0) {
            System.out.println("This is not a triangle");
            this.sideA = 0;
            this.sideB = 0;
            this.sideC = 0;
            this.heightA = 0;

        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.heightA = heightA;
        }


    }
}


