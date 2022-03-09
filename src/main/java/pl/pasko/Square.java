package pl.pasko;

public class Square extends Rectangle{

    private int length;
    private int width;

    public Square(int length, int width) {
        super(length, width);
        if(length == width){
            this.length = this.width;
        } else {
            System.out.println("Length does not equal width. This is not a square");

        }
    }

}
