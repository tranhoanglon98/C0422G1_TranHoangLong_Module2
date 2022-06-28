package bai_tap.binary_file.task1.utillity;

import bai_tap.binary_file.task1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinaryFile {
    public static List<Product> readBinaryFile(String pathFile) {
        List<Product> products = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if(file.length()>0) {
                fileInputStream = new FileInputStream(pathFile);
                objectInputStream = new ObjectInputStream(fileInputStream);
                products = (List<Product>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(file.length()>0) {
                    fileInputStream.close();
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return products;
    }

    public static void writeBinaryFile(List<Product> products, String pathFile) {
        FileOutputStream file = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            file = new FileOutputStream(pathFile);
            objectOutputStream = new ObjectOutputStream(file);
            objectOutputStream.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                file.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
