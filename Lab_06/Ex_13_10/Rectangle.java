package Ex_13_10;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width * height);
    }

    public int compareTo(Rectangle obj) {
        if (this.getArea() == obj.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean equals(Rectangle obj) {
        return this.compareTo(obj) == 1;
    }

    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}