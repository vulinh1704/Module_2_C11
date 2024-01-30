//class ArrayList<E> { // generic
//    private Object[] listE = new Object[10];
//    int size;
//    public ArrayList() {
//        size = 0;
//    }
//
//    public void add(E e) {
//        listE[size] = e;
//        size++;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(5);
//    }
//}

import java.util.ArrayList;

public class A {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
//        System.out.println(arrayList.get(0));
//        System.out.println(arrayList.size());
//        arrayList.remove(1);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        arrayList.set(2, 5);
        for (Integer item: arrayList) {
            System.out.println(item);
        }

    }
}
