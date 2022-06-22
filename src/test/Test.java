package test;

import bai_tap.map.product_manager.model.Product;
import bai_tap.map.product_manager.utility.Descending;

import java.util.ArrayList;
import java.util.Collections;


public class Test {
    public static void main(String[] args) {
        ArrayList<Product> students = new ArrayList<>();
        students.add(new Product());
        students.add(new Product());
        students.add(new Product());
        students.add(new Product());

        Collections.sort(students,new Descending());
    }


































































}
