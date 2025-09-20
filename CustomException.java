// 9_ExceptionHandling/CustomException.java
class MyException extends Exception {
    public MyException(String msg){ super(msg); }
}
public class CustomException {
    public static void main(String[] args) {
        try{ throw new MyException("Custom Error!"); }
        catch(MyException e){ System.out.println(e.getMessage()); }
    }
}
