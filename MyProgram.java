
    
class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MyProgram {
    public static void main(String[] args) {
        Student s1 = new Student("Subha", 21);
        Student s2 = new Student("soumya", 20);

        s1.display();
        System.out.println();
        s2.display();
    }
}
