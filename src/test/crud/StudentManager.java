package test.crud;

import java.util.Scanner;

public class StudentManager {
    private static int total = 0;
    private static Student[] students = new Student[100];

    public static void choose() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println(" 1. Add student.  " +
                    "\n 2. Delete student.  " +
                    "\n 3. Edit profile. " +
                    "\n 4. search." +
                    "\n 0. Exit.");
            choose = scanner.nextInt();
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
                default:
                    System.out.println("End.");
            }
            if (choose < 0 || choose > 3) {
                System.out.println("choose again(just enter from 0 to 3)");
            }
        } while (choose < 0 || choose > 3);

    }

    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter class:");
        String classes = scanner.nextLine();
        Student student = new Student(id, name, age, address, classes);
        for (int i = 0; i < 100; i++) {
            if (students[i] == null) {
                students[i] = student;
                total++;
                break;
            }
        }
        display();
    }

    public static void display() {
        for (int i = 0; i < 100; i++) {
            if (total == 0) {
                System.out.println("there is no student.");
                break;
            } else {
                System.out.println("id:" + students[i].getId() + ",name: " + students[i].getName() + ",age: " + students[i].getAge() +
                        ", address: " + students[i].getAddress() + ", class: " + students[i].getClasses() + "\n");
            }
        }
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's id you want to delete:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 100; i++) {
            if (id == students[i].getId()) {
                System.arraycopy(students, i + 1, students, i, 100 - i);
            }
        }
        display();
    }

    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's id you want to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < 100; i++) {
            if (students[i].getId() == id) {
                System.out.println("change name:");
                students[i].setName(scanner.nextLine());
                System.out.println("change age:");
                students[i].setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("change address:");
                students[i].setAddress(scanner.nextLine());
                System.out.println("change class:");
                students[i].setClasses(scanner.nextLine());
            }
        }
        display();
    }

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's id you want to search:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("name: " + student.getName() + ", age: " + student.getAge() +
                        ", address: " + student.getAddress() + ", class: " + student.getClasses());
            }
        }
    }

    public static void main(String[] args) {
        display();
        choose();
    }
}
