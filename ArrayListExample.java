// 10_Collections/ArrayListExample.java
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple"); fruits.add("Banana"); fruits.add("Mango");
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
