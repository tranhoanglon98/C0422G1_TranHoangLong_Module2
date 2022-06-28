package bai_tap.binary_file.task1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String manufacture;
    private double price;
    private String othersDescription;


    public Product() {
    }

    public Product(int code, String name, String manufacture, double price, String othersDescription) {
        this.code = code;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.othersDescription = othersDescription;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOthersDescription() {
        return othersDescription;
    }

    public void setOthersDescription(String othersDescription) {
        this.othersDescription = othersDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", othersDescription='" + othersDescription + '\'' +
                '}';
    }
}
