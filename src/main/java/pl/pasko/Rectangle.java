package pl.pasko;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
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
    public int getArea() {
        return length * width;

    }

    @Override
    public int getPerimeter() {
        return (2*length) + (2*width);

    }
}
