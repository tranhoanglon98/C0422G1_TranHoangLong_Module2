package bai_tap.io_text_file.task2;

import java.util.List;

public class
Run {
    public static void main(String[] args) {
        List<Countries> list = Task2ReadAndWrite.readFile("src/bai_tap/io_text_file/task2/task2_source_file.csv");
        for (Countries c : list) {
            System.out.println(c);
        }
    }
}
