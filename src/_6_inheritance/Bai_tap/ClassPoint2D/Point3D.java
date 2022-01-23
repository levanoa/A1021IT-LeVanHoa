package _6_inheritance.Bai_tap.ClassPoint2D;

class Point3De extends Point2d {
    private float z = 0.0f;

    public Point3De(){
    }
    public Point3De(float x,float y ,float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z =z;
    }

    public float[] getXYZ() {
       float[] res = new float[]{getX(),getY(),z};
        return  res;
    }

    public String toString() {
        return "Point3De{" + "z=" + z + " x=" + super.getX() + " y="+ super.getY()+ '}';
    }
}
