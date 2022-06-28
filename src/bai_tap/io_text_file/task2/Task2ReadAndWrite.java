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
                list.add(new Countries(Integer.parseInt(array[0]), array[1], array[2]));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("source file không tồn tại");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static List<String> readDataFile(String sourceFile) {
        List<String> strings = new ArrayList<>();
        File file = new File(sourceFile);
        FileReader fileReader = null;
        BufferedReader br = null;
        try {
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return strings;
    }


    public static List<Countries> readCountries(String sourceFile) {
        List<Countries> countries = new ArrayList<>();
        List<String> strings = readDataFile(sourceFile);
        for (String s : strings) {
            String[] array = s.split(",");
            countries.add(new Countries(Integer.parseInt(array[0]), array[1], array[2]));
        }
        return countries;
    }


    private static void write(List<String> strings, String targetFile, boolean append) {
        File file = new File(targetFile);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            fileWriter = new FileWriter(file);
            bw = new BufferedWriter(fileWriter);
            for (String s : strings) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void writeCountries(List<Countries> countries, String targetFile, boolean append) {
        List<String> strings = new ArrayList<>();
        for (Countries c : countries) {
            strings.add(c.getInfoToCsv());
        }
        write(strings, targetFile, append);
    }

}
