// 6_OOP/ClassesObjects.java
class Person {
    String name;
    int age;
    void display() { System.out.println("Name: "+name+", Age: "+age); }
}
public class ClassesObjects {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice"; p1.age = 25;
        p1.display();
    }
}
