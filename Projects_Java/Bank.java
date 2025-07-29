import java.util.Scanner;

// Bank Account Management System using Java Inheritance
public class Bank {

    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 1000);
        FDAccount fd = new FDAccount(103, 10000, 12000, 12);

        Scanner s = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- Bank Menu -----");
            System.out.println("1. Display Savings Account Details");
            System.out.println("2. Deposit to Savings");
            System.out.println("3. Withdraw from Savings");
            System.out.println("4. Display Savings Balance");
            System.out.println("5. Calculate Savings Interest");
            System.out.println("6. Display Checking Account Details");
            System.out.println("7. Deposit to Checking");
            System.out.println("8. Withdraw from Checking");
            System.out.println("9. Display Current Checking Balance");
            System.out.println("10. Display FD Details");
            System.out.println("11. Display Current FD Balance");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            int accNo;
            switch (choice) {
                case 1:
                savings.displayAccountDetails();
                break;
                case 2:
                    System.out.print("Enter Savings Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == savings.acc) {
                        System.out.print("Enter amount to deposit: ");
                        double depSav = s.nextDouble();
                        savings.deposit(depSav);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Savings Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == savings.acc) {
                        System.out.print("Enter amount to withdraw: ");
                        double withSav = s.nextDouble();
                        savings.withdraw(withSav);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Savings Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == savings.acc) {
                        savings.displayBalance();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Savings Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == savings.acc) {
                        savings.calculateInterest();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 6:
                    checking.displayAccountDetails();
                    break;
                case 7:
                    System.out.print("Enter Checking Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == checking.acc) {
                        System.out.print("Enter amount to deposit: ");
                        double depChk = s.nextDouble();
                        checking.deposit(depChk);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 8:
                    System.out.print("Enter Checking Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == checking.acc) {
                        System.out.print("Enter amount to withdraw: ");
                        double withChk = s.nextDouble();
                        checking.withdraw(withChk);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 9:
                    System.out.print("Enter Checking Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == checking.acc) {
                        checking.displayBalance();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 10:
                    fd.displayFDDetails();
                    break;
                case 11:
                    System.out.print("Enter Fixed Deposit Account Number: ");
                    accNo = s.nextInt();
                    if (accNo == fd.acc) {
                        fd.displayBalance();
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;
                case 12:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 9);
    }
}

class Bank1 {
    int acc;
    double bal;

    void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount + " to account number: " + acc);
        System.out.println("-------------------------------");
    }

    void withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount + " from account number: " + acc);
            System.out.println("-------------------------------");
        } else {
            System.out.println("Insufficient balance.");
            System.out.println("-------------------------------");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + acc);
        System.out.println("Current Balance: " + bal);
        System.out.println("------------------------------");
    }
}

class SavingsAccount extends Bank1 {
    double interestRate;

    SavingsAccount(int acc, double bal, double interestRate) {
        this.acc = acc;
        this.bal = bal;
        this.interestRate = interestRate;
    }

    void calculateInterest() {
        double interest = bal * interestRate / 100;
        System.out.println("Interest earned: " + interest + " for account number: " + acc + " for the current balance: " + bal);
        System.out.println("-------------------------------");
    }

    void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + acc);
        System.out.println("Balance: " + bal);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("-------------------------------");
    }
}

class CheckingAccount extends Bank1 {
    double overdraftLimit;

    CheckingAccount(int acc, double bal, double overdraftLimit) {
        this.acc = acc;
        this.bal = bal;
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void deposit(double amount) {
        bal += amount;
        System.out.println("Deposited: " + amount + " to account number: " + acc);
        System.out.println("-------------------------------");
    }

    @Override
    void withdraw(double amount) {
        if (amount <= bal + overdraftLimit) {
            bal -= amount;
            System.out.println("Withdrawn: " + amount + " from account number: " + acc);
            System.out.println("-------------------------------");
        } else {
            System.out.println("Overdraft limit exceeded.");
            System.out.println("-------------------------------");
        }
    }

    void displayAccountDetails() {
        System.out.println("Checking Account Details:");
        System.out.println("Account Number: " + acc);
        System.out.println("Balance: " + bal);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("-------------------------------");
    }
}

class FDAccount extends Bank1 {
    double maturityAmount;
    int tenure;

    FDAccount(int acc, double bal, double maturityAmount, int tenure) {
        this.acc = acc;
        this.bal = bal;
        this.maturityAmount = maturityAmount;
        this.tenure = tenure;
    }

    public FDAccount() {
    }

    @Override
    void displayBalance() {
        System.out.println("Account Number: " + acc);
        System.out.println("Current Balance: " + bal);
        System.out.println("------------------------------");
    }
    void displayFDDetails() {
        System.out.println("FD Account Details:");
        System.out.println("Account Number: " + acc);
        System.out.println("Balance: " + bal);
        System.out.println("Maturity Amount: " + (bal + (bal * 0.05 * tenure / 100)));
        System.out.println("Tenure: " + tenure + " months");
        System.out.println("-------------------------------");
    }
}