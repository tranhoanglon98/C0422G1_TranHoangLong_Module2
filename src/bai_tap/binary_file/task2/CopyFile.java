package bai_tap.binary_file.task2;

import bai_tap.binary_file.task1.model.Product;
import bai_tap.binary_file.task1.utillity.ReadAndWriteBinaryFile;

import java.io.File;
import java.util.List;

public class CopyFile {
    public static void copyBinaryFile(String sourceFile,String targetFile){
       List<Product> products = ReadAndWriteBinaryFile.readBinaryFile(sourceFile);
       ReadAndWriteBinaryFile.writeBinaryFile(products,targetFile);
    }

    public static void main(String[] args) {
        final String SOURCE_FILE = "src/bai_tap/binary_file/task1/utillity/products_data.dat";
        final String TARGET_FILE = "src/bai_tap/binary_file/task2/target_file.dat";
        copyBinaryFile(SOURCE_FILE,TARGET_FILE);
        File file =new File(TARGET_FILE);
        System.out.println("số byte trong tệp: " + file.length());
    }


}
