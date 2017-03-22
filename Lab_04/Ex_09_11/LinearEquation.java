package Ex_09_11;

public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getX() {
        double z = ((e * d) - (b * f));
        double y = ((a * d) - (b * c));
        return z / y;
    }

    public double getY() {
        double z = ((f * a) - (e * c));
        double x = ((a * d) - (b * c));
        return z / x;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

}
