import java.util.*;
/**
*
* @author USER-pc
*/
public class Lab43 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
double a,b,c,d,e,f;
Scanner sc = new Scanner(System.in);
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
d = sc.nextDouble();
e = sc.nextDouble();
f = sc.nextDouble();
LinearEquation heeeeee = new LinearEquation(a,b,c,d,e,f);
if(heeeeee.isSolvable()==true){
System.out.println("x is");
System.out.println(heeeeee.getX());
System.out.println("y is");
System.out.println(heeeeee.getY());
}
else{
System.out.println("The equation has no solution");
}
}

}
class LinearEquation{
private double a,b,c,d,e,f;

public LinearEquation(double a, double b, double c, double d, double e, double f) {
this.a = a;
this.b = b;
this.c = c;
this.d = d;
this.e = e;
this.f = f;
}
public boolean isSolvable(){
if((a*d-b*c)!=0){
return true;
}
else{return false;}
}
public void setA(double a) {
this.a = a;
}

public void setB(double b) {
this.b = b;
}
public double getX(){
double z,y,x;
z = ((e*d)-(b*f));
y = ((a*d)-(b*c));
x = z/y;
return x;
}
public double getY(){
double z,y,x;
z = ((f*a)-(e*c));
x = ((a*d)-(b*c));
y = z/x;
return y;
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
17 
