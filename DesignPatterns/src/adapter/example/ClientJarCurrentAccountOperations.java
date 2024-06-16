package adapter.example;

import java.math.BigDecimal;

// This class provides client operations for a current account using JarCurrentAccountTransactions
public class ClientJarCurrentAccountOperations {

    // This is the instance of JarCurrentAccountTransactions that this client class wraps
    private JarCurrentAccountTransactions jocc;

    // Constructor that initializes the jocc with the provided JarCurrentAccountTransactions instance
    public ClientJarCurrentAccountOperations(JarCurrentAccountTransactions jocc) {
        this.jocc = jocc;
    }

    // Method to validate if the balance is sufficient for the desired withdrawal amount
    // Returns true if the balance is sufficient, false otherwise
    public boolean validateBalance(BigDecimal valueDesired) {
        return jocc.validateBalance(valueDesired);
    }

    // Method to withdraw a specified amount from the current account
    public void withdraw(BigDecimal valueDesired) {
        jocc.withdraw(valueDesired);
    }

    // Method to deposit a specified amount into the current account
    public void deposit(BigDecimal valueDesired) {
        jocc.deposit(valueDesired);
    }
}
