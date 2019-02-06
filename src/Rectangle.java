public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;

    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setwidth(double width) {
        this.width = width;
    }

    public double getArea(double area) {
        return length * width;
    }

    public double getDiagonal(double diagonal) {
        return Math.sqrt((length * length) + (width * width));
    }

    public isSquare(double square) {
        if((width * width) == (length * length)) {
            system.out.println("It is a square");
        } else {
            system.out.println("It is not a square");
        }
    }

}
