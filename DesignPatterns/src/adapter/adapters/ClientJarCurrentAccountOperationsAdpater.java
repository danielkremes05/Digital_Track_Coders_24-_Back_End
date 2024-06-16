package adapter.adapters;

import java.math.BigDecimal;

// This class acts as an adapter for current account operations
public class ClientJarCurrentAccountOperationsAdpater {

    // This is the instance of the JarCurrentAccountTransactionsAdapter that this class wraps
    private JarCurrentAccountTransactionsAdpater accountAdapter;

    // Constructor that initializes the accountAdapter with the provided JarCurrentAccountTransactionsAdapter instance
    public ClientJarCurrentAccountOperationsAdpater(JarCurrentAccountTransactionsAdpater accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    // Method to withdraw a specified amount from the current account
    // Throws IllegalAccessException if the withdrawal is not allowed
    public void withdraw(BigDecimal valueDesired) throws IllegalAccessException {
        // Delegates the withdraw operation to the accountAdapter
        accountAdapter.withdraw(valueDesired);
    }

    // Method to deposit a specified amount into the current account
    public void deposit(BigDecimal valueDesired) {
        // Delegates the deposit operation to the accountAdapter
        accountAdapter.deposit(valueDesired);
    }
}
