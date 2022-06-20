package bai_tap.generic_stack_queue.demerging;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;


public class Demerging {
    public static void main(String[] args) {

        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("long", true, LocalDate.of(2000, 2, 5)));
        list.add(new Employees("trang", false, LocalDate.of(2001, 5, 6)));
        list.add(new Employees("thái", true, LocalDate.of(2022, 8, 9)));
        list.add(new Employees("duyên", false, LocalDate.of(2099, 5, 4)));
        list.add(new Employees("tài", true, LocalDate.of(1202, 8, 5)));
        Collections.sort(list);
        for (Employees e : list) {
            System.out.println(e);
        }
        System.out.println("------------------------------------------------------");
        ArrayDeque<Employees> male = new ArrayDeque<>();
        ArrayDeque<Employees> female = new ArrayDeque<>();
        for (Employees e : list) {
            if (e.getGender().equals("Male")) {
                male.add(e);
            } else {
                female.add(e);
            }
        }
        list.clear();
        while (!female.isEmpty()) {
            list.add(female.poll());
        }
        while (!male.isEmpty()) {
            list.add(male.poll());
        }
        for (Employees e : list) {
            System.out.println(e);
        }
    }
}
