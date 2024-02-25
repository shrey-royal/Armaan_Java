class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added. Current balance: " + balance);
    }
}

class CurrentAccount extends SavingsAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double interestRate, double overdraftLimit) {
        super(accountNumber, balance, interestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}


public class Multilevel {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA001", 1000, 5);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.addInterest();
        savingsAccount.displayBalance();

        CurrentAccount currentAccount = new CurrentAccount("CA001", 2000, 0, 1000);
        currentAccount.deposit(300);
        currentAccount.withdraw(2500);
        currentAccount.displayBalance();
    }
}
