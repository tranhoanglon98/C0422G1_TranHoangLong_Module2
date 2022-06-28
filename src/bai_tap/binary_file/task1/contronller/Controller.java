package bai_tap.binary_file.task1.contronller;

import bai_tap.binary_file.task1.service.ServiceImpl;

import java.util.Scanner;

public class Controller {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        ServiceImpl service = new ServiceImpl();
        System.out.println("---------PRODUCT MANAGER---------");
        String choose = "";
        do {
            System.out.println("1. add." +
                    "\n2. display." +
                    "\n3. search." +
                    "\n4. exit.");
            System.out.println("Enter your choice:");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.add();
                    break;
                case "2":
                    service.display();
                    break;
                case "3":
                    service.search();
                    break;
                case "4":
                    System.out.println("-----End-----");
                    break;
                default:
                    System.out.println("just choice from 1 to 4.");
            }
        } while (choose != "4");
    }
}
