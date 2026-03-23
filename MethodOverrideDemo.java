class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound() method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.sound();  
        d.sound();  
    }
}