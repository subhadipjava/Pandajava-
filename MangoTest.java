// Interface
interface Mango {
    void taste();
    void color();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter mango tastes slightly sour.");
    }

    public void color() {
        System.out.println("Winter mango color is light green.");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer mango tastes sweet.");
    }

    public void color() {
        System.out.println("Summer mango color is yellow.");
    }
}

// Changed public class name
public class MangoTest {
    public static void main(String[] args) {
        Mango w = new Winter();
        Mango s = new Summer();

        System.out.println("Winter Mango:");
        w.taste();
        w.color();

        System.out.println("\nSummer Mango:");
        s.taste();
        s.color();
    }
}