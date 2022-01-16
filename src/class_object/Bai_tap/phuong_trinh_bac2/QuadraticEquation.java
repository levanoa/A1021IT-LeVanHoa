package class_object.thuc_hanh.phuong_trinh_bac2;

public class QuadraticEquation {
    double a,b,c;
    public QuadraticEquation() {
    }
    public QuadraticEquation( double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public  double getDiscriminant() {
        double delta = (this.b *2 ) - ( 4* this.a * this.c);
        return delta;
    }
    public double getRoot1(){
        double r1 = (-this.b + Math.sqrt(Math.pow(this.b,2) - (4 * this.a *this.c))) / 2* this.a;
        return r1;
    }
    public  double getRoot2(){
        double r2 = (-this.b - Math.sqrt(Math.pow(this.b,2) - (4 * this.a *this.c))) / 2* this.a;
        return r2;
    }
    public  double getkep(){
        double r3 = -this.b / 2*this.a;
        return r3;
    }

}
