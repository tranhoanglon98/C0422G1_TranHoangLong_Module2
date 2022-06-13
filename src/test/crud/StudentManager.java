package test.crud;

import java.util.Scanner;

public class StudentManager {
    private static int total = 0;
    private static final Student[] students = new Student[100];

    public static void choose() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(" 1. Add student.  " +
                    "\n 2. Delete student.  " +
                    "\n 3. Edit profile. " +
                    "\n 4. search." +
                    "\n 5. show students list." +
                    "\n 0. Exit.");
            do {
                choose = scanner.nextInt();
                if (choose < 0 || choose > 5) {
                    System.out.println("choose again(just enter from 0 to 4)");
                }
            } while (choose < 0 || choose > 5);


            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    display();
                    break;
                default:
                    System.out.println("End.");
            }
        } while (choose != 0);

    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        int id;
        boolean flag;
        do {
            flag = false;
            System.out.print("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            for (Student student : students) {
                if (student == null) {
                    break;
                } else if (student.getId() == id) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println(id + " already exist, enter id again: ");
            }
        } while (flag);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter class: ");
        String classes = scanner.nextLine();
        Student student = new Student(id, name, age, address, classes);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                total++;
                break;
            }
        }
        System.out.println("total of students: " + total);
        System.out.println("********************************************");
    }

    public static void display() {
        System.out.println("********************************************");
        for (int i = 0; i < students.length - 1; i++) {
            if (total == 0) {
                System.out.println("there is no student.");
                break;
            } else {
                if (students[i] == null) {
                    break;
                }
                System.out.println("id:" + students[i].getId() + ",name: " + students[i].getName() + ",age: " + students[i].getAge() +
                        ", address: " + students[i].getAddress() + ", class: " + students[i].getClasses());
                System.out.println("********************************************");
            }
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's id you want to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < students.length; i++) {
            if (id == students[i].getId()) {
                if (i == students.length - 1) {
                    students[i] = null;
                } else {
                    System.arraycopy(students, i + 1, students, i, students.length - 1 - i);
                    students[students.length - 1] = null;
                    total--;
                    break;
                }
            }
        }
        System.out.println("total of students: " + total);
        System.out.println("********************************************");
    }

    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's id you want to edit: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 100; i++) {
            if (students[i] == null) {
                break;
            } else if (students[i].getId() == id) {
                System.out.print("change name: ");
                students[i].setName(scanner.nextLine());
                System.out.print("change age: ");
                students[i].setAge(Integer.parseInt(scanner.nextLine()));
                System.out.print("change address: ");
                students[i].setAddress(scanner.nextLine());
                System.out.print("change class: ");
                students[i].setClasses(scanner.nextLine());
                break;
            }
        }
        System.out.println("total of students: " + total);
        System.out.println("********************************************");
    }

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's id you want to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean flag = true;
        for (Student student : students) {
            if (student == null) {
                break;
            } else if (student.getId() == id) {
                flag = false;
                System.out.println("name: " + student.getName() + ", age: " + student.getAge() +
                        ", address: " + student.getAddress() + ", class: " + student.getClasses());
                break;
            }
        }
        if (flag) {
            System.out.println("there is no student has id " + id);
        }
    }

    public static void main(String[] args) {
        choose();
    }
}
