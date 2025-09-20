// 10_Collections/HashMapExample.java
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> marks = new HashMap<>();
        marks.put("Alice",90); marks.put("Bob",85);
        System.out.println(marks);
        System.out.println("Alice's marks: " + marks.get("Alice"));
    }
}
