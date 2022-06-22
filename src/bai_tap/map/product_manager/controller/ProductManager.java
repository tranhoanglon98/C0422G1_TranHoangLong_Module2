package bai_tap.map.product_manager.controller;

import bai_tap.map.product_manager.model.Product;
import bai_tap.map.product_manager.service.IProduct;
import bai_tap.map.product_manager.service.IProductManager;
import bai_tap.map.product_manager.utility.Ascending;
import bai_tap.map.product_manager.utility.Descending;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager implements IProductManager, IProduct {
    static ArrayList<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public boolean checkId(int id) {
        for (Product p : productList) {
            if (p.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add() {
        System.out.println("-------------------------------------");
        int id;
        do {
            System.out.println("Enter product id:");
            id = Integer.parseInt(scanner.nextLine());
            if (checkId(id)) {
                System.out.println(id + " already exist, enter again:");
            }
        } while (checkId(id));
        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.println("Enter price:");
        double price = Double.parseDouble(scanner.nextLine());
        productList.add(new Product(id, productName, price));
        System.out.println("..............Added..............");
    }

    @Override
    public void editById() {
        System.out.println("-------------------------------------");
        int id;
        do {
            System.out.println("Enter product id that you want to edit:");
            id = Integer.parseInt(scanner.nextLine());
            if (!checkId(id)) {
                System.out.println(id + " does not exist, enter again: ");
            }
        } while (!checkId(id));

        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println("Enter information you want to change:");
                int newID;
                do {
                    System.out.println("Enter product id:");
                    newID = Integer.parseInt(scanner.nextLine());
                    if (checkId(newID)) {
                        System.out.println(newID + " already exist, enter again:");
                    }
                } while (checkId(newID));
                System.out.println("Enter product name");
                p.setName(scanner.nextLine());
                System.out.println("Enter price:");
                p.setPrice(Double.parseDouble(scanner.nextLine()));
                System.out.println("..............Edited..............");
            }
        }
    }

    @Override
    public void deleteById() {
        System.out.println("-------------------------------------");
        int id;
        do {
            System.out.println("Enter product id that you want to delete:");
            id = Integer.parseInt(scanner.nextLine());
            if (!checkId(id)) {
                System.out.println(id + " does not exist, enter again: ");
            }
        } while (!checkId(id));
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
        System.out.println("..............Deleted..............");
    }

    @Override
    public void display() {
        System.out.println("-------------------------------------");
        System.out.println("product list:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void searchById() {
        System.out.println("-------------------------------------");
        int id;
        do {
            System.out.println("Enter product id that you want to search:");
            id = Integer.parseInt(scanner.nextLine());
            if (!checkId(id)) {
                System.out.println(id + " does not exist, enter again: ");
            }
        } while (!checkId(id));
        for (Product p : productList) {
            if (p.getId() == id) {
                System.out.println(p);
            }
        }
    }

    @Override
    public void sort() {
        System.out.println("-------------------------------------");
        System.out.println("choose your options:" +
                "\n1. Ascending" +
                "\n2. Descending");
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice != 1 && choice != 2) {
                System.out.println("just choose 1 or 2, choose again:");
            }
        } while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                Collections.sort(productList, new Ascending());
                break;
            case 2:
                Collections.sort(productList, new Descending());
                break;
        }
        System.out.println("..............Sorted..............");
    }

    @Override
    public void choose() {
        int choose;
        do {
            System.out.println("1. add" +
                    "\n2. Edit" +
                    "\n3. Delete" +
                    "\n4. Display" +
                    "\n5. Search" +
                    "\n6. Sort" +
                    "\n7. Exit");
            System.out.println("Enter your choice:");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    add();
                    break;
                case 2:
                    editById();
                    break;
                case 3:
                    deleteById();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    searchById();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    System.out.println(".........End.........");
                    break;
                default:
                    System.out.println("just choose from 1 to 7, choose again.");
            }
        } while (choose != 7);
    }
}
