package test.crud;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String classes;

    public Student(int id, String name, int age, String address, String classes) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.classes = classes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
