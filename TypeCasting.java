// 1_Basics/TypeCasting.java
public class TypeCasting {
    public static void main(String[] args) {
        int i = 10;
        double d = i; // implicit casting
        System.out.println("Implicit casting: " + d);

        double price = 99.99;
        int p = (int) price; // explicit casting
        System.out.println("Explicit casting: " + p);
    }
}
