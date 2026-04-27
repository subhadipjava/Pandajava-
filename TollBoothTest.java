// TollBooth class
class TollBooth {
    private int totalCars = 0;
    private int unpaidCars = 0;
    private int cashCollected = 0;

    // Method for car that pays toll
    void payingCar() {
        totalCars++;
        cashCollected += 50; // Rs. 50 per car
    }

    // Method for car that does not pay
    void nonPayingCar() {
        totalCars++;
        unpaidCars++;
    }

    // Display results
    void display() {
        System.out.println("Total number of cars passed: " + totalCars);
        System.out.println("Number of cars not paid: " + unpaidCars);
        System.out.println("Total cash collected: Rs. " + cashCollected);
    }
}

// Driver class
public class TollBoothTest {
    public static void main(String[] args) {

        TollBooth tb = new TollBooth();

        // Simulating cars
        tb.payingCar();
        tb.payingCar();
        tb.nonPayingCar();
        tb.payingCar();
        tb.nonPayingCar();

        // Display final report
        tb.display();
    }
}
