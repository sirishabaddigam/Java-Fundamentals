// 9_ExceptionHandling/TryCatchExample.java
public class TryCatchExample {
    public static void main(String[] args) {
        try{
            int a = 10, b = 0;
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Finally block executed");
        }
    }
}
