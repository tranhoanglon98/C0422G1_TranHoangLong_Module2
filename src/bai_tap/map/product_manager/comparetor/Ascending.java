package bai_tap.map.product_manager.comparetor;

import bai_tap.map.product_manager.Product;

import java.util.Comparator;

public class Ascending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() - o2.getPrice() > 0) {
            return 1;
        } else if (o1.getPrice() - o2.getPrice() < 0) {
            return -1;
        } else return 0;
    }
}
