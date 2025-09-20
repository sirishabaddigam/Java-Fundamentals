// 5_Strings/StringBuilderExample.java
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.insert(6, "Java ");
        System.out.println(sb);
        sb.delete(6, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println("Reversed: " + sb);
    }
}
