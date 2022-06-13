package thuc_hanh.static_access_modifier.task_1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student(132, "long");
        student1.display();
        Student student2 = new Student(456, "long1");
        Student student3 = new Student(789, "long2");
        Student.change();
        student1.display();
        student2.display();
        student3.display();
    }
}
