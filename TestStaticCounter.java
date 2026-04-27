// Class with static variable
class MyClass {
    static int cnt = 0;  // static variable

    // Constructor
    MyClass() {
        cnt++;  // increment when object is created
    }

    // Method to display count
    void displayCount() {
        System.out.println("Number of objects created: " + cnt);
    }
}

// Driver class
public class TestStaticCounter {
    public static void main(String[] args) {

        // Creating objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Display count using any object
        obj1.displayCount();
    }
}