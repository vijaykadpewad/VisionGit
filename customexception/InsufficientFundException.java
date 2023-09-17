package customexception;

import java.util.Scanner;

public class InsufficientFundException extends RuntimeException {
    public InsufficientFundException(String message) {
        super(message);
    }
}
class AccountBalance {
    private int balance = 20000;
    int getBalance() {
        return balance;
    }
    public void withdraw(int amount) {
        if (amount > balance) {
            throw new InsufficientFundException("sorry you do not have sufficient balance in your account");
        } else {
            balance = balance - amount;

        }
    }
}

class MainTest {
    public static void main(String[] args) {
        AccountBalance accountBalance = new AccountBalance();
        System.out.println("current balance is>>" + accountBalance.getBalance());
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a amount to withdraw");
        int amount = scanner.nextInt();

        accountBalance.withdraw(amount);
        System.out.println("Remaining balance is>>" + accountBalance.getBalance());

    }
}