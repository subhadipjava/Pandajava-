class Student {
    String name;
    int age;
  Student() {
        name = "Mota";
        age = 6;
        System.out.println("Default Constructor Called");
    }
 Student(String n) {
        name = n;
        age = 0;
        System.out.println("Constructor with one parameter called");
    }
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Constructor with two parameters called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();            
        Student s2 = new Student("Subhadip",21);     
        Student s3 = new Student("Jyoti", 20); 

        s1.display();
        s2.display();
        s3.display();
    }
}