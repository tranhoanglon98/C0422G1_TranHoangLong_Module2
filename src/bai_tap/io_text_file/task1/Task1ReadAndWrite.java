package bai_tap.io_text_file.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task1ReadAndWrite {
    public static List<String> readFile(String sourceFile) {
        List<String> list = new ArrayList<>();
        File file = new File(sourceFile);
        FileReader fileReader;
        BufferedReader br;
        String string;
        try {
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            while ((string = br.readLine()) != null) {
                list.add(string);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File source không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(List<String> list, String targetFile) {
        File file = new File(targetFile);
        FileWriter fileWriter;
        BufferedWriter bw;
        int characters = 0;
        try {
            fileWriter = new FileWriter(file, true);
            bw = new BufferedWriter(fileWriter);
            for (String s : list) {
                bw.write(s);
                bw.newLine();
                characters += s.length();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("file target không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("số ký tự trong tệp : " + characters);
    }
}
