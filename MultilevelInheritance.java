// 7_Inheritance/MultilevelInheritance.java
class A { void msg(){ System.out.println("A"); } }
class B extends A { void msgB(){ System.out.println("B"); } }
class C extends B { void msgC(){ System.out.println("C"); } }
public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.msg(); obj.msgB(); obj.msgC();
    }
}
