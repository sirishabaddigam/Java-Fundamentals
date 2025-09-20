// 10_Collections/LinkedListExample.java
import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A"); list.add("B"); list.add("C");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
