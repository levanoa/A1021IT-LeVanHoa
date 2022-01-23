package _4_class_object.Bai_tap.Fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        System.out.println(fan1.toString());
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.medium);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println(fan2.toString());


    }
}
