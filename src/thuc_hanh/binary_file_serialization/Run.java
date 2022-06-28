package thuc_hanh.binary_file_serialization;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "long", "hue"));
        students.add(new Student(2, "long1", "hue"));
        students.add(new Student(3, "long2", "hue"));
        students.add(new Student(4, "long3", "hue"));
        ReadAndWriteBinaryFile.writeBinaryFile("src/thuc_hanh/binary_file_serialization/binary_source_file.dat", students);
        List<Student> studentList = ReadAndWriteBinaryFile.readBinaryFile("src/thuc_hanh/binary_file_serialization/binary_source_file.dat");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
