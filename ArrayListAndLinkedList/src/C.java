import java.util.*;
import java.util.LinkedList;

public class C {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        System.out.println(stack.pop()); //4
//        System.out.println("Size " + stack.size());
//
//        System.out.println(stack.pop()); //3
//        System.out.println("Size " + stack.size());
//
//        System.out.println(stack.peek()); //3
//        System.out.println("Size " + stack.size());
//        System.out.println(stack.get(0));
//        for (Integer item: stack) {
//            System.out.println(item);
//        }


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        System.out.println(queue.poll());
//        System.out.println("Size: " + queue.size());
//
//        System.out.println(queue.poll());
//        System.out.println("Size: " + queue.size());

//        Queue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);
//        queue.add(3);
//        queue.add(5);
//        queue.add(7);
//        queue.add(2);
//        System.out.println(queue.poll());

        ArrayDeque<Integer> dequeue = new ArrayDeque<>();
        dequeue.addLast(1);
        dequeue.addFirst(2);
        dequeue.addLast(3); // 2 1 3
        System.out.println(dequeue.getFirst());


        Set<Integer> set = new HashSet<>();
        int[] arr = {0, 1, 2, 4, 5};
        System.out.println(arr[23]);

//        Map<String, Integer> map = new HashMap<>();
//        map.put("SoHai", 2);
//
//        Map<String, Map<String, Integer>> map1 = new HashMap<>();
//        map1.put("a", map);
        // John    521894
        // Lisa    5211234
        // Sandra  5219655
    }
}

