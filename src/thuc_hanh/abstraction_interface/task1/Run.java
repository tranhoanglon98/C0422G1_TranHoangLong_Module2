package thuc_hanh.abstraction_interface.task1;

public class Run {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Chicken chicken = new Chicken();
        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println(tiger.makeSound());
        chicken.howToEat();
        apple.howToEat();
        orange.howToEat();

    }
}
