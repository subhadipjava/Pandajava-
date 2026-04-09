interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}class Account implements Bank {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class BankSystem extends Customer implements Bank {

    Account acc;

    BankSystem(String name, int customerId, int accNo, double balance) {
        super(name, customerId);
        acc = new Account(accNo, balance);
    }

    public void deposit(double amount) {
        acc.deposit(amount);
    }

    public void withdraw(double amount) {
        acc.withdraw(amount);
    }

    public void checkBalance() {
        acc.checkBalance();
    }

    void displayAccount() {
        System.out.println("Account Number: " + acc.accountNumber);
    }

    public static void main(String[] args) {
        BankSystem obj = new BankSystem("Rahul", 101, 5001, 10000);

        obj.displayCustomer();
        obj.displayAccount();

        obj.deposit(2000);
        obj.withdraw(1500);
        obj.checkBalance();
    }
}