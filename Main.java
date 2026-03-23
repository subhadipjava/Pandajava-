import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void input(double c, String name) {
        cost = c;
        companyName = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tender[] t = new Tender[5];

        // Input for 5 tenders
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();

            System.out.print("Enter company name for tender " + (i + 1) + ": ");
            String name = sc.next();

            System.out.print("Enter cost for tender " + (i + 1) + ": ");
            double cost = sc.nextDouble();

            t[i].input(cost, name);
        }

        // Find minimum cost tender
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }

        // Display result
        System.out.println("\nCompany with minimum cost: " + minCompany);
        System.out.println("Minimum Cost: " + minCost);

        sc.close();
    }
}