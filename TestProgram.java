class Demo {
    // Zero-argument constructor
    Demo() {
        System.out.println("Zero-argument constructor is called");
    }

    void display() {
        System.out.println("Method inside the class");
    }
}

public class TestProgram {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}