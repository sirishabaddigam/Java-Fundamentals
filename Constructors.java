// 6_OOP/Constructors.java
class Student {
    String name;
    int roll;
    Student(String name, int roll){ this.name=name; this.roll=roll; }
    void display(){ System.out.println("Name: "+name+", Roll: "+roll); }
}
public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 101);
        s1.display();
    }
}
