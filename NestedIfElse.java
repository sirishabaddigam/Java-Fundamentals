// 2_ControlStatements/NestedIfElse.java
public class NestedIfElse {
    public static void main(String[] args) {
        int num = 25;
        if(num > 0) {
            if(num % 2 == 0) System.out.println("Positive Even");
            else System.out.println("Positive Odd");
        } else System.out.println("Non-positive number");
    }
}
