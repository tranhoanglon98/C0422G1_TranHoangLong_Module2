package bai_tap.generic_stack_queue.demerging;

import java.time.LocalDate;

public class Employees implements Comparable<Employees> {
    private String name;
    private boolean gender;
    private LocalDate dayOfBird;

    public Employees(String name) {
        this.name = name;
    }

    public Employees(String name, boolean gender, LocalDate dayOfBird) {
        this.name = name;
        this.gender = gender;
        this.dayOfBird = dayOfBird;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDayOfBird() {
        return dayOfBird;
    }

    public void setDayOfBird(LocalDate dayOfBird) {
        this.dayOfBird = dayOfBird;
    }

    public String getGender() {
        return this.gender ? "Male" : "Female";
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", gender=" + getGender() +
                ", dayOfBird=" + dayOfBird +
                '}';
    }

    @Override
    public int compareTo(Employees o) {
        return this.getDayOfBird().compareTo(o.getDayOfBird());
    }

}
