import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(14, "Linh");
        map.put(2, "Cong");
        System.out.println(map.get(14));

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(12, new Student(12, "Linh"));
        studentMap.put(131, new Student(131, "Cong"));

        Set<Integer> keys = studentMap.keySet(); // 12 131
        for (Integer item : keys) {
            System.out.println(studentMap.get(item)); // 12
        }

//        studentMap.remove(12);
//        System.out.println("Sau xoa: ");
        studentMap.replace(131, new Student(131, "Huy"));
        System.out.println("Sau sua: ");
        Set<Integer> keys2 = studentMap.keySet();
        for (Integer item : keys2) {
            System.out.println(studentMap.get(item));
        }

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Linh");
//        map.put(2, "Linh");

        Map<Integer, String> map1 = new LinkedHashMap<>();

        // 1 1 1 2 2 3 4 3 5
        // (1,3) (2,2)
        // Cho 1 mảng các số nguyên [1 1 1 2 2 3 4 3 5]. Đếm số lần xuất hiện của các số trong dãy.
    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
