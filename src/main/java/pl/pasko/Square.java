package pl.pasko;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }
    public double getPerimeter(){
        return 4 * side;
    }
}


