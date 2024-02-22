package dto;

import model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDTO {
    private static final File file = new File("data/student.csv");

    public static List<Student> readFile() {
        List<Student> studentsInFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(","); // [1,Linh,Nam,3.5] , [2, Toan, Nam, 4.5]
                Student student = new Student(Integer.parseInt(data[0]),data[1], data[2], Double.parseDouble(data[3]));
                // new Student(1, Linh, Nam, 3.5), new Student(2, Toan, Nam, 3.5)
                studentsInFile.add(student);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentsInFile;
    }

    public static void writeFile(List<Student> listWriteFile) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            for (Student s: listWriteFile) {
                data += s.getId() + "," + s.getName() + "," + s.getGender() + "," + s.getScore() + "\n";
            }
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
