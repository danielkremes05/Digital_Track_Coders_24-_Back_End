package adapter.adapters;

import adapter.example.JarCurrentAccountTransactions;

import java.math.BigDecimal;

// This class acts as an adapter for JarCurrentAccountTransactions
public class JarCurrentAccountTransactionsAdpater {

    // This is the instance of JarCurrentAccountTransactions that this adapter wraps
    private JarCurrentAccountTransactions jarAccount;

    // Constructor that initializes the jarAccount with the provided JarCurrentAccountTransactions instance
    public JarCurrentAccountTransactionsAdpater(JarCurrentAccountTransactions jarAccount) {
        this.jarAccount = jarAccount;
    }

    // Method to withdraw a specified amount from the current account
    // Throws IllegalAccessException if the balance is insufficient
    public void withdraw(BigDecimal valueDesired) throws IllegalAccessException {
        // Checks if the balance is sufficient for the withdrawal
        if (jarAccount.validateBalance(valueDesired)) {
            // Delegates the withdraw operation to the jarAccount
            jarAccount.withdraw(valueDesired);
        } else {
            // Throws an exception if the balance is not enough
            throw new IllegalAccessException("balance insufficient");
        }

        // Prints a message indicating a withdrawal operation
        System.out.println("Withdraw.....!");
    }

    // Method to deposit a specified amount into the current account
    public void deposit(BigDecimal value) {
        // Delegates the deposit operation to the jarAccount
        jarAccount.deposit(value);
    }
}
