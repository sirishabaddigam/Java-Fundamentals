// 9_ExceptionHandling/MultipleCatch.java
public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
        }catch(ArithmeticException e){ System.out.println("Arithmetic error"); }
        catch(ArrayIndexOutOfBoundsException e){ System.out.println("Array error"); }
        finally{ System.out.println("Done"); }
    }
}
