class OverloadDemo {
  void add(int a) {
        System.out.println("Value: " + a);
    }
  void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

 void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
  obj.add(5);
 obj.add(5, 10);
  obj.add(5, 10, 15);
    }
}