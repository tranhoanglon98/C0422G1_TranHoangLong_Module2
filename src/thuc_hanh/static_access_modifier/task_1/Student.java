package thuc_hanh.static_access_modifier.task_1;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BK";
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.println(rollno + " name: " + name + " college: " + college);
    }
}
