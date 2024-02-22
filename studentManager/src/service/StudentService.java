package service;

import dto.StudentDTO;
import model.Student;
import java.util.List;


public class StudentService implements IService<Student> {
    private List<Student> list = StudentDTO.readFile();

    // list in Java = 0 => 2
    @Override
    public void add(Student student) {
        list.add(student); // list in Java => 2 + 1 = 3
        // list in File = 2
        StudentDTO.writeFile(list);
    }

    @Override
    public void delete(int id) {
        int index = findById(id);
        if (index == -1) {
            System.out.println("K co sinh vien nay");
        } else {
            list.remove(index);
            StudentDTO.writeFile(list);
        }
    }

    @Override
    public void edit(int id, Student student) {
        int index = findById(id);
        if (index == -1) {
            System.out.println("K co sinh vien nay");
        } else {
            list.set(index, student);
            StudentDTO.writeFile(list);
        }
    }

    @Override
    public List<Student> findAll() {
        return list;
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}



// 1, Linh, C11, Nam
// dto (data transfer object)
