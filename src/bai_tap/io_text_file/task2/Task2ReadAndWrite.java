package bai_tap.io_text_file.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2ReadAndWrite {
    public static List<Countries> readFile(String sourceFile) {
        List<Countries> list = new ArrayList<>();
        File file = new File(sourceFile);
        FileReader fileReader;
        BufferedReader br;
        String string;
        try {
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            while ((string = br.readLine()) != null) {
                String[] array = string.split(",");
                list.add(new Countries(Integer.parseInt(array[0]),array[1], array[2]));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("source file không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
