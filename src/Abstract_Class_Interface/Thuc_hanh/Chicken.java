package Abstract_Class_Interface.Thuc_hanh;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken: cluck";
    }

    @Override
    public String howToEat() {
        return "could be fired";
    }
}
