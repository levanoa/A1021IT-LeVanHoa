package class_object.Bai_tap.Fan;

public class Fan {
   final int slow=1;
   final int medium=2;
   final int fast=3;
   int speed = slow;
   private boolean on = false;
   private double radius = 5;
   private String color = "blue";
   public Fan(){

   }
//   public Fan (int speed, double radius, String color, boolean on) {
//      this.speed =speed;
//      this.radius = radius;
//      this.color = color;
//      this.on = on;
//   }

   public int getSpeed() {
      return speed;
   }

   public void setSpeed(int speed) {
      this.speed = speed;
   }

   public boolean isOn() {
      return on;
   }

   public void setOn(boolean on) {
      this.on = on;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   @Override
   public String toString() {
      if(on) {
         return "Fan{" + ", speed=" + speed +
              ", on=" + on +
              ", radius=" + radius +
              ", color='" + color + '\'' + " fan is on" +
              '}';
     }
      return  "Fan{" + ", radius=" + radius + ", color='" + color + '\'' + "fan is of" +'}';
   }

}
