package thuc_hanh.abstraction_interface.task1;

public class Chicken extends Animal implements Edible{

    @Override
    String makeSound() {
        return "chicken: ò ó o";
    }

    @Override
    public void howToEat() {
        System.out.println("chicken could be fried");
    }
}
