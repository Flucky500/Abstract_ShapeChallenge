package pl.pasko;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        if(length <= 0){
            this.length = 0;
        } else {
            this.length = length;
        }

        if(width <= 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    @Override
    public double getArea() {
        return length * width;

    }

    @Override
    public double getPerimeter() {
        return (2*length) + (2*width);

    }
}
