// 6_OOP/AbstractionInterface.java
interface Animal {
    void sound();
}
class Dog implements Animal {
    public void sound(){ System.out.println("Dog barks"); }
}
public class AbstractionInterface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
