package _6_inheritance.Bai_tap.ClassMoveablePoint;

public class Point {
    private float x = 12.0f;
    private float y = 33.0f;
    public Point(){

    }
    public Point(float x,float y ) {
        this.x = x;
        this.y = y;
    }


    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
//    public float getXY() {
//        return x;
//    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
