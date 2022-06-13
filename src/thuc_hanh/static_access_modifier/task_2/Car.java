package thuc_hanh.static_access_modifier.task_2;

public class Car {
    private String name;
    private long price;
    private static int total = 0;
    Car(String name, long price){
        this.name = name;
        this.price = price;
        total++;
    }
    public void display(){
        System.out.println(name + " : " + price);
        System.out.println("total cars: " + total);
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW",100000000);
        car1.display();
        Car car2 = new Car("Honda",5000000);
        car2.display();
        Car car3 = new Car("Toyota",99990000);
        car3.display();
    }
}
