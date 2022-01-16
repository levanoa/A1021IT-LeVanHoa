package Access_modifier.Thuc_Hanh.StaticProperty;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("MEC","Sky");
        System.out.println(Car.numberOfCars);
        Car car1 = new Car("toyota", "sky2");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("toyota", "sky2");
        System.out.println(Car.numberOfCars);
        Car car4 = new Car("toyota", "sky2");
        System.out.println(Car.numberOfCars);
    }
}
