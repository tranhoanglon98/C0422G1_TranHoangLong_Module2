package bai_tap.io_text_file.task1;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<String> list =Task1ReadAndWrite.readFile("src/bai_tap/io_text_file/task1_source_file.csv");
        Task1ReadAndWrite.writeFile(list, "src/bai_tap/io_text_file/task1_target_file.csv");
    }
}
