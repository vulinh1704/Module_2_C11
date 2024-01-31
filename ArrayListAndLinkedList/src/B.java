import java.util.LinkedList;

public class B {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.add(2);
        linkedList.add(3);
//        linkedList.remove()
//        linkedList.remove(2);
        linkedList.set(2, 10);
        System.out.println(linkedList.get(1));
//        for (Integer e: linkedList) {
//            System.out.println(e);
//        }
    }
}
